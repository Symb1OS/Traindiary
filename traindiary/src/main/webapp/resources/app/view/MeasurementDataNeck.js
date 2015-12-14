Ext.define('app.view.MeasurementDataNeck', {
    extend: 'Ext.form.Panel',
    alias: 'widget.measurement-detail-neck',
    
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
    	{ xtype: 'datefield', fieldLabel: 'Дата', name: 'date', format:'Y-m-d'},
    	{ xtype: 'numberfield', fieldLabel: 'Значение', name: 'val'}
    ],
    buttons:[
	{
    	text: 'Сохранить',
    	formBind: true,
    	handler: 'onSave'
	}
    ]
})