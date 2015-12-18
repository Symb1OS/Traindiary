Ext.define('app.store.MeasurementCaviarStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-caviar',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementCaviarStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/add',
    		update:  'user/measurement/update',
    		destroy: 'user/measurement/delete',
    		read  :  'user/measurement/read'
    	},
    	extraParams:{
    		bodyPartId:7
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