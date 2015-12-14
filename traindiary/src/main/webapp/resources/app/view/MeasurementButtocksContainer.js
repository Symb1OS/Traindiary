Ext.define('app.view.MeasurementButtocksContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-buttocks',
    requires: [
    	  	 'app.view.MeasurementButtocksGrid',
    	  	 'app.view.MeasurementData',
    	  	 'app.controller.MeasurementDataButtocksController'
    ],
    controller: 'measurement-buttocks',
    
    title: 'Ягодицы',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-buttocks'},
    	{xtype : 'measurement-detail'}
    ]

})