'use strict';
angular.module('app')
    .service('MainService', function () {

        let laptop = null;

        return {
            setLaptop: (l) => {
                console.log(l);
                this.laptop = l;
            },

            getLaptop: () => {
                return this.laptop;
            }
        }

    });