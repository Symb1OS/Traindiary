Ext.define('app.controller.SettingsController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.settings',
    
    init : function(){
    	 this.onLoadProfile()
    },
    
    onLoadProfile : function(){
    	var form   = this.getView();
       	form.load({
			url:'user/loadProfile',
			method: 'GET',
	    	success: function(form, action){
	    		var success = action.result.success;
	    		var msg = action.result.msg;
	    		if(success == true){
	    			  var data= Ext.JSON.decode(action.result.data)
	    			  form.setValues(data);
	    		}
	    	},
	    	failure: function(form, action){
	    		var msg = action.result.msg;
	    		Ext.Msg.alert("Ошибка", msg);
	    	}
		}); 
    },
    
    onUpdateProfile : function() {
    	var form   = this.getView();
       	form.submit({
			url:'user/updateProfile',
			method: 'GET',
	    	success: function(form, action){
	    		var success = action.result.success;
	    		var msg = action.result.msg;
	    		if(success == true){
	    			  showToast(msg);
	    		}
	    	},
	    	failure: function(form, action){
	    		var msg = action.result.msg;
	    		Ext.Msg.alert("Ошибка", msg);
	    	}
		}); 
    },
    
    onChangePassword : function() {
    	var form   = this.getView();
       	form.submit({
			url:'user/changePassword',
			method: 'GET',
	    	success: function(form, action){
	    		var success = action.result.success;
	    		var msg = action.result.msg;
	    		if(success == true){
	    			  showToast(msg);
	    			  form.reset();
	    		}
	    	},
	    	failure: function(form, action){
	    		var msg = action.result.msg;
	    		Ext.Msg.alert("Ошибка", msg);
	    		form.reset();
	    	}
	 	}); 
    }
    
})