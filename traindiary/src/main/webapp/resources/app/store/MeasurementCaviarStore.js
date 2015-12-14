Ext.define('app.store.MeasurementCaviarStore', {
    extend: 'Ext.data.Store',
    alias: 'store.measurement-caviar',
    model: 'app.model.MeasurementModel',
    storeId: 'measurementCaviarStore',
    autoLoad: true,
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:  'user/measurement/caviar/add',
    		update:  'user/measurement/caviar/update',
    		read  :  'user/measurement/caviar/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'id',
            rootProperty: 'caviar'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
})