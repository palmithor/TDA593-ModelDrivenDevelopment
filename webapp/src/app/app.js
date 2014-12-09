angular.module('webapp', [
    'ngRoute',
    'ngResource',
    // app
    'webapp.todo',
    'webapp.room.extras',
    'webapp.bed.types'
])
    .config(function ($routeProvider) {
        'use strict';
        $routeProvider
            .when('/todo', {
                controller: 'TodoCtrl',
                templateUrl: '/webapp/todo/todo.html'
            })
            .when('/room/extras', {
                controller: 'RoomExtrasCtrl',
                templateUrl: '/webapp/roomextras/RoomExtrasTemplate.html'
            })
            .when('/bed/types', {
                controller: 'BedTypesCtrl',
                templateUrl: '/webapp/bedtypes/BedTypesTemplate.html'
            })
            .otherwise({
                redirectTo: '/todo'
            });
    });
