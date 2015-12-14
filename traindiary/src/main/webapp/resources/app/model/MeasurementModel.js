Ext.define('app.model.MeasurementModel', {
    extend: 'Ext.data.Model',
    idProperty: 'id',
    fields: [ {name: 'id', type : 'int'}, 
    		  {name: 'bodyPartId'}, 
    		  {name: 'username'}, 
    		  {name: 'date'}, 
    		  {name: 'val'}
    ]
});