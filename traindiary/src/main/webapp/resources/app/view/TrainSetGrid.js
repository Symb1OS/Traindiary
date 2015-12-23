Ext.define('app.view.TrainSetGrid', {
    extend: 'Ext.grid.Panel',
  
    alias: 'widget.training-set-grid',
    requires:[
    	'app.model.TrainSetModel'
    ],

    title: 'Подходы',
    region: 'east',
    width: 290,
    height: 400,
    store:{
    	model:'app.model.TrainSetModel',
    	data:[
   			[1,1,15,120],
   			[2,1,15,120],
			[3,1,15,120],
			[4,1,15,120],
			[5,1,15,120]
        ]
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
        width: 140
    },{
        text: 'Вес',
        dataIndex: 'weight',
        width: 140
    }],
    
    tbar: [{
        text: 'Добавить',
        scale: 'small'
    }, {
        text: 'Удалить',
        itemId:'remove',
        scale: 'small',
        disabled: true
    }]

})