Ext.define('app.view.PersonDataContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.personData',
    requires: [
        'app.controller.SettingsController'
    ],
    controller: 'settings',
    
    title: 'Личные данные',
    layout: 'anchor',
	scrollable:true,
    defaultType: 'textfield',
    defaults: {
    	labelWidth: 100,
        anchor: '100%'
    },
    items:[{
	            fieldLabel: 'Имя',
	            name: 'firstName',
	            allowBlank: false
	        }, {
	            fieldLabel: 'Отчество',
	            name: 'secondName'
	        }, {
	            fieldLabel: 'Фамилия',
	            name: 'lastName'
	        },{
                xtype: 'radiogroup',
                allowBlank: false,
                fieldLabel: 'Пол',
                columns: 1,
                items: [
                    {boxLabel: 'Мужской', inputValue: '0',  name: 'sex'},
                    {boxLabel: 'Женский', inputValue: '1' , name: 'sex'}
                ]
            },
            {
            	xtype: 'textfield',
            	fieldLabel: 'Город',
            	name:'city'
            },
	       	{
	        	xtype: 'datefield',
	        	fieldLabel: 'Дата рождения',
	        	name: 'birthday',
	        	//renderer: Ext.util.Format.dateRenderer('d-m-Y'),
	        	type: 'date',
	        	max: new Date(),
	        	format:'Y-m-d'
	       	}
	        ],
            buttons: [
            	{
            		text: 'Сохранить',
            		formBind: true,
            		disabled: false,
            		handler: 'onUpdateProfile'
          		} 
            ]
});