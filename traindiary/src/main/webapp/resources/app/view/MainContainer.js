Ext.define('app.view.MainContainer', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.mainContainer',
    title: 'Дневник тренировок',
    requires: [
        'app.view.PersonDataContainer',
        'app.view.ChangePasswordContainer',
        'app.view.SettingsContainer',
        'app.view.MeasurementsContainer'
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
        glyph: 72,
        bodyPadding: 15
    },
    items: [{
        title: 'О дневнике',
        html: 'Сюда запилим красивую  презинтацию по функционалу'
    }, {
        title: 'Журнал тренировок',
        html: 'Записи о тренировках(упражнения, подходы, веса)'
    }, {
        title: 'Каталог упражнений',
        html: 'Каталог стандартных упражнений, а так же добавить возможность добавлять свои упражнения'
    }, 
    	{xtype: 'measurements'}, 
    {
        title: 'Статистика',
        html: 'Куча аналитики по тренировкам и питанию, графики для наглядного  отображения прогресса и выгрузки отчетов'
    }, 
    	{xtype: 'settings'}
    ],
     header: {
        itemPosition: 1, // after title before collapse tool
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