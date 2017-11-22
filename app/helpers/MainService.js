'use strict';
angular.module('app')
    .service('MainService', function () {

        let laptop = null;
        let config = false;

        return {
            setLaptop: (l) => {
                console.log('Bash\'d', l);
                this.laptop = l;
            },

            getLaptop: () => {
                return this.laptop;
            }
        }

    });