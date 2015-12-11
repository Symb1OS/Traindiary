Ext.define('app.controller.MeasurementController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.measurement',
    
    onAdd : function(){
		var newRow = Ext.create('app.model.MeasurementModel', {
    		'measurementId' : '',
    		'username' : '',
    		'date' : '',
    		'weight' : '',
    		'neck' : '',
    		'chest' : '',
    		'waist' : '',
    		'buttocks' : '',
    		'hip' : '',
    		'cavair' : '',
    		'pelvis' : '',
    		'biceps' : '',
    		'forearm' : '',
    		'shoulders' : ''
    	})
    	
    	var store = Ext.getStore('measurementStore');
    	store.insert(0, newRow);
    	
    	var grid = Ext.getCmp('measurementGrid');
    	grid.getSelectionModel().select(0);
    },
    
    onDelete : function(){
    	var sm = Ext.getCmp('measurementGrid').getSelectionModel();
    	var store = Ext.getStore('measurementStore');
    	store.remove(sm.getSelection());
    },
    
    onSave : function(){
	  	 var form = this.getView().getForm()
		 var rec = form.getRecord()
		 var newValues = form.getValues()	
		 
		 var keys = [];
		 for (var key in newValues) {
		     if (newValues.hasOwnProperty(key)) {
		         keys.push(key);
		     }
		 }
		
		 for (var i = 0; i < keys.length; i++) {
		     rec.set(keys[i], newValues[keys[i]]);
		 }
		  
		 var store = Ext.getStore('measurementStore');

		 Ext.getCmp('measurementGrid').getStore().sync({
			success: function(){
				 Ext.getCmp('measurementGrid').getStore().load()
			}		 	
		 })
		 	
    },
    
    onSelectToForm : function(combo, rec, idx){
    	var form = this.getView().getForm()
		form.loadRecord(rec)
    }

})