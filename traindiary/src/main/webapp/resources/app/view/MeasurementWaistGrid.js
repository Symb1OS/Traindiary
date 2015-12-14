Ext.define('app.view.MeasurementWaistGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-waist',
    requires: [
   	 'app.store.MeasurementWaistStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementWaistGrid',
    store: {
    	type: 'measurement-waist'
    }
})