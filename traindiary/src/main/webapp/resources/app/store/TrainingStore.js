Ext.define('app.store.TrainingStore', {
    extend: 'Ext.data.Store',
    alias: 'store.training',
    model: 'app.model.TrainingModel',
    storeId: 'trainingStore',
    proxy: new Ext.data.HttpProxy({
    	api:{
    		read  :   'user/training/read'
    	},
    	extraParams:{
    		date: Ext.Date.format(new Date(), 'Y-m-d')
    	},
		reader: {
            type: 'json',
            idProperty: 'trainingId',
            rootProperty: 'training'
        },
        writer: {
        	type: 'json',
        	writeAllFields: true
        }
    }),
       
     listeners: [{
    	load: function(){
    		
			var grid =	Ext.getCmp('trainingGrid')
    		var expander = grid.getPlugin('expander')
    
    	 	for (i = 0; i < grid.getStore().getCount(); i++) {
         	    expander.toggleRow(i, grid.getStore().getAt(i));
        	 }
         
    	}
    
    }]
})