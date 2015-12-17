Ext.define('app.view.StatisticButtocksChart', {
    extend: 'Ext.Panel',
    alias: 'widget.statistic-buttocks',
    requires:[
    	'app.store.MeasurementButtocksStore'
    ],
    
    width: '100%',
	title: 'Ягодицы',
        items: {
        xtype: 'cartesian',
        reference: 'chart',
        width: '100%',
        height: 500,
        store: {
    		type: 'measurement-buttocks'
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