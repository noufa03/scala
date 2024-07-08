import scala.util.Random
object array{
     var array1=Array("fruits and vegetables","dairy products","meat and seafood","beverages","snacks")
        val array2=Array(200,100,20,140,100)
    def main(args:Array[String]):Unit={
       
        println(displayInventory(array1,array2))
        println(restockItem("snacks",20))
        println(sellitem("beverages",150))
    }
    
    def displayInventory(array1:Array[String],array2:Array[Int]):String={
      var array3=array1.zip(array2).map{case(name,quantities) =>
        s"${name}:${quantities}"
        }

     array3.mkString("\n") 
       

    }
    def restockItem(itemname:String,quantity:Int):Unit={
        val index=array1.indexOf(itemname)
        if(index != (-1)){
            array2(index) +=quantity
             println("------------------")
            println("Updated items after restocking")
            println("------------------")
           
            println(displayInventory(array1,array2))
        }
        else{
            println("item not found")
        }

    }
    def sellitem(itemname:String,quantity:Int):Unit={
        val index=array1.indexOf(itemname)
        if (index != (-1)){
            array2(index) -=quantity
            if(array2(index) <0 ){
                println("Not enough to sell")
            }
            else{
            println("------------------")
            println("Updated items after selling")
            println("------------------")
            println(displayInventory(array1,array2))
            }


           
        }
         else{
            println("item not found")
        }
    }

    }


object patternmatching{
    val random=new Random()
    val randomint=random.between(-10,0)
 
     def main(args:Array[String]):Unit={
         val input=scala.io.StdIn.readLine("Enter a number: ").toInt

         matchtest(input)

     }

     def matchtest(x:Int ): Unit= x match{
        case x if x<=0 => print(randomint)
        case x if x%2==0 => print(random.nextInt(10)*2+2)
        case x if x%2 !=0 => print(random.nextInt(10)*2+1)

     }
}
object nameformatter{
     def main(args:Array[String]):Unit={
        
        println(formatNames("benny")(toupper))
        println(formatNames("Niroshan")(s=> s.head.toUpper+s.tail(1).toUpper.toString+s.slice(1,s.length)))
        println(formatNames("SAMAN")(toupper))
        print(formatNames("Kumara")(s=>s.head.toUpper + s.slice(1,s.length-1)+ s.last.toUpper.toString))
     }
     def toupper(s:String): String= s.toUpperCase

    
      def tolower(s:String):String=s.toLowerCase

     

     def formatNames(s:String)(function: String=>String):String=function(s)
     
}
