Ext.define('app.store.MeasurementWeightStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-weight',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementWeightStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:   'user/measurement/add',
    		update:   'user/measurement/update',
			destroy : 'user/measurement/delete',
    		read  :   'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId:1
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