'use strict';
angular.module('app')
    .component('picker', {
        templateUrl: 'components/picker.template.html',
        controller: function PickerController(LaptopFactory, $scope) {
            
            LaptopFactory.getLaptops().then(laptops => {
                $scope.laptops = laptops;
            });

            this.bash = (laptop) => {
                $scope.laptop = laptop;
            }
        }

    });