Ext.define('KitchenSink.view.form.XmlFormController', {
			extend : 'Ext.app.ViewController',
			alias : 'controller.form-xml',

			onLoadClick : function() {
				this.getView().getForm().load({
							url : 'data/form/xml-form-data.xml',
							waitMsg : 'Loading...'
						});
			},

			onSubmitClick : function() {
				this.getView().getForm().submit({
							url : 'data/form/xml-form-errors.xml',
							submitEmptyText : false,
							waitMsg : 'Saving Data...'
						});
			}
		});
