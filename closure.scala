object realtimeClosure {
 def main (args:Array[String]) {
   println("x(1) value =" + x(1))
   println("x(2) value =" + x(2))
 }
 var factor =3;
       var x=(i:Int) => i * factor
}