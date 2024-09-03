class Practice {

  //Recibe una funcion como argumento
  def example1(funcion: Unit) {
    funcion
  }

  def example2(cifra1: Int, f:(Int)=> Int): Int = {
    f(cifra1)
  }

}

object Main {
  def main(args: Array[String]): Unit = {

    var pr1 = new Practice()
    pr1.example1(println("NADA"))

    def multi(numero:Int): Int = {
      numero*5
    }

    //Use pre created function
    println(pr1.example2(10,multi))


    //Use anonymity function
    println(pr1.example2(10,(x:Int)=>x*20))

    var pr2 = new CurryingFunc();
    println("INVOCACION NORMAL DE FUNCION: "+ pr2.sum2(10,20))

    //Invocacion metodo currying:
    println("INVOCACION METODO SUMA POR CURRYING: "+pr2.sum3(30)(20))

    //EJEMPLO FUNCIONES CURRYING USANDO FUNCIONES QUE SE APLICAN DE FORMA PARCIAL:
    val partialCurrying = pr2.sum3(50);
    println("CURRYING AND PARTIALLY PRINT: "+ partialCurrying(100));

    println(pr2.sum4(90)(80))
    //Modo parcial con sintaxis Scala:
    val partialCurrying2 = pr2.sum4(60)_
    println("CURRYING AND PARTIALLY PRINT SCALA SYNTAX: "+partialCurrying2(600))


    //Closures:
    var closuresFunc = new ClosuresFunc();

    println("CLOSURE FUNC: " + closuresFunc.sum(100))

  }
}
