// For any third party dependencies, like jQuery, place them in the lib folder.

// Configure loading modules from the lib directory,
// except for 'app' ones, which are in a sibling
// directory.
requirejs.config({
    paths: {
    	hi5: 'hi5/hi5',
    	jquery: 'jquery/jquery-1.12.4.min',
    	jquery-ui: 'jquery-ui/jquery-ui.min'
    }
});

// Start loading the main app file. Put all of
// your application logic in there.
requirejs(['demo/app']);
