'use strict';
angular.module('app')
    .component('laptop', {
        templateUrl: 'components/laptop.template.html',
        controller: function LaptopController(MainService, $scope, $attrs) {

            this.init = () => {
                $scope.laptop = JSON.parse($attrs.laptop);
            }

            this.bash = (laptop) => {
                MainService.setLaptop(laptop);
            }
        }

    });