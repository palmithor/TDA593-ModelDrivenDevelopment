angular
    .module('webapp.room.extras')
    .controller('RoomExtrasCtrl', function ($scope, $window, listRoomExtras) {
        'use strict';

        listRoomExtras.query(function (data) {
            $scope.roomExtras = data;
        });

        $scope.add = function () {

        };


    })

    .factory('listRoomExtras', function ($resource) {
        'use strict';

        return $resource('/api/room/extras', {}, {
            query: { method: 'GET', isArray: true }
        });
    });
