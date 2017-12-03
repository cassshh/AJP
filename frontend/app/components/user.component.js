'use strict';
angular.module('app')
    .component('user', {
        templateUrl: 'components/user.template.html',
        controller: function UserController() {
        },
        bindings: {
            user: '<'
        }

    });