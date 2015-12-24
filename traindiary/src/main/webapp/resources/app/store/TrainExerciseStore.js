Ext.define('app.store.TrainExerciseStore', {
    extend: 'Ext.data.Store',
    alias: 'store.training-exercise',
    model: 'app.model.TrainExerciseModel',
    storeId: 'trainExerciseStore',
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:   'user/trainexercise/add',
    		update:   'user/trainexercise/update',
			destroy : 'user/trainexercise/delete',
    		read  :   'user/trainexercise/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'trainExerciseId',
            rootProperty: 'trainexercise'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
       
})