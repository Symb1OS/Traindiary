Ext.define('app.store.ExerciseStore', {
    extend: 'Ext.data.Store',
    alias: 'store.exercise',
    model: 'app.model.ExerciseModel',
    storeId : 'exercise',
    autoLoad: true,
    proxy: {
	    type: 'ajax',
	    url: 'user/exercise/read',
	    reader: {
	        type: 'json',
	        rootProperty: 'exercise'
	    }
    }
})