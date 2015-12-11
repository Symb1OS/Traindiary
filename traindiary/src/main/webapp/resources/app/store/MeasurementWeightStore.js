Ext.define('app.store.MeasurementWeightStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-weight',
    model: 'app.model.MeasurementWeightModel',
    storeId: 'measurementWeightStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/weight/add',
    		update:  'user/measurement/weight/update',
    		read  :  'user/measurement/weight/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'weight'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})