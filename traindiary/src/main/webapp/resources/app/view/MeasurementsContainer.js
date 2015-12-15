Ext.define('app.view.MeasurementsContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurements',
    requires: [
    	'app.view.MeasurementWeightContainer',
    	'app.view.MeasurementNeckContainer',
		'app.view.MeasurementChestContainer',
		'app.view.MeasurementWaistContainer',
		'app.view.MeasurementButtocksContainer',
		'app.view.MeasurementHipContainer',
		'app.view.MeasurementCaviarContainer',
		'app.view.MeasurementPelvisContainer',
		'app.view.MeasurementBicepsContainer',
		'app.view.MeasurementForearmContainer',
    	'app.view.MeasurementShouldersContainer'
    ],
	
    title: 'Вес и объемы',
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
    	{xtype: 'measurement-chest'},
    	{xtype: 'measurement-waist'},
    	{xtype: 'measurement-buttocks'},
    	{xtype: 'measurement-hip'},
    	{xtype: 'measurement-caviar'},
    	{xtype: 'measurement-pelvis'},
    	{xtype: 'measurement-biceps'},
		{xtype: 'measurement-forearm'},
		{xtype: 'measurement-shoulders'}
	]	
})