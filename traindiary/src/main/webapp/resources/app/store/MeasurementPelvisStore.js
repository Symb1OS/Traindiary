Ext.define('app.store.MeasurementPelvisStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-pelvis',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementPelvisStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/pelvis/add',
    		update:  'user/measurement/pelvis/update',
    		read  :  'user/measurement/pelvis/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'pelvis'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})