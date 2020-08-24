function Animal() { }
Animal.prototype.eat = function() { console.log("nom nom nom"); };

function Dog() { }

// Only change code below this line
Dog.prototype=Object.create(Animal.prototype);
Dog.prototype.bark = function(){
  console.log("Woof!");
}

Dog.prototype.constructor = Dog;
// Only change code above this line

let beagle = new Dog();
