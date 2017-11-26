'use strict';
angular.module('app')
    .component('overview', {
        templateUrl: 'components/overview.template.html',
        controller: function OverviewController() {

            return {
                getComponent: (component) => {
                    for (let c in component) {
                        if (component[c].selected) {
                            return component[c];
                        }
                    }
                },

                getTotal: (laptop) => {
                    let total = laptop.price;
                    for (let component in laptop.components) {
                        let c = new OverviewController().getComponent(laptop.components[component]);
                        if(c) total += c.price;
                    }
                    return total;
                }
            }
        },
        bindings: {
            laptop: '<',
            user: '<'
        }

    });