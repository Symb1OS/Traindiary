Ext.define('app.model.TrainExerciseModel', {
    extend: 'Ext.data.Model',
    idProperty: 'trainExerciseId',
    fields: [ 
    		  {name: 'trainExerciseId', type : 'int'}, 
    		  {name: 'trainingId'},
    		  {name: 'exerciseId'}, 
    		  {name: 'exerciseName'}, 
    		  {name: 'comment'}
    ]
    
    
});