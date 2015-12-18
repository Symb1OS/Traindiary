Ext.define('app.store.MeasurementBicepsStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-biceps',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementBicepsStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create  :  'user/measurement/add',
    		update  :  'user/measurement/update',
    		destroy :  'user/measurement/delete',
    		read    :  'user/measurement/read'
    		
    	},
    	extraParams:{
    		bodyPartId:9
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