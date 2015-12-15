Ext.define('app.view.MeasurementPelvisContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-pelvis',
    requires: [
    	  	 'app.view.MeasurementPelvisGrid',
    	  	 'app.view.MeasurementData',
    	  	 'app.controller.MeasurementDataController'
    ],
    controller: 'measurement-data',
    
    title: 'Таз',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-pelvis'},
    	{xtype : 'measurement-detail'}
    ]

})