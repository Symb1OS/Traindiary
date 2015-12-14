Ext.define('app.store.MeasurementButtocksStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-buttocks',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementButtocksStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/buttocks/add',
    		update:  'user/measurement/buttocks/update',
    		read  :  'user/measurement/buttocks/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'buttocks'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})