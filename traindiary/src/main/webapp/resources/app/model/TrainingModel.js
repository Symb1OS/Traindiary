Ext.define('app.model.TrainingModel', {
    extend: 'Ext.data.Model',
    idProperty: 'trainingId',
    fields: [ {name: 'trainingId', type : 'int'}, 
    		  {name: 'username'}, 
    		  {name: 'date'}, 
    		  {name: 'description'},
    		  {name: 'comment'} 
    ]
});