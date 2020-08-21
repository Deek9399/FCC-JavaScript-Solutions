// Only change code below this line
function countdown(n){
  if (n<1){
  return [];
  }else{
  var array = countdown(n-1);
  array.unshift(n);
  return array;
  }
}
// Only change code above this line
