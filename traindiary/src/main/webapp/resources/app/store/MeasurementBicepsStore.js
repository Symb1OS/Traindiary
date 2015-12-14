Ext.define('app.store.MeasurementBicepsStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-biceps',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementBicepsStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/biceps/add',
    		update:  'user/measurement/biceps/update',
    		read  :  'user/measurement/biceps/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'biceps'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})