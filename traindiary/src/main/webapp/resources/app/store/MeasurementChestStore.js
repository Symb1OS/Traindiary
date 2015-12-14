Ext.define('app.store.MeasurementChestStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-chest',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementChestStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/chest/add',
    		update:  'user/measurement/chest/update',
    		read  :  'user/measurement/chest/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'chest'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})