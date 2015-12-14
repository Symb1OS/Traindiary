Ext.define('app.view.MeasurementWeightContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-weight',
    requires: [
    	  	 'app.view.MeasurementGridWeight',
    	  	 'app.view.MeasurementDataWeight',
    	  	 'app.controller.MeasurementDataWeightController'
    ],
    controller: 'measurement-weight',
    
    title: 'Вес',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-weight'},
    	{xtype : 'measurement-detail-weight'}
    ]

})