Ext.define('app.controller.MeasurementGridController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.measurement-grid',

    onAdd : function(){
		var newRow = Ext.create('app.model.MeasurementModel', {
    		'id' : '',
    		'bodyPartId' : '',
    		'username' : '',
    		'date' : '',
    		'val' : ''
    	})
    	
    	var grid = this.getView();
    	var store = grid.getStore();
    	
    	store.insert(0, newRow);
    	grid.getSelectionModel().select(0);
    },
    
    onDelete : function(){
    	var grid = this.getView();
    	var store = grid.getStore();
    	
    	var sm = grid.getSelectionModel();
    	store.remove(sm.getSelection());
    }

})