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
        	for(var i = 0; i < store.getCount(); i++){
        		var rec = store.getAt(i)
        		var exId = rec.get('exerciseId')
        		if (exId === val){
        			return rec.get('name')
        		}
        	}
        	return '';
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
    }],
    
    listeners: [
	{
    	select: function(grid, record, index, eOpts ){
    		Ext.getCmp('trainSetGrid').getStore().load({
    			params:{
    				trainExerciseId : record.get('trainExerciseId')
    			}
    		})
    		
    	}
	}
    ]

})