class ClosuresFunc {
  //Closure es una funcion que usa una o más variables declaradas fuera del ámbito (scope) de la funcion:

  //Object option type:
  val option1: Option[Int] = None;

  var num: Int = 20
  //Está tomando variables fuera de la función
  val sum = (x:Int) => {
    //Se reescribió la variable dentro del scoop de la funcion
    num = 100
    num=x+num
    //num = 100
    println("VARIABLE DENTRO FUNCION CLOSURE: "+num)
    num
    //num = 100
    //x+num
  }

}
