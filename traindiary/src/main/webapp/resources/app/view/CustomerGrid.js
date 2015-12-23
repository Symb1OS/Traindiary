Ext.define('app.view.CustomerGrid', {
	extend: 'Ext.grid.Panel',
	alias :'widget.customer-grid',
	requires:[
			'app.function.SubTable',
			'app.model.Company',
			'app.model.History'
			],

	
	
	title: 'Customers',
	region: 'center',
	width: 700,
	height: 400,

	plugins: [{
		ptype: 'subtable',
		association: 'history',
		headerWidth: 24,
		columns: [ {
			text: 'companyId',
			dataIndex: 'companyId',
			width: 100
		},{
			text: 'Text',
			dataIndex: 'text',
			width: 100
		}, {
			xtype: 'datecolumn',
			format: 'Y/m/d',
			width: 120,
			text: 'Date',
			dataIndex: 'date'
		} ]
	}],

	store: {
		data:[
		{
			"companyId" : 1,
			"company" : "Company",
			"price" : "123",
			"change" : "123",
			"pctChange" : "123",
			"lastChange" : "2015-09-30",
			"history" : [
					{
						"id" : 1,
						"date" : "2015/09/30",
						"text" : "123",
						"companyId" : 1
					},{
						"id" : 2,
						"date" : "2015/09/30",
						"text" : "123",
						"companyId" : 1
					},{
						"id" : 3,
						"date" : "2015/09/30",
						"text" : "123",
						"companyId" : 1
					}
			]
		},{
			"companyId" : 2,
			"company" : "Company",
			"price" : "123",
			"change" : "123",
			"pctChange" : "123",
			"lastChange" : "2015-09-30",
			"history" : [
					{
						"id" : 4,
						"date" : "2015/09/30",
						"text" : "123",
						"companyId" : 2
					},{
						"id" : 5,
						"date" : "2015/09/30",
						"text" : "123",
						"companyId" : 2
					},{
						"id" : 6,
						"date" : "2015/09/30",
						"text" : "123",
						"companyId" : 2
					}
			]
		}
		],
		model: 'app.model.Company'/*,
		autoLoad: true*/
	},
	columns: [ {
		text: 'companyId',
		dataIndex: 'companyId',
		hidden: true
	},{
		text: 'Company',
		dataIndex: 'company',
		flex: 1
	}, {
		text: 'Price',
		dataIndex: 'price'
	}, {
		text: 'Change',
		dataIndex: 'change'
	}, {
		text: '% Change',
		dataIndex: 'pctChange'
	}, {
		xtype: 'datecolumn',
		text: 'Last Updated',
		dataIndex: 'lastChange',
		format: 'm/d/Y'	
	} ]
});