var sapp = angular.module('scartApp', []);
sapp.controller('SCartController', function($scope, $http){
  
  $scope.send = function(SID, total, SName){

    var data = {

        sid : SID,
        meal_cost: total,
        meal_store: Sname

    }
    console.log(data);
    $http.post("https://meal-tracking-assistant.herokuapp.com/updateMealRecord", data)
            .then(function(response){
                    console.log(response);
            })

  }
})