Ext.define('app.view.TrainSetGrid', {
    extend: 'Ext.grid.Panel',
  
    alias: 'widget.training-set-grid',
    requires:[
    	'app.store.TrainSetStore'
    ],

    title: 'Подходы',
    id: 'trainSetGrid',
    region: 'east',
    width: 200,
    height: 400,
    
    store: {
    	type: 'training-set'
    },
 
    columns: [
    {xtype: 'rownumberer'},
    {
		text: 'setId',
		dataIndex: 'setId',
        hidden: true
    },{
        text: 'trainExerciseId',
        dataIndex: 'trainExerciseId',
        hidden: true
    },{
        text: 'Повторения',
        dataIndex: 'repeat',
        width: 100
    },{
        text: 'Вес',
        dataIndex: 'weight',
        width: 75
    }],
    
    tbar: [{
        text: 'Добавить',
        itemId:'setAdd',
        scale: 'small',
        disabled: true
    }, {
        text: 'Удалить',
        itemId:'remove',
        scale: 'small',
        disabled: true
    }],
    
    listeners: [
	{
    	selectionchange : 'onLockSetRemoveListener'
	}
    ]

})