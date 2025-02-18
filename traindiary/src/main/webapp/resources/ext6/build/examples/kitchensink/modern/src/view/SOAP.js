Ext.define('KitchenSink.view.SOAP', {
			extend : 'Ext.grid.Grid',

			// <example>
			requires : ['Ext.data.soap.Proxy'],
			// </example>

			store : {
				model : 'KitchenSink.model.SoapBook',
				autoLoad : true,
				proxy : {
					type : 'soap',
					url : 'data/enterprise/soap.xml',
					api : {
						read : 'ItemSearch'
					},
					soapAction : {
						read : 'http://webservices.amazon.com/ItemSearch'
					},
					operationParam : 'operation',
					extraParams : {
						'Author' : 'Sheldon'
					},
					targetNamespace : 'http://webservices.amazon.com/',
					reader : {
						type : 'soap',
						record : 'm|Item',
						idProperty : 'ASIN',
						namespace : 'm'
					}
				}
			},
			columns : [{
						text : "Author",
						width : 160,
						dataIndex : 'Author'
					}, {
						text : "Title",
						width : 200,
						dataIndex : 'Title'
					}, {
						text : "Manufacturer",
						width : 115,
						dataIndex : 'Manufacturer'
					}, {
						text : "Product Group",
						width : 125,
						dataIndex : 'ProductGroup'
					}]
		});
