Ext.define('app.store.MeasurementNeckStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-neck',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementNeckStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/neck/add',
    		update:  'user/measurement/neck/update',
    		read  :  'user/measurement/neck/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'neck'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})