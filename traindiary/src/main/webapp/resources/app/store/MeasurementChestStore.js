Ext.define('app.store.MeasurementChestStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-chest',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementChestStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
			destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId:3
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