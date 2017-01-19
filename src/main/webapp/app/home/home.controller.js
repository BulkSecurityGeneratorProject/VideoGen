(function () {
    'use strict';

    angular
        .module('videoGenApp')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$scope', 'Principal', 'LoginService', '$state'];

    function HomeController($scope, Principal, LoginService, $state) {
        var vm = this;
        $scope.var = "test";
        vm.account = null;
        vm.isAuthenticated = null;
        vm.login = LoginService.open;
        vm.register = register;
        $scope.$on('authenticationSuccess', function () {
            getAccount();
        });

        getAccount();

        function getAccount() {
            Principal.identity().then(function (account) {
                vm.account = account;
                vm.isAuthenticated = Principal.isAuthenticated;
            });
        }

        function register() {
            $state.go('register');
        }

        $scope.generate = function () {
            $http.get('api/generate').then(function (response) {
                alert("1");
                $scope.var = response.data;
            }, function (response) {
                alert("2");
            });
        };

    }
})();
