/**
 * This example shows how to chain two combo boxes together.
 */
Ext.define('KitchenSink.view.binding.ComboChaining', {
			extend : 'Ext.panel.Panel',
			xtype : 'binding-combo-chaining',
			// <example>
			otherContent : [{
						type : 'Store',
						path : 'classic/samples/store/Countries.js'
					}, {
						type : 'Store',
						path : 'classic/samples/store/CountryStates.js'
					}, {
						type : 'Model',
						path : 'classic/samples/model/tree/Country.js'
					}, {
						type : 'Model',
						path : 'classic/samples/model/State.js'
					}],
			bodyPadding : 10,
			// </example>

			width : 350,
			layout : 'anchor',
			defaults : {
				anchor : '-30'
			},

			referenceHolder : true,
			viewModel : true,

			title : 'Location',

			items : [{
						xtype : 'combo',
						fieldLabel : 'Country',
						reference : 'country',
						displayField : 'name',
						valueField : 'name',
						publishes : 'value',
						store : {
							type : 'countries'
						}
					}, {
						xtype : 'combo',
						fieldLabel : 'State',
						displayField : 'state',
						valueField : 'abbrev',
						queryMode : 'remote',
						forceSelection : true,
						bind : {
							visible : '{country.value}',
							filters : {
								property : 'country',
								value : '{country.value}'
							}
						},
						store : {
							type : 'country-states'
						}
					}]
		});
