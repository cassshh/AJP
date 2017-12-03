'use strict';
angular.module('app')
    .factory('LaptopFactory', ['$http', function ($http) {
        return {
            getLaptops: () => {
                return $http.get('http://www.mocky.io/v2/5a1ad0b8310000dd30d91f6c').then(response => {
                    return response.data;
                });
            }
        }
    }]);