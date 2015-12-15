Ext.define('app.view.MeasurementShouldersContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-shoulders',
    requires: [
    	  	 'app.view.MeasurementShouldersGrid',
    	  	 'app.view.MeasurementData',
		  	 'app.controller.MeasurementDataController'
    ],
    controller: 'measurement-data',
    
    title: 'Плечи',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-shoulders'},
    	{xtype : 'measurement-detail'}
    ]

})