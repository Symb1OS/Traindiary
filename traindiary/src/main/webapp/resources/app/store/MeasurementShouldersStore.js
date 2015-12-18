Ext.define('app.store.MeasurementShouldersStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-shoulders',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementShouldersStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
			destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId: 11
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