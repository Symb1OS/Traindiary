Ext.define('app.view.MeasurementBicepsGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-biceps',
    requires: [
   	 'app.store.MeasurementBicepsStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementBicepsGrid',
    store: {
    	type: 'measurement-biceps'
    }
})