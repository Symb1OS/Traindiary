Ext.define('app.view.MeasurementForearmGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-forearm',
    requires: [
   	 'app.store.MeasurementForearmStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementForearmGrid',
    store: {
    	type: 'measurement-forearm'
    }
})