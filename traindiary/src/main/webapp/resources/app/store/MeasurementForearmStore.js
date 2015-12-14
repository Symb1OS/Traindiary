Ext.define('app.store.MeasurementForearmStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-forearm',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementForearmStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/forearm/add',
    		update:  'user/measurement/forearm/update',
    		read  :  'user/measurement/forearm/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'forearm'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})