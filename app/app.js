'use strict';
const app = angular.module('app', [
    'ngMaterial'
]);

app.controller('MainCtrl', function MainCtrl(MainService) {
    return {
        getLaptop: () => {
            return MainService.getLaptop();
        }
    }
});