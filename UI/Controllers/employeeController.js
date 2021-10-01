var app = angular.module('MyApp', [])
        app.controller('MyController', function ($scope, $http) {
            $scope.ShowAlert = function () {
                console.log($scope.Name);
                let x = $scope.Name;
                let y = "https://meal-tracking-assistant.herokuapp.com/studentDetails?sid="
                let res = y.concat(x);
                console.log(res);
                $http.get(res)
   .success(function(data){
     console.log(data)
     $scope.studentDetails = data;
     console.log(studentDetails)
   })
   .error(function(data,status){
     console.error('Fail to load data', status, data);
     $scope.studentDetails = { };
   });
            }
        });
