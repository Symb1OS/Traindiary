Ext.define('app.store.MeasurementShouldersStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-shoulders',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementShouldersStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/shoulders/add',
    		update:  'user/measurement/shoulders/update',
    		read  :  'user/measurement/shoulders/read'
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