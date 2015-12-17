Ext.define('app.view.MeasurementCaviarContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-caviar',
    requires: [
    	  	 'app.view.MeasurementCaviarGrid',
    	  	 'app.view.MeasurementData',
	  	  	 'app.controller.MeasurementDataController'
    ],
    controller: 'measurement-data',
    
    title: 'Икры',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-caviar'},
    	{xtype : 'measurement-detail'}
    ]

})