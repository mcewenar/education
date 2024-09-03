class CurryingFunc {

  //Currying es la técnica de transformar una funcion que tiene multiples argumentos en una función que tome un argumento simple.
  //En realidad lo transforma en una cadena de funciones, cada una con un parámetro:
  // (Int, Int) => Int
  //Se transforma en:
  //Int => Int => Int


  def sum2(x: Int, y:Int): Int  = x+y

  //Funcion currying (FORMAL):
  def sum3(x: Int) = (y: Int) => x+y

  //Funcion currying (INFORMAL modo SCALA):
  def sum4(x:Int) (y:Int) = x+y







}
