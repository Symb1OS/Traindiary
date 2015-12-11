Ext.define('app.view.MeasurementGridContainer', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.measurement-grid',
    requires: [
   	 'app.store.MeasurementStore'   
    ],
    
    title: 'Вес и объемы',
    id: 'measurementGrid',
    frame: true,
    columnLines: true,
    scrollable: true,
    store: {
    	type: 'measurement'
    },
    columns:[
        { text: 'Id', align: 'center', dataIndex: 'measurementId', flex:1, hidden: true},
        { text: 'Пользователь', align: 'center', dataIndex: 'username', flex:1, hidden: true},
        { text: 'Дата', align: 'center', dataIndex: 'date', flex:1,editor:{xtype: 'datefield', format:'Y-m-d',dateFormat: 'Y-m-d'} },
        { text: 'Вес', align: 'center', dataIndex: 'weight', width:60,editor:{xtype: 'numberfield', minValue: 0}},
        { text: 'Шея', align: 'center', dataIndex: 'neck', width:60,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Грудь', align: 'center', dataIndex: 'chest', width: 95,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Талия', align: 'center', dataIndex: 'waist', width: 95,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Ягодицы',align: 'center',  dataIndex: 'buttocks', width: 95,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Бедро',align: 'center',  dataIndex: 'hip', width:95,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Икры', align: 'center', dataIndex: 'cavair', width: 95,editor:{xtype: 'numberfield', minValue: 0}},
        { text: 'Таз', align: 'center', dataIndex: 'pelvis', width: 60,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Бицепс', align: 'center', dataIndex: 'biceps', width:95,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Предплечье', align: 'center', dataIndex: 'forearm', width: 105,editor:{xtype: 'numberfield', minValue: 0} },
        { text: 'Плечи', align: 'center', dataIndex: 'shoulders', width:95,editor:{xtype: 'numberfield', minValue: 0} }
    ],
    
    tbar: [{
        text: 'Добавить',
        handler: 'onAdd'
    }, {
        text: 'Удалить',
        handler: 'onDelete'
    }],
    
    listeners:[
    	{select: 'onSelectToForm'}
    ]
})