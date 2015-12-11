Ext.define('app.view.MeasurementsContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurements',
    requires: [
   	 'app.view.MeasurementGridContainer',
   	 'app.view.MeasurementDetailContainer',
   	 'app.controller.MeasurementController'
    ],
	controller: 'measurement',
	
    title: 'Замеры',
    scrollable: true,
    layout: {
        type: 'vbox',
        pack: 'start',
        align: 'stretch'
    },
    defaults: {
        frame: true,
        margin: '0 0 10 0'
    },
    items:[
		{xtype: 'measurement-grid'},
		{xtype: 'measurement-detail'}
	]	
})