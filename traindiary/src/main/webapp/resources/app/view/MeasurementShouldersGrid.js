Ext.define('app.view.MeasurementShouldersGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-shoulders',
    requires: [
   	 'app.store.MeasurementShouldersStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementShouldersGrid',
    store: {
    	type: 'measurement-shoulders'
    }
})