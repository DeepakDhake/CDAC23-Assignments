exports.factorial = function (num) {
    fact = 1;
    for (var i = 1; i <= num; i++) {
        fact = fact * i;
    }
    return fact;
}

exports.myprime = function (num) {
    var flag;
    if (num === 0) {
        console.log("0 is less than 1 so can't be prime")
    }

    if (num === 1) {
        console.log("Not a prime number");
    }

    for (var i = 2; i < num; i++) {
        if (num % i == 0) {
            flag = false;
        } else {
            flag = true;
        }
    }

    if (flag) {
        console.log("Number is a prime Number");
    } else {
        console.log("Number is not a prime Number");
    }
}

exports.printable = function(num) {
    for(var i = 1; i <=10; i++)
    {
        // num = num * i;
        console.log(num * i,"=",num);
    }
}