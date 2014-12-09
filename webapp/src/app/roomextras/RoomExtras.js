angular
    .module('webapp.room.extras')
    .controller('RoomExtrasCtrl', function ($scope, $window, list) {
        'use strict';

        list.query(function (data) {
            $scope.roomExtras = data;
        });

        $scope.add = function () {

        };


    })

    .factory("list", function ($resource) {
        return $resource("/api/room/extras", {}, {
            query: { method: "GET", isArray: true }
        });
    });
