Ext.define('app.view.MeasurementCaviarGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-caviar',
    requires: [
   	 'app.store.MeasurementCaviarStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementCaviarGrid',
    store: {
    	type: 'measurement-caviar'
    }
})