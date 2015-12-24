Ext.define('app.model.ExerciseModel', {
    extend: 'Ext.data.Model',
    idProperty: 'exerciseId',
    fields: [ {name: 'exerciseId', type : 'int'}, 
    		  {name: 'name'}
    ]
});