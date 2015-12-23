Ext.application({
    name: 'app',
    appFolder: 'resources/app',
    launch: function() {
            Ext.create('app.view.MainViewport');
    }
});