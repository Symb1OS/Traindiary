Ext.define('app.view.MeasurementChestGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-chest',
    requires: [
   	 'app.store.MeasurementChestStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementChestGrid',
    store: {
    	type: 'measurement-chest'
    }
})