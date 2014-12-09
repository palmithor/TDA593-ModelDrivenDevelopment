angular
    .module('webapp.bed.types')
    .controller('BedTypesCtrl', function ($scope, $window, listBedTypes) {
        'use strict';

        listBedTypes.query(function (data) {
            $scope.bedTypes = data;
        });

        $scope.add = function () {

        };


    })

    .factory('listBedTypes', function ($resource) {
        'use strict';

        return $resource('/api/bed/types', {}, {
            query: { method: 'GET', isArray: true }
        });
    });
