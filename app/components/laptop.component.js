'use strict';
angular.module('app')
    .component('laptop', {
        templateUrl: 'components/laptop.template.html',
        controller: function LaptopController(MainService, $scope, $attrs) {

            this.getLaptop = () => {
                return MainService.getLaptop();
            }

            this.bash = (laptop) => {
                MainService.setLaptop(laptop);
            }
        },
        bindings: {
            laptop: '<'
        }

    });