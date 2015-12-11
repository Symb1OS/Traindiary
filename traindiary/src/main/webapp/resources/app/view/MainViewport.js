Ext.define('app.view.MainViewport', {
    extend : 'Ext.container.Viewport',
    alias : 'widget.mainViewport',
    requires: [
        'app.view.MainContainer'
    ],
    layout: 'center',
    style : 'background-image: url(resources/image/log-background.jpg)',
    items : [{
        xtype : 'mainContainer'
    }]
});