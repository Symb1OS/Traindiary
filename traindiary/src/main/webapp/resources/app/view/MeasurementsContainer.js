Ext.define('app.view.MeasurementsContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurements',
    requires: [
    	'app.view.MeasurementWeightContainer',
    	'app.view.MeasurementNeckContainer'
    ],
	
    title: 'Замеры',
    scrollable: true,
    layout: 'accordion',
    height: 500,
    defaults: {
        frame: true,
        margin: '0 0 10 0'
    },
    items:[
    	{xtype: 'measurement-weight'},
    	{xtype: 'measurement-neck'},
    	{title: 'Грудь'},
    	{title: 'Талия'},
    	{title: 'Ягодицы'},
    	{title: 'Бедро'},
    	{title: 'Икры'},
    	{title: 'Таз'},
    	{title: 'Бицепс'},
		{title: 'Предплечье'},
		{title: 'Плечи'}
	]	
})