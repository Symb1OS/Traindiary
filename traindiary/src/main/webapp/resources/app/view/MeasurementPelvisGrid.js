Ext.define('app.view.MeasurementPelvisGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-pelvis',
    requires: [
   	 'app.store.MeasurementPelvisStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementPelvisGrid',
    store: {
    	type: 'measurement-pelvis'
    }
})