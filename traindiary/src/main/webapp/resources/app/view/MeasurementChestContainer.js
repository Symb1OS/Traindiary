Ext.define('app.view.MeasurementChestContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-chest',
    requires: [
    	  	 'app.view.MeasurementChestGrid',
    	  	 'app.view.MeasurementData',
	  		 'app.controller.MeasurementDataController'
    ],
    controller: 'measurement-data',
    
    title: 'Грудь',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-chest'},
    	{xtype : 'measurement-detail'}
    ]

})