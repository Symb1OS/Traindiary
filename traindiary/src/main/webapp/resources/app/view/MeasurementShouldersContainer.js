Ext.define('app.view.MeasurementShouldersContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-shoulders',
    requires: [
    	  	 'app.view.MeasurementShouldersGrid',
    	  	 'app.view.MeasurementData',
    	  	 'app.controller.MeasurementDataShouldersController'
    ],
    controller: 'measurement-shoulders',
    
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