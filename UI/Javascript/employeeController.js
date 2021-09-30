var employeeAppModule = angular.module("employeeApp", []);
 employeeAppModule.controller("employeeCtrl", function ($scope,$http) {
    
   $http.get('https://meal-tracking-assistant.herokuapp.com/studentDetails?$scope.StudentID')
   .success(function(data){
     console.log(data)
     $scope.studentDetails = data;
   })
   .error(function(data,status){
     console.error('Fail to load data', status, data);
     $scope.studentDetails = { };
   });
 });
