Ext.define('app.view.MeasurementHipGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-hip',
    requires: [
   	 'app.store.MeasurementHipStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementHipGrid',
    store: {
    	type: 'measurement-hip'
    }
})