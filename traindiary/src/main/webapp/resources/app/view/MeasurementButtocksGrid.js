Ext.define('app.view.MeasurementButtocksGrid', {
    extend: 'app.view.MeasurementGrid',
    alias: 'widget.measurement-grid-buttocks',
    requires: [
   	 'app.store.MeasurementButtocksStore'   
   	,'app.controller.MeasurementGridController'
    ],
    
    controller: 'measurement-grid',
    
    id: 'measurementButtocksGrid',
    store: {
    	type: 'measurement-buttocks'
    }
})