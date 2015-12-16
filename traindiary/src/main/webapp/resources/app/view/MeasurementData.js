Ext.define('app.view.MeasurementData', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-detail',
    
    title: 'Детальный просмотр',
    region : 'center',
    frame: true,
	bodyPadding: 10,
	layout: 'anchor',
    defaults: {
    	labelWidth: 100,
    	anchor: '100%'
    },
    items:[
		{ xtype: 'textfield', fieldLabel: 'id', name: 'id', hidden: true},
     	{ xtype: 'textfield', fieldLabel: 'bodyPartId', name: 'bodyPartId', hidden: true},
    	{ xtype: 'textfield', fieldLabel: 'Пользователь', name: 'username',  hidden: true},
    	{ xtype: 'datefield', fieldLabel: 'Дата', name: 'date', submitFormat: 'Y-m-d', renderer: Ext.util.Format.dateRenderer('d.m.Y'),allowBlank: false},
    	{ xtype: 'numberfield', fieldLabel: 'Значение', name: 'val', allowBlank: false}
    ],
    buttons:[
	{
    	text: 'Сохранить',
    	disabled: true,
    	itemId:'onSave',
    	handler: 'onSave'
	}
    ],
    listeners: [
   	 	{validitychange: 'onValid'}
    ]
    
})