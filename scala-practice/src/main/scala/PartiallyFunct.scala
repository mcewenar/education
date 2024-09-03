class PartiallyFunct {

  //FUNCIONES QUE SE APLICAN DE FORMA PARCIAL.
  //Partially applied functions: pasar algunos parámetros o algunos de los argumentos que requiera
  // una función, pero no todos. El resto de los argumentos demorarlos para más tarde.

  def calculate(n1: Int, n2: Int, n3: Int): Int = {
    n1+n2+n3
  }


  val partiallyFunct = calculate(1,2, _:Int)
  partiallyFunct(4);

  val sum = (n1:Int,n2:Int,n3:Int) => n1+n2+n3

  val v1 = sum(_:Int,3,6)
  v1(56)




}
