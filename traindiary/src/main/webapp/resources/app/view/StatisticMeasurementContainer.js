Ext.define('app.view.StatisticMeasurementContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.statistic-measurement',
    requires: [
    	'app.view.StatisticWeightChart',
    	'app.view.StatisticNeckChart',
    	'app.view.StatisticChestChart',
    	'app.view.StatisticWaistChart',
    	'app.view.StatisticButtocksChart',
    	'app.view.StatisticHipChart',
    	'app.view.StatisticCaviarChart',
    	'app.view.StatisticPelvisChart',
    	'app.view.StatisticBicepsChart',
    	'app.view.StatisticForearmChart',
    	'app.view.StatisticShouldersChart'
    ],
    
    title: 'Вес и объемы',
    layout: {
        type: 'table',
        columns: 2,
        tableAttrs: {
            style: {
                width: '100%'
            }
        }
    },
    defaults:{
    	margin: '0 10 0 0',
		bodyPadding: 10
    },
    items:[
    	{xtype: 'statistic-weight'},
    	{xtype: 'statistic-neck'},
    	{xtype: 'statistic-chest'},
    	{xtype: 'statistic-waist'},
    	{xtype: 'statistic-buttocks'},
    	{xtype: 'statistic-hip'},
    	{xtype: 'statistic-caviar'},
    	{xtype: 'statistic-pelvis'},
    	{xtype: 'statistic-biceps'},
    	{xtype: 'statistic-forearm'},
    	{xtype: 'statistic-shoulders'}
    ]
			
	})