Ext.define('app.view.MeasurementDetailContainer', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.measurement-detail',
    
    title: 'Детальный просмотр',
    layout: 'anchor',
	scrollable:true,
	bodyPadding: 10,
    defaults: {
    	labelWidth: 100,
        anchor: '100%'
    },
    items:[
     	{ xtype: 'textfield', fieldLabel: 'Id', name: 'measurementId', hidden: true},
     	{ xtype: 'textfield', fieldLabel: 'Пользователь', name: 'username', hidden: true},
    	{ xtype: 'datefield', fieldLabel: 'Дата', name: 'date',	 allowBlank: false, format:'Y-m-d'},
    	{ xtype: 'numberfield', fieldLabel: 'Вес', name: 'weight'},
    	{ xtype: 'numberfield', fieldLabel: 'Шея', name: 'neck'},
    	{ xtype: 'numberfield', fieldLabel: 'Грудь', name: 'chest'},
    	{ xtype: 'numberfield', fieldLabel: 'Талия', name: 'waist'},
    	{ xtype: 'numberfield', fieldLabel: 'Ягодицы', name: 'buttocks'},
    	{ xtype: 'numberfield', fieldLabel: 'Бедро', name: 'hip'},
    	{ xtype: 'numberfield', fieldLabel: 'Икры', name: 'cavair'},
    	{ xtype: 'numberfield', fieldLabel: 'Таз', name: 'pelvis'},
    	{ xtype: 'numberfield', fieldLabel: 'Бицепс', name: 'biceps'},
    	{ xtype: 'numberfield', fieldLabel: 'Предплечье', name: 'forearm'},
    	{ xtype: 'numberfield', fieldLabel: 'Плечи', name: 'shoulders'}
    ],
    buttons:[
	{
    	text: 'Сохранить',
    	formBind: true,
    	handler: 'onSave'
	}
    ]
})