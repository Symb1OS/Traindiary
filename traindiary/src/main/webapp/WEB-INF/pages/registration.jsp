<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@page session="true"%> 

<html>
<head>

<link rel="stylesheet" type="text/css" href="resources/css/images.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Регистрация</title>

<link rel="stylesheet" type="text/css" href="<c:url value="/resources/ext6/build/classic/theme-neptune/resources/theme-neptune-all.css"/>" >
<script type="text/javascript" src="<c:url value="/resources/ext6/build/ext-all.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/ext6/build/classic/theme-neptune/theme-neptune.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/ext6/build/classic/locale/locale-ru.js"/>"></script>
</head>
<body>

<script type="text/javascript">

var regPanel = Ext.create('Ext.form.Panel', {
	    title: 'Регистрация',
	    bodyPadding: 10,
	    scrollable:true,
	  //  frame: true,
	    width: 370,
	    fieldDefaults: {
	        labelAlign: 'right',
	        labelWidth: 115,
	        msgTarget: 'side'
	    },
	    items: [{
	        xtype: 'fieldset',
	        title: 'Пользователь',
	        defaultType: 'textfield',
	        defaults: {
	            anchor: '100%'
	        },
	        items: [
            { 
            	allowBlank:false, 
            	fieldLabel: 'Email', 
            	name: 'email', 
            	emptyText: '', 
            	value:'dxeqtr@gmail.com',
            	vtype: 'email'
            },
            { 	allowBlank:false, 
            	fieldLabel: 'Пароль', 
				minLength: 8,
            	name: 'pass', 
            	id:'pass',
            	emptyText: '', 
            	value: '12345678',
            	inputType: 'password' 
            },
            { 	allowBlank:false, 
            	fieldLabel: 'Повторите пароль', 
            	emptyText: '', 
            	value: '12345678',
            	inputType: 'password',
            	validator: function(val){
            		var pas = Ext.getCmp('pass').value;
            		if(pas == val){
            			return true;
            		}else{
            			return "Пароли не совпадают";
            		}
            	}
            }
	        ]
	    }, {
	        xtype: 'fieldset',
	        title: 'Личные данные',
	        defaultType: 'textfield',
	        defaults: {
	            anchor: '100%'
	        },
	        items: [{
	            fieldLabel: 'Имя',
	            name: 'first',
	            value:'Firstname',
	            allowBlank: false
	        }, {
	            fieldLabel: 'Отчество',
	            value:'Secondname',
	            name: 'second'
	        }, {
	            fieldLabel: 'Фамилия',
	            value:'Lastname',
	            name: 'last'
	        },{
                xtype: 'radiogroup',
                allowBlank: false,
                id: 'sex',
                fieldLabel: 'Пол',
                value: 'm',
                columns: 1,
                labelWidth:100,
                items: [
                    {boxLabel: 'Мужской', inputValue: '0',  name: 'sex', checked: true},
                    {boxLabel: 'Женский', inputValue: '1' , name: 'sex'}
                ]
            },
	       	{
	        	xtype: 'datefield',
	        	fieldLabel: 'Дата рождения',
	        	id: 'dob',
	        	name: 'dob',
	        	value: '1990-06-13',
	        	type: 'date',
	        	max: new Date(),
	        	format:'Y-m-d'
	       	}
	        ]
	    }],
	    buttons: [{
	        text: 'Зарегистрироваться и войти',
	        disabled: true,
	        formBind: true,
	        handler: function(){
		       	 this.up('form').getForm().submit({
		        		url:'userreg',
		        		method: 'GET',
			        	success: function(form, action){
			        		var success = action.result.success;
			        		var msg = action.result.msg;
			        		if(success == true){
			        			Ext.MessageBox.alert('Успешно', "<center>" + msg + "</center>", this.showResult, this);
			        			location.href = 'profile'
			        		}
			        	},
			        	failure: function(form, action){
			        		var msg = action.result.msg;
			        		Ext.Msg.alert("Ошибка", msg);
			        		form.reset();
			        	}
		        	}); 
	        }
	    }]
	});
	
var viewport = Ext.create('Ext.container.Viewport', {
	style : 'background-image: url(resources/image/log-background.jpg)',
    layout : {
    	type: 'vbox',
        align: 'center',
        pack: 'center'
    },
    items : [regPanel]
});

</script>

</body>
</html>