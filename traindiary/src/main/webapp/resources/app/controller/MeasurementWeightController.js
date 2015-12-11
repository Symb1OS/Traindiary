Ext.define('app.controller.MeasurementWeightController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.measurement-weight',

    onAdd : function(){
		var newRow = Ext.create('app.model.MeasurementWeightModel', {
    		'id' : '',
    		'bodyPartId' : '',
    		'username' : '',
    		'date' : '',
    		'val' : ''
    	})
    	
    	var store = Ext.getStore('measurementWeightStore');
    	store.insert(0, newRow);
    	
    	var grid = Ext.getCmp('measurementWeightGrid');
    	grid.getSelectionModel().select(0);
    },
    
    onDelete : function(){
    	var sm = Ext.getCmp('measurementWeightGrid').getSelectionModel();
    	var store = Ext.getStore('measurementWeightStore');
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
		  
		 var store = Ext.getStore('measurementWeightStore');

		 Ext.getCmp('measurementWeightGrid').getStore().sync({
			success: function(){
				 Ext.getCmp('measurementWeightGrid').getStore().load()
			}		 	
		 })
		 	
    },
    
    onSelectToForm : function(combo, rec, idx){
    	var form = this.getView().getForm()
		form.loadRecord(rec)
    }

})