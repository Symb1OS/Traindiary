Ext.define('app.view.ChangePasswordContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.changePassword',
    requires: [
        'app.controller.SettingsController'
    ],
    controller: 'settings',
    
    title: 'Смена пароля',
    layout: 'anchor',
	frame: true,
    defaultType: 'textfield',
    defaults: {
    	allowBlank: false,
    	labelWidth: 115,
        anchor: '100%'
    },
    items:[{
            	fieldLabel: 'Старый пароль', 
				minLength: 8,
            	name: 'oldPass', 
            	id:'oldPass',
            	emptyText: '', 
            	inputType: 'password' 
            },{
            	fieldLabel: 'Новый пароль', 
				minLength: 8,
            	name: 'newPass', 
            	id:'newPass',
            	emptyText: '', 
            	inputType: 'password',
            	validator: function(val){
            		var oldPas = Ext.getCmp('oldPass').value;
            		if(oldPas != val){
            			return true;
            		}else{
            			return "Новый пароль должен отличаться от старого!";
            		}
            	} 
            },{
            	fieldLabel: 'Повторите пароль', 
            	emptyText: '', 
            	inputType: 'password',
            	validator: function(val){
            		var pas = Ext.getCmp('newPass').value;
            		if(pas == val){
            			return true;
            		}else{
            			return "Пароли не совпадают";
            		}
            	}
            }],
            buttons: [
            	{
            		text: 'Сменить пароль',
            		formBind: true,
            		handler: 'onChangePassword'
          		}
            ]
});