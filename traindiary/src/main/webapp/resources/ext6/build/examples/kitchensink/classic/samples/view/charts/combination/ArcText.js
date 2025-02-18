/**
 * Custom sprite that allows to put text along an arc.
 * 
 * The sprite works by subclassing the Instancing sprite, splitting the given
 * text into symbols and then positioning each symbol individually as an
 * instance of the Text sprite. Positions of symbols are determined based on
 * given arc properties, which are attributes of the instancing sprite itself.
 */
Ext.define('KitchenSink.view.ArcText', {
	alias : 'sprite.arctext',
	type : 'arctext',
	extend : 'Ext.draw.sprite.Instancing',

	config : {
		text : '',
		centerX : 0,
		centerY : 0,
		radius : 100,
		angle : -180,
		spacing : 3,
		textAlign : 'center',
		template : {
			type : 'text',
			text : ''
		}
	},

	startAngle : -Math.PI / 2,

	updateText : function(text) {
		var me = this;

		me.clearAll();

		if (!me.getSurface()) {
			// Can't get the bbox of a symbol at this point,
			// so postpone symbol sprites creation until render
			// when surface is surely available.
			me.pendingSymbols = text;
		} else {
			me.getTemplate();
			me.placeSymbols(text);
		}
	},

	placeSymbols : function(text) {
		var me = this, cx = me.getCenterX(), cy = me.getCenterY(), radius = me
				.getRadius(), textAlign = me.getTextAlign(), angle = me
				.getAngle()
				/ 180 * Math.PI, spacing = me.getSpacing(), twoPi = 2 * Math.PI, circumference = twoPi
				* radius, angleIncrement = 0, totalAngle = 0, ln = text.length, i, bbox, angularShift;

		for (i = 0; i < ln; i++) {
			angle += angleIncrement;
			me.createInstance({
						text : text[i],
						x : cx,
						y : cy + Math.sin(me.startAngle) * radius,
						// Have to specify the center of rotation manually
						// instead of letting it
						// be calculated automatically, which is the center of
						// the bounding
						// box of a sprite and in our case the center of a
						// letter. But because
						// glyphs dimensions are not the same this will result
						// in jumpy letters.
						rotationCenterX : cx,
						rotationCenterY : cy,
						rotationRads : angle - me.startAngle
					});
			// Can't simply place symbols at equal angle increments
			// as this will result in inconsistent spacing between symbols
			// because they may differ in width.
			// So converting the width of the symbol + spacing between symbols
			// to angle increment depending on the radius here.
			bbox = me.getBBoxFor(me.instances.length - 1, true);
			angleIncrement = (bbox.width + spacing) / circumference * twoPi;
			totalAngle += angleIncrement;
		}
		switch (textAlign) {
			case 'start' :
				angularShift = 0;
				break;
			case 'end' :
				angularShift = -totalAngle;
				break;
			case 'center' :
				angularShift = -totalAngle / 2;
				break;
		}
		me.setAttributes({
					rotationRads : me.attr.rotationRads + angularShift
				});
		// Apply the rotation set above. Otherwise changes will only
		// become visible on next rendered frame.
		me.applyTransformations();
	},

	render : function() {
		var me = this;
		if (me.pendingSymbols) {
			me.placeSymbols(me.pendingSymbols);
			delete me.pendingSymbols;
		}
		me.callParent(arguments);
	}

});