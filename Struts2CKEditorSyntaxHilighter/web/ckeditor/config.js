/*
Copyright (c) 2003-2011, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
    config.extraPlugins = 'syntaxhighlight';
    //config.toolbar_Full.push(['Code']);
    
    config.toolbar = 'MyToolbar';

	config.toolbar_MyToolbar =
	[
		{ name: 'clipboard', items : [ 'Undo','Redo' ] },
                { name: 'basicstyles', items : [ 'Bold','Italic','Strike','-','RemoveFormat' ] },
		{ name: 'paragraph', items : [ 'NumberedList','BulletedList'] },
		{ name: 'links', items : [ 'Link','Unlink','Anchor' ] }
	];
        config.toolbar_MyToolbar.push(['Code']);

    //config.language='en';
// Define changes to default configuration here. For example:
// config.language = 'fr';
// config.uiColor = '#AADC6E';
};
