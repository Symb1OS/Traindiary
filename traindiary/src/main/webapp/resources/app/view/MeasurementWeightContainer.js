Ext.define('app.view.MeasurementWeightContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-weight',
    requires: [
    	  	 'app.view.MeasurementGridWeight',
    	  	 'app.view.MeasurementData',
  		  	 'app.controller.MeasurementDataController'
    ],
    controller: 'measurement-data',
    
    title: 'Вес',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-weight'},
    	{xtype : 'measurement-detail'}
    ]

})