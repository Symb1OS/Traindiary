Ext.define('app.view.StatisticContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.statistic',
	requires: [
		'app.view.StatisticMeasurementContainer'
	],
    
    title: 'Статистика',
    layout: {
        type: 'vbox',
        pack: 'start',
        align: 'stretch'
    },
    bodyPadding: 10,
    scrollable:true,
    defaults: {
        frame: true,
        margin: '0 0 10 0',
        bodyPadding: 10
    },
    items:[
    	{title: 'Посещения'},
    	{title: 'Питание'},
		{xtype: 'statistic-measurement'}
	]	
})