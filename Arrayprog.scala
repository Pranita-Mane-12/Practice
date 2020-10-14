

object Arrayprog {
  def main(args:Array[String]){
    var myList = Array(2.9, 3.2, 6.8, 4.6)
    for(x<-myList) {
      println(x)
    }
    var total = 0.0;
    for(i<- 0 to (myList.length - 1)){
      total += myList(i);          
    }
    println("Total is:" +total)
    
    
    var max = myList(0);
    for(i <- 1 to (myList.length - 1)){
      if(myList(i)> max)max=myList(i);
      }
    println("max number is:" +max);
    
  }
}