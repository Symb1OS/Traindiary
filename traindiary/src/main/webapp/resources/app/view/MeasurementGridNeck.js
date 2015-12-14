Ext.define('app.view.MeasurementGridNeck', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-neck',
    requires: [
   	 'app.store.MeasurementNeckStore',
   	 'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementNeckGrid',
    store: {
    	type: 'measurement-neck'
    }
})