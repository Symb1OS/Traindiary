Ext.define('app.store.MeasurementHipStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-hip',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementHipStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
    		destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId:6
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