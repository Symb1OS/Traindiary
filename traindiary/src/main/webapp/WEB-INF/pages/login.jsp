<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@page session="true"%> 

<html>
<head>
<title>Авторизация</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/ext6/build/classic/theme-neptune/resources/theme-neptune-all.css"/>" >
<script type="text/javascript" src="<c:url value="/resources/ext6/build/ext-all.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/ext6/build/classic/theme-neptune/theme-neptune.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/ext6/build/classic/locale/locale-ru.js"/>"></script>
</head>

<body>

<script type="text/javascript">

Ext.onReady(function(){	
		
	var loginPanel = Ext.create('Ext.form.Panel', {
		width: 310,
		height: 160,
		region:'center',
		title: 'Войти',
		frame: true,
		layout: {
	        type: 'vbox',   
	        align: 'stretch',   
	        padding: 5
	    }, 
		items:[
		{
		    xtype: 'form',
		   	bodyStyle: "padding: 5px;",
		    items: [{
		        xtype: 'textfield',
		        id: 'username',
		        name: 'username',
		        fieldLabel: 'Пользователь',
		        allowBlank: false
		    }, {
		        xtype: 'textfield',
		        id: 'password',
		        name: 'password',
		        inputType: 'password',
		        fieldLabel: 'Пароль',
		        allowBlank: false
		    }],
		    buttons: [{
		        text: 'Войти',
		        formBind: true,
		        handler: function(){
		        
		        	var user = Ext.getCmp('username').value;
		        	var pas = Ext.getCmp('password').value;	  
		        	 this.up('form').getForm().submit({
		        		url:'j_spring_security_check',
		        		method: 'POST',
		        		params:{
		        			username: user,
		        	    	password: pas,
		        	    	"${_csrf.parameterName}": "${_csrf.token}" 
		        		},
			        	success: function(){
			        		location.href = 'profile'
			        	},
			        	failure: function(){
			        		Ext.Msg.alert('Внимание', 'Неверный логин или пароль')
			        	}
		        	}); 
		        	
		        }		  
		    },{
		        text: 'Регистрация',
		        handler: function(){
		        	location.href= 'registration';
		        }
		        
			 }]
		 }]
	}); 
	
	 var viewport = Ext.create('Ext.container.Viewport', {
			style : 'background-image: url(resources/image/log-background.jpg)',
	        layout : {
	        	type: 'vbox',
	            align: 'center',
	            pack: 'center'
	        },
	        items : [loginPanel]
	    });
});

</script>   


</body>
</html>