Ext.define('app.store.MeasurementNeckStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-neck',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementNeckStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
			destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId:2
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