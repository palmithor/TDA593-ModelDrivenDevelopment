angular.module('webapp', [
    'ngRoute',
    'ngResource',
    // app
    'webapp.todo',
    'webapp.room.extras'
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
            .otherwise({
                redirectTo: '/todo'
            });
    });
