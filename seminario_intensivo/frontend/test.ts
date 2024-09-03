//import {User} from "./User.ts";


console.log("HELLO WORLD")

alert("hello hello compile")

function getAdmin(bol: boolean): boolean {
    return bol;
}

getAdmin(true)

function isEqualTo(num: number): boolean {
    return num == 1;
}

console.log(isEqualTo(3));
console.log(isEqualTo(1));

//Definir un array:
let arr: [number,string,number,number,number];

arr = [1,"manuel",2000,40,34];


function multiply() {
    let total = 0;
    total = arr[2]*arr[3];
    console.log("El valor total es " + total);
}

multiply();

