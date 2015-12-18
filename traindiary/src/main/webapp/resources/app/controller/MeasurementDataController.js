Ext.define('app.controller.MeasurementDataController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.measurement-data',
    
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
		  
		 var grid = this.getView().down('panel')
		 var store = grid.getStore()
		 
	 	 store.sync()
		
    },
    
    onSelectToForm : function(combo, rec, idx){
    	var form = this.getView().getForm()
		form.loadRecord(rec)
    },
    
    onEnabledRemove: function(view, records){
    	var grid = this.getView();
		grid.down('#remove').setDisabled(!records.length);
	},
	
	onValid : function(me, valid, eOpts ){
    		var form = this.getView();
    		form.down('#onSave').setDisabled(!valid)
	}

})