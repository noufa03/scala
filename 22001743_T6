//question1
import scala.math.Fractional.Implicits.infixFractionalOps
object inventorymanageent extends App{
    
    // id->productname,quantity,price
    val inventory1:Map[Int,(String,Int,Double)]=Map(101 -> ("ProductA",120,12.3),102 -> ("ProductB",130,13.3),103 -> ("ProductC",110,11.3))
    val inventory2:Map[Int,(String,Int,Double)]=Map(104 -> ("ProductD",120,18.3),102 -> ("ProductB",150,13.3),103 -> ("ProductC",100,11.3))

    val retrievevaluesName=inventory1.values.map(_._1)
    println(retrievevaluesName)

    val totalvalue=inventory1.values.map{
        case(_,quantity,price)=>quantity*price}.sum

    println(totalvalue)
    val isempty=inventory1.isEmpty
    println(isempty)

 
// inventory 3 with 2 inventory concat
   
      val inventory3=inventory1 ++ inventory2
      println(inventory3)


      if(inventory1.contains(108)){

      val details=inventory3(108)// product a details
      println(details)
      }else{
        println("not found ")
      }
    
    
}


//question2




object students{
    def main(args:Array[String]):Unit={
        getStudentInfo()
    }
    def getStudentInfo(): Unit={
        println("Enter name :")
        val name=scala.io.StdIn.readLine()
        println("Enter marks:")
        val marks=scala.io.StdIn.readInt()
        println("Enter the Total marks of the subjest:")
        val max=scala.io.StdIn.readInt()
        val percentage:Double=(marks.toDouble/max.toDouble)*100
        var grade='A'
        if(validateInput(marks,max,name)){
            if(percentage >= 90){
                grade='A'
               
            }
            else if(75 <= percentage && percentage <= 90 ){
                grade='B'
               
            }
            else if(50 <= percentage && percentage <= 75){
                grade='C'
             
            }else if(percentage < 50){
                grade='D'
                
            }else{
                println("fail")
            }
            val students=(name,marks,max,percentage,grade)
                 printStudentRecord(students)
           
                
        

        }else{
            getStudentInfoWithRetry(marks,max,name)
        }

    }

    def printStudentRecord(record:(String,Int,Int,Double,Char)):Unit={
        println("Student Details")
        val (name,marks,max,percentage,grade)=record
        println(s"name :$name")
        println(s"marks:$marks")
        println(s"from: $max")
        println(s"percentage:$percentage")
        println(s"Grade:$grade")
    }

    def validateInput(x:Int,y:Int,name:String): Boolean={
        name.nonEmpty &&  (x < y) &&  (x > 0)
      
    }
    def getStudentInfoWithRetry(x:Int,y:Int,name:String):Unit={
        if(!validateInput(x,y,name))
            println("Invalid marks enter again")
            getStudentInfo()
    }


}

