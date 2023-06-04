exports.addition = function(a,b) {
    return a + b;
}

exports.substraction = function(a,b) {
    return a - b;
}


exports.multiplication = function(a,b) {
    return a * b;
}

exports.divison = function(a,b) {
    return a / b;
}

exports.square = function(a) {
    return a * a;
}

exports.sum = function(...numbers) {
    return numbers.reduce((total, current) => total + current, 0);
  }