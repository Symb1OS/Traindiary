Ext.define('app.view.MeasurementNeckContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-neck',
    requires: [
    	  	 'app.view.MeasurementGridNeck',
    	  	 'app.view.MeasurementDataNeck',
    	  	 'app.controller.MeasurementDataNeckController'
    ],
    controller: 'measurement-neck',
    
    title: 'Шея',
    layout: 'border',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100
    },
    items:[
    	{xtype : 'measurement-grid-neck'},
    	{xtype : 'measurement-detail-neck'}
    ]

})