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
    width: 450,
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
        width: 450,
        text: 'Дата',
        dataIndex: 'date',
        renderer: Ext.util.Format.dateRenderer('d.m.Y')
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
        	'{description}'
        )
    }],

    tbar: [
	{
		xtype: 'datefield',
		id: 'trainingDate',
        text: 'Месяц',
        value: new Date(),
        format: 'F Y',
        scale: 'small',
        listeners: [
        {
        	afterrender: function( grid, eOpts ){
        		Ext.getStore('trainingStore').load()
        	},
        	
        	change: function( trainingDate, newValue, oldValue, eOpts ){
        		var date = Ext.Date.format(newValue,'Y-m-d')
        		if (date != ''){
        			Ext.getCmp('trainingGrid').getStore().load({
	        			params: {
	        				date : date
	        			}
        	   	    })
        		}
        	}
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
    },{
    	xtype: 'button',
    	text:'Скрыть/раскрыть',
    	handler: function(){
    	//	this.up('panel').getStore().load()
    	}
    }],
    
    listeners: [
	{
    	select: function(grid, record, index, eOpts ){
    		Ext.getCmp('trainExerciseGrid').getStore().load({
    			params:{
    				trainigId : record.get('trainingId')
    			}
    		})
    		
    		Ext.getCmp('trainSetGrid').getStore().load({
    		 	params: {
    		 		trainExerciseId : -1
    		 	}
    		})
    		
    	}
	}
    ]

})