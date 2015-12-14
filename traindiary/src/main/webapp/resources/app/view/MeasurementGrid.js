Ext.define('app.view.MeasurementGrid', {
    extend: 'Ext.grid.Panel',
    
    title : 'Результаты',
    region: 'west',
    width: 310,
    frame: true,
    columnLines: true,
    
    columns:[
        { text: 'id', align: 'center', dataIndex: 'id', flex:1, hidden: true},
        { text: 'bodyPartId', align: 'center', dataIndex: 'bodyPartId', flex:1, hidden: true},
        { text: 'username', align: 'center', dataIndex: 'username', flex:1, hidden: true},
        { text: 'Дата', align: 'center', dataIndex: 'date', width:150},
        { text: 'Значение', align: 'center', dataIndex: 'val', width:150 }
    ],
    
    tbar: [{
        text: 'Добавить',
        scale: 'small',
        handler: 'onAdd'
    }, {
        text: 'Удалить',
        scale: 'small',
        handler: 'onDelete'
    }],
    
    listeners:[
    	{select: 'onSelectToForm'}
    ]
})