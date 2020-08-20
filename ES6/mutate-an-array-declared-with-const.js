const s = [5, 7, 2];
function editInPlace() {
  'use strict';
  // Only change code below this line
s[0]=2;
s[1]=5;
s[2]=7;
  // Using s = [2, 5, 7] would be invalid

  // Only change code above this line
}
editInPlace();

//It is important to understand that objects (including arrays and functions) assigned to a variable using const are still mutable. Using the const declaration only prevents reassignment of the variable identifier.