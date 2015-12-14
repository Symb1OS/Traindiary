Ext.define('app.view.MeasurementWaistContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-waist',
    requires: [
    	  	 'app.view.MeasurementWaistGrid',
    	  	 'app.view.MeasurementData',
    	  	 'app.controller.MeasurementDataWaistController'
    ],
    controller: 'measurement-waist',
    
    title: 'Талия',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-waist'},
    	{xtype : 'measurement-detail'}
    ]

})