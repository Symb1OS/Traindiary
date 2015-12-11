Ext.define('app.store.MeasurementStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
    		read  :  'user/measurement/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'measurementId',
            rootProperty: 'measurement'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})