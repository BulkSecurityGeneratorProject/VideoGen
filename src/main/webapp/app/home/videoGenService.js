(function () {
    'use strict';
    angular
        .module('videoGenApp')
        .factory('Generate', Generate);

    Generate.$inject = ['$resource'];

    function Generate($resource) {
        var service = $resource('api/generate', {}, {
            'get': { method: 'GET', params: {}, isArray: false}
        });
        return service;
    }
})();
