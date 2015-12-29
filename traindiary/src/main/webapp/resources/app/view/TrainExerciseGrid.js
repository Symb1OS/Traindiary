Ext.define('app.view.TrainExerciseGrid', {
    extend: 'Ext.grid.Panel',
  
    alias: 'widget.training-exercise-grid',
    requires:[
   	 	'app.store.TrainExerciseStore',
   	 	'app.store.ExerciseStore'
    ],

    id: 'trainExerciseGrid',
    title: 'Упражнения',
    frame: true,
    region: 'center',
    width: 400,
    height: 400,
    
    store: {
    	type: 'training-exercise'
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
        text: 'Упражнениe',
        dataIndex: 'exerciseId',
        flex:1,
        renderer: function(val){
        	var store = Ext.getStore('exercise')
        	var rec = store.getById(val)
        	return rec.get('name');
        }
    },{
        xtype: 'combobox',
        hidden:true,
        store: {
            type: 'exercise',
            autoLoad: true
        }
    },{
    	flex:1,
    	dataIndex: 'comment',
    	text: 'Комментарий',
    	hidden: true
    }],
    
    plugins: [{
        ptype: 'rowexpander',
        pluginId:'expander',
        rowBodyTpl : new Ext.XTemplate(
        	'<P><b> Комментарий: </b>{comment}'
        )
    }],
    
    tbar: [{
        text: 'Добавить',
        itemId: 'exerciseAdd',
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
    	select: 'onLoadSetStore',    	
    	selectionchange : 'onLockExerciseRemoveListener'
	}
    ]

})