angular.module('webapp.todo', []);

angular
    .module('webapp.todo')
    .controller('todo-controller', function ($scope, $window) {
        'use strict';


        $scope.todos = JSON.parse($window.localStorage.getItem('todos') || '[]');
        $scope.$watch('todos', function (newTodos, oldTodos) {
            if (newTodos !== oldTodos) {
                $window.localStorage.setItem('todos', JSON.stringify(angular.copy($scope.todos)));
            }
        }, true);

        $scope.add = function () {
            var todo = {label: $scope.label, isDone: false};
            $scope.todos.push(todo);
            $window.localStorage.setItem('todos', JSON.stringify(angular.copy($scope.todos)));
            $scope.label = '';
        };

        $scope.check = function () {
            this.todo.isDone = !this.todo.isDone;
        };
    });


angular.module('webapp.room.extras', []);

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

angular.module('webapp.bed.types', []);


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

(function (module) {
    try {
        module = angular.module('webapp');
    } catch (e) {
        module = angular.module('webapp', []);
    }
    module.run(['$templateCache', function ($templateCache) {
        $templateCache.put('/webapp/bedtypes/BedTypesTemplate.html',
            '<h3>Bed Types</h3><table class="table"><tr><th>ID</th><th>Name</th><th>Length</th><th>Width</th><th>Places</th></tr><tr ng-repeat="bedType in bedTypes"><td>{{bedType.id}}</td><td>{{bedType.name}}</td><td>{{bedType.length}}</td><td>{{bedType.width}}</td><td>{{bedType.places}}</td></tr></table>');
    }]);
})();

(function (module) {
    try {
        module = angular.module('webapp');
    } catch (e) {
        module = angular.module('webapp', []);
    }
    module.run(['$templateCache', function ($templateCache) {
        $templateCache.put('/webapp/roomextras/RoomExtrasTemplate.html',
            '<h3>Room Extras</h3><table class="table"><tr><th>ID</th><th>Title</th><th>Description</th></tr><tr ng-repeat="roomExtra in roomExtras"><td>{{roomExtra.id}}</td><td>{{roomExtra.title}}</td><td>{{roomExtra.description}}</td></tr></table>');
    }]);
})();

(function (module) {
    try {
        module = angular.module('webapp');
    } catch (e) {
        module = angular.module('webapp', []);
    }
    module.run(['$templateCache', function ($templateCache) {
        $templateCache.put('/webapp/todo/todo.html',
            '<h3>Todo</h3><ul class="todo-list"><li class="todo-item" ng-repeat="todo in todos" ng-class="{\'todo-done\': todo.isDone}"><label><input type="checkbox" ng-click="check()" ng-model="todo.isDone">&nbsp;{{todo.label}}</label></li><li class="todo-item"><form ng-submit="add()"><input placeholder="New item..." ng-model="label"> <button type="submit" ng-disabled="posting || !label">Add</button></form></li></ul>');
    }]);
})();
