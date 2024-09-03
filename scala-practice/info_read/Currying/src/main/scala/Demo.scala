object Demo {
  /*  Currying es la técnica de transformar una función que tiene multiples argumentos
  //  en una función que tome un argumento simple
  //  En realidad lo transforma en una cadena de funciones, cada una con un parametro
  //          (Int,Int)=>Int
  //  se transforma en
  //           Int => Int => Int
  */
  def sumar(x:Int,y:Int) = x+y
  def sumar1 (x:Int) = (y:Int) => x+y
  def sumar2 (x:Int) (y:Int) = x+y


  def main(args: Array[String]): Unit = {
      println(sumar(10,20))
      println(sumar1(20)(40))
      val v1=sumar1(50)
      println(v1(100))
      println(sumar2(90)(80))
      val v2=sumar2(90)_
      println(v2(900))

  }


}
