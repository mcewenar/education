object Closure {
  /* Un closure es una función que usa una o mas variables declaradas fuera de la función */
  var numero=90
  val sumar =(x:Int)=> {
    numero=x+numero
    numero
  }

  def main(args: Array[String]): Unit = {
      numero=900
      println(sumar(100))
      println(numero)
  }
}
