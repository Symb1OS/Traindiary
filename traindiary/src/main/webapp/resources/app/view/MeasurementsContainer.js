Ext.define('app.view.MeasurementsContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurements',
    requires: [
    	'app.view.MeasurementWeightContainer'
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
    	{title: 'Шея'},
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