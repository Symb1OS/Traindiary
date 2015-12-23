Ext.define('app.view.TrainExerciseContainer', {
    extend: 'Ext.form.Panel',
    alias: 'widget.training-exercise-container',
    requires: [
    	'app.view.TrainExerciseGrid',
    	'app.view.TrainSetGrid'
    ],

    title: 'Детальный просмотр',
    region : 'center',
    layout: 'border',
    collaped: true,
 /*   defaults: {
        frame: true
    },*/
    items:[
	    {xtype: 'training-exercise-grid'},
	    {xtype: 'training-set-grid'}
	]
    
})