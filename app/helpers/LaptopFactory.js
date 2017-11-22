'use strict';
angular.module('app')
    .factory('LaptopFactory', ['$http', function ($http) {
        return {
            getLaptops: () => {
                return $http.get('helpers/data.json').then(response => {
                    return response.data;
                });
            }
        }
    }]);