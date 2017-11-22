'use strict';
const app = angular.module('app', [
    'ngMaterial'
]);

app.controller('MainCtrl', function MainCtrl(LaptopFactory, MainService) {

    LaptopFactory.getLaptops().then(laptops => {
        this.laptops = laptops;
    });

    return {

        getLaptops: () => {
            return this.laptops;
        },

        getLaptop: () => {
            return MainService.getLaptop();
        }
    }
});