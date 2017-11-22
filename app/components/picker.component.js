'use strict';
angular.module('app')
    .component('picker', {
        templateUrl: 'components/picker.template.html',
        controller: function PickerController(LaptopFactory, MainService, $scope) {
            
            LaptopFactory.getLaptops().then(laptops => {
                $scope.laptops = laptops;
            });

            this.bash = (laptop) => {
                MainService.setLaptop(laptop);
            }
        }

    });