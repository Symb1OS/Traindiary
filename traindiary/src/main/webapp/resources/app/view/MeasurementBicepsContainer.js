Ext.define('app.view.MeasurementBicepsContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-biceps',
    requires: [
    	  	 'app.view.MeasurementBicepsGrid',
    	  	 'app.view.MeasurementData',
    	  	 'app.controller.MeasurementDataBicepsController'
    ],
    controller: 'measurement-biceps',
    
    title: 'Бицепс',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-biceps'},
    	{xtype : 'measurement-detail'}
    ]

})