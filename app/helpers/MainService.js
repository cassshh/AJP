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
            },

            setComponent: (key, val) => {
                for (let component in this.laptop.components) {
                    if (key == component) {
                        for (let c in this.laptop.components[component]) {
                            if (val == c) {
                                this.laptop.components[component][c].selected = true;
                            } else {
                                delete this.laptop.components[component][c].selected;
                            }
                        }
                    }
                };
            }
        }

    });