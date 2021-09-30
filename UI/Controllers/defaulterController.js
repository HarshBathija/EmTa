var DefaulterModule = angular.module("DefaulterApp", []);
DefaulterModule.controller("DeftCtrl", function ($scope,$http) {
   $http.get('https://meal-tracking-assistant.herokuapp.com/getDefaultersList')
   .success(function(data){

     function checkAdult(obj){

       return obj != null;

     }
     
     data = data.filter(checkAdult);

     $scope.defaulterList = data;
   })
   .error(function(data,status){
     console.error('Fail to load data', status, data);
     $scope.defaulterList = { };
   });
 });