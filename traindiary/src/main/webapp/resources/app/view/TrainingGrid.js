Ext.define('app.view.TrainingGrid', {
    extend: 'Ext.grid.Panel',
  
    alias: 'widget.training-grid',
    requires:[
    	'app.store.TrainingStore'
    ],

    title: 'Тренировки',
    id: 'trainingGrid',
    frame: true,
    region:'west',
    width: 380,
    height: 400,
  
    store: {
    	type: 'training'
    },

    columns: [{
        text: 'trainingId',
        dataIndex: 'trainingId',
        hidden: true
    },{
        text: 'username',
        dataIndex: 'username',
        flex: 1,
        hidden: true
    },{
        width: 120,
        text: 'Дата',
        dataIndex: 'date',
        renderer: function(val, metaData, rec){
	    	var description = rec.get('description');
	    	if(description == 1){
	    		  	return '<b>' + Ext.util.Format.date(val, 'd.m.Y') + '</b>'
	    	}else{
	    		return Ext.util.Format.date(val, 'd.m.Y')
	    	}
	    } 
    },{
        width: 210,
        text: 'День недели',
        dataIndex: 'date',
        renderer: function(val, metaData, rec){
	    	var description = rec.get('description');
	    	if(description == 1){
	    		  	return '<b>' + Ext.util.Format.date(val, 'l') + '</b>'
	    	}else{
	    		return Ext.util.Format.date(val, 'l')
	    	}
	    } 
    },{
    	width: 140,
    	dataIndex: 'description',
    	text: 'Описание',
        hidden: true
    }],
    
    plugins: [{
        ptype: 'rowexpander',
        pluginId:'expander',
        rowBodyTpl : new Ext.XTemplate(
        	//'{description}'
        )
    }],

    tbar: [
	{
		xtype: 'datefield',
		width: 130,
		id: 'trainingDate',
        text: 'Месяц',
        value: new Date(),
        format: 'F Y',
        scale: 'small',
        listeners: [
        {
        	afterrender: 'onLoadTrainingStore',
        	change: 'onLoanTrainingMonth'
    	}
        ]
    },{
        text: 'Скрыть нетренировочные',
        enableToggle: true,
        itemId:'hidden',
        scale: 'small',
        toggleHandler : function(button, pressed) {
			if(pressed == true){
				//TODO  загружаем стор только с заполненными тренировочными днями
			}else{
				//TODO  загружаем все
			}
    	}
    }],
    
    listeners: [
	{
    	select: 'onLoadStoreExercise',
    	selectionchange : 'onUnlockAddExercise'
	}
    ]
    

})