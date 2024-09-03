"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
console.log("HELLO WORLD");
alert("hello hello compile");
function getAdmin(bol) {
    return bol;
}
getAdmin(true);
function isEqualTo(num) {
    return num == 1;
}
console.log(isEqualTo(3));
console.log(isEqualTo(1));
//Definir un array:
var arr;
arr = [1, "manuel", 2000, 40, 34];
function multiply() {
    var total = 0;
    total = arr[2] * arr[3];
    console.log("El valor total es " + total);
}
multiply();
