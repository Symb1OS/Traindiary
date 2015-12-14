Ext.define('app.store.MeasurementWaistStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-waist',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementWaistStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/waist/add',
    		update:  'user/measurement/waist/update',
    		read  :  'user/measurement/waist/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'waist'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})