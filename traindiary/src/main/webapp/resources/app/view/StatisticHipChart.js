Ext.define('app.view.StatisticHipChart', {
    extend: 'Ext.Panel',
    alias: 'widget.statistic-hip',
    requires:[
    	'app.store.MeasurementHipStore'
    ],
    
    width: '100%',
	title: 'Бедро',
        items: {
        xtype: 'cartesian',
        reference: 'chart',
        width: '100%',
        height: 500,
        store: {
    		type: 'measurement-hip'
    	},
        interactions: {
            type: 'crosszoom',
            zoomOnPanGesture: false
        },
        insetPadding: '10 0 10 10',
        series: {
            type: 'line',
            xField: 'date',
            yField: 'val',
            style: {
                lineWidth: 2,
                fillStyle: '#115fa6',
                strokeStyle: '#115fa6',
                fillOpacity: 0.6,
                miterLimit: 3,
                lineCap: 'miter'
            },
	        marker: {
	            radius: 4
	        },label: {
	            field: 'val',
	            display: 'over'
	        }
        },
        axes: [{
            type: 'numeric',
            position: 'left',
            fields: ['val'],
            titleMargin: 12,
            title: {
                text: 'См'
            }
        }, {
            type: 'category',
            visibleRange: [0, 1],
            position: 'bottom',
            fields: ['date'],
            titleMargin: 12,
            title: {
                text: 'Дата'
            }
        }]
    }

});