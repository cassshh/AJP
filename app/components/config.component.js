'use strict';
angular.module('app')
    .component('config', {
        templateUrl: 'components/config.template.html',
        controller: function ConfigController(MainService, $scope) {
            $scope.$watch('component', (newVal) => {
                if(!newVal) return;
                MainService.setComponent(this.key, newVal);
            });
        },
        bindings: {
            config: '<',
            key: '<'
        }

    });