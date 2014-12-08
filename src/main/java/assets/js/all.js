/*================================================================
 =>                  App = test
 ==================================================================*/
/*global angular*/

var app = angular.module('test', ['ngCookies', 'ngResource', 'ngSanitize', 'ngRoute', 'ngAnimate', 'ui.utils', 'ui.bootstrap', 'ui.router', 'ngGrid']);


app.config(['$routeProvider', '$locationProvider', '$httpProvider', function ($routeProvider, $locationProvider, $httpProvider) {
    'use strict';

    $routeProvider
        .when('/home', {
            templateUrl: '/assets/templates/home.html',
            controller: 'ControllerA'
        })
        .otherwise({
            redirectTo: '/home'
        });

    $locationProvider.hashPrefix('!');

    // This is required for Browser Sync to work poperly
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
}]);


/*================================================================
 =>                  test App Run()
 ==================================================================*/

app.run(['$rootScope', function ($rootScope) {

    'use strict';

    console.log('Angular.js run() function...');
}]);


/* ---> Do not delete this comment (Values) <--- */

/* ---> Do not delete this comment (Constants) <--- */

'use strict';

app.controller('ControllerA', function ($scope) {
    $scope.name = 'Steve A';
});

'use strict';

app.controller('ControllerB', function ($scope) {
    $scope.name = 'Steve B';
});
