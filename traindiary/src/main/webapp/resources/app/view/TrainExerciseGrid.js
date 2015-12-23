Ext.define('app.view.TrainExerciseGrid', {
    extend: 'Ext.grid.Panel',
  
    alias: 'widget.training-exercise-grid',
    requires:[
   	 	'app.model.TrainExerciseModel'
    ],

    title: 'Упражнения',
    frame: true,
    region: 'center',
    width: 400,
    height: 400,
    
     store:{
    	model:'app.model.TrainExerciseModel',
    	data:[
   			[1,1,1,'Присед','Тяжко пошло'],
			[2,1,2,'Жим ногами','заебца пошло'],
			[3,1,3,'Выпады','Умираем']
        ]
    },

    columns: [
    {xtype: 'rownumberer'},
    {
        text: 'trainExerciseId',
        dataIndex: 'trainExerciseId',
        hidden: true
    },{
		text: 'trainingId',
		dataIndex: 'trainingId',
        hidden: true
    },{
        text: 'exerciseId',
        dataIndex: 'exerciseId',
        flex: 1,
        hidden: true
    },{
        width: 140,
        text: 'Упражнение',
        dataIndex: 'exerciseName'
    },{
    	flex:1,
    	dataIndex: 'comment',
    	text: 'Комментарий'
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