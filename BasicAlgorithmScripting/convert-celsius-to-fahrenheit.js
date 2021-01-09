function convertToF(celsius) {
  let fahrenheit = (celsius * (9/5)) + 32;

  return fahrenheit;
}

let F = convertToF(30);
console.log(F)
