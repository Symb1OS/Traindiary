Ext.define('app.store.MeasurementHipStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-hip',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementHipStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/hip/add',
    		update:  'user/measurement/hip/update',
    		read  :  'user/measurement/hip/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'hip'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})