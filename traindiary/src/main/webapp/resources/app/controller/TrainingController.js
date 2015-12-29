Ext.define('app.controller.TrainingController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.training',
  
  	onLoadTrainingStore : function( grid, eOpts ){
		Ext.getStore('trainingStore').load()
	},
	
	onLoanTrainingMonth : function( trainingDate, newValue, oldValue, eOpts ){
		var date = Ext.Date.format(newValue,'Y-m-d')
		if (date != ''){
			Ext.getCmp('trainingGrid').getStore().load({
    			params: {
    				date : date
    			}
	   	    })
		}
	},
	
	onLoadStoreExercise : function(grid, record, index, eOpts ){
		Ext.getCmp('trainExerciseGrid').getStore().load({
			params:{
				trainigId : record.get('trainingId')
			}
		})
		
		Ext.getCmp('trainSetGrid').getStore().load({
		 	params: {
		 		trainExerciseId : -1
		 	}
		})
		
	},
	
	onUnlockAddExercise : function(view, records){
		Ext.getCmp('trainExerciseGrid').down('#exerciseAdd').setDisabled(!records.length);
	},
	
	
	
	onLoadSetStore : function(grid, record, index, eOpts ){
		Ext.getCmp('trainSetGrid').getStore().load({
			params:{
				trainExerciseId : record.get('trainExerciseId')
			}
		})
		
	},
	
	onLockExerciseRemoveListener :  function(view, records){
		Ext.getCmp('trainExerciseGrid').down('#remove').setDisabled(!records.length);
		Ext.getCmp('trainSetGrid').down('#setAdd').setDisabled(!records.length);
	},
	
	onLockSetRemoveListener :  function(view, records){
		Ext.getCmp('trainSetGrid').down('#remove').setDisabled(!records.length);
	}

})