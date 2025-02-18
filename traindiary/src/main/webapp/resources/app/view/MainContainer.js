Ext.define('app.view.MainContainer', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.mainContainer',
    title: 'Дневник тренировок',
    requires: [
    	'app.view.TrainingContainer',
        'app.view.PersonDataContainer',
        'app.view.ChangePasswordContainer',
        'app.view.SettingsContainer',
        'app.view.MeasurementsContainer',
        'app.view.StatisticContainer'
    ],
    
    frame: true,
    width: '70%',
    height: '100%',
  	region: 'center',
    tabPosition: 'left',
    tabRotation: 0,
    tabBar: {
        border: false
    },
    layout: {
        type: 'vbox',
        pack: 'start',
        align: 'stretch'
    },
    defaults: {
        textAlign: 'left',
        bodyPadding: 15
    },
    items: [{
        title: 'О дневнике',
        html: 'Сюда запилим красивую  презинтацию по функционалу'
    }, 
    	{xtype: 'training'}, 
    {
        title: 'Каталог упражнений',
        html: 'Каталог стандартных упражнений, а так же добавить возможность добавлять свои упражнения'
    }, 
    	{xtype: 'measurements'}, 
    	{xtype: 'statistic'}, 
    	{xtype: 'settings'}
    ],
     header: {
        itemPosition: 1, 
        items: [{
            ui: 'default-toolbar',
            xtype: 'button',
            text: 'Выйти',
            handler: function(){
            	location.href = 'login?logout'
            }
        }]
    }
});