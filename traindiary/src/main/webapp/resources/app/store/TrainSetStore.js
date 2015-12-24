Ext.define('app.store.TrainSetStore', {
    extend: 'Ext.data.Store',
    alias: 'store.training-set',
    model: 'app.model.TrainSetModel',
    storeId: 'trainSetStore',
    proxy: new Ext.data.HttpProxy({
    	api:{
    		create:   'user/trainset/add',
    		update:   'user/trainset/update',
			destroy : 'user/trainset/delete',
    		read  :   'user/trainset/read'
    	},
		reader: {
            type: 'json',
            idProperty: 'setId',
            rootProperty: 'trainset'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    })
       
})