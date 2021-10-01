var sapp = angular.module('scartApp', []);
sapp.controller('SCartController', ['$scope','$http', function($scope,$http) {
  $scope.SID = '';
  $scope.SName = "";
  $scope.total = 0;
$scope.items = [
{Name: 'French Fries', quantity: 1, price: 3},
{Name: 'Spinach Veggie Wrap', quantity: 1, price: 5},
{Name: 'Garden Hummus', quantity:1, price: 5},
{Name: 'Black Bean Burger', quantity:1, price: 7},
{Name: 'Veggie Bowl', quantity: 1, price: 8},
{Name: 'Jasons tots', quantity: 1, price: 5},
{Name: 'Soft Drink', quantity:1, price: 2.5},
{Name: 'Black Bean Burger', quantity:1, price: 7}
];
$scope.selectedItems = [];

$scope.add = function(number) {

  $scope.total =  $scope.total+$scope.items[number].price*$scope.items[number].quantity;
  $scope.selectedItems.push($scope.items[number]);
}
$scope.send = function(SID, total, SName){

  console.log(SID);
  console.log(SName);
  console.log(total);

  $http.post('https://meal-tracking-assistant.herokuapp.com/updateMealRecord', {'sid' :$scope.SID, "meal_cost": $scope.total, "meal_store" :$scope.SName })
  .success(function(response) {$scope.userData = response.users; $scope.message = response.message;});

}



}]);
