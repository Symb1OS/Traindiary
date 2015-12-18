Ext.define('app.store.MeasurementButtocksStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-buttocks',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementButtocksStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:   'user/measurement/add',
    		update:   'user/measurement/update',
			destroy:  'user/measurement/delete',
    		read  :   'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId:5
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'measurement'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})