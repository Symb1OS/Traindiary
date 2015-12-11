Ext.define('app.model.MeasurementModel', {
    extend: 'Ext.data.Model',
    idProperty: 'measurementId',
    fields: [ {name: 'measurementId', type : 'int'}, 
    		  {name: 'username'}, 
    		  {name: 'date'}, 
    		  {name: 'weight'}, 
    		  {name: 'neck'},
    		  {name: 'chest'},
    		  {name: 'waist'},
    		  {name: 'buttocks'},
    		  {name: 'hip'},
    		  {name: 'cavair'},
    		  {name: 'pelvis'},
    		  {name: 'biceps'},
    		  {name: 'forearm'},
    		  {name: 'shoulders'}
    ]
});