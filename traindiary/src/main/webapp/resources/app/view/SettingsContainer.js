Ext.define('app.view.SettingsContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.settings',
    requires: [
   	 'app.view.PersonDataContainer',
   	 'app.view.ChangePasswordContainer'     
    ],
    requires: [
        'app.controller.SettingsController'
    ],
    controller: 'settings',
    
    title: 'Настройки',
    layout: {
        type: 'vbox',
        pack: 'start',
        align: 'stretch'
    },
    bodyPadding: 10,
    defaults: {
        frame: true,
        margin: '0 0 10 0',
        bodyPadding: 10
    },
    items:[
		{xtype: 'personData'},
    	{xtype: 'changePassword'}
	]	
})