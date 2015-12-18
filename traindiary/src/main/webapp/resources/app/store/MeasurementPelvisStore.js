Ext.define('app.store.MeasurementPelvisStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-pelvis',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementPelvisStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
			destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId: 8
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