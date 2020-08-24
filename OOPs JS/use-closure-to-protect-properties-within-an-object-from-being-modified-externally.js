function Bird() {
  let weight = 15;
/* publicly available method that a bird object can use */
  this.getWeight = function() { 
    return weight;
  };

}
