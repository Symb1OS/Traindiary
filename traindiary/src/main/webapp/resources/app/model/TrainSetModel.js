Ext.define('app.model.TrainSetModel', {
    extend: 'Ext.data.Model',
    idProperty: 'setId',
    fields: [ 
    			{name: 'setId', type : 'int'}, 
    			{name: 'trainExerciseId'},
    		  	{name: 'repeat'},
    		 	{name: 'weight'}
    		 	
	        
    ]

});