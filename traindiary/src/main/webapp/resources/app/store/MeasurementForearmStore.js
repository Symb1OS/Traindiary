Ext.define('app.store.MeasurementForearmStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-forearm',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementForearmStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
    		destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId:10
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