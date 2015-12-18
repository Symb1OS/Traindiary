Ext.define('app.store.MeasurementWaistStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-waist',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementWaistStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
			destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId: 4
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