
//question01
import scala.io.StdIn.readLine

object c{
def encrptchar(c:Char):Char={
    if(c.isLetter){
        val base=if(c.isLower)'a' else 'A'
        (((c-base+4)%26)+base).toChar

    }else{
        c
    }
}

def decrptchar(c:Char):Char={
      if(c.isLetter){
        val base=if(c.isLower)'a' else 'A'
        (((c-base-4)%26)+base).toChar

    }else{
        c
    }
}

def decription(x:String):String={
 x.map(c=>decrptchar(c))
}

def encription(x:String):String={
x.map(c=>encrptchar(c))
}



 
 def main(args:Array[String]):Unit={
    val choice:String=readLine("Enter the choice(e (encription) or d(decription)):")
    val userinput=readLine("Enter the string:")
    
   if(choice=="e"){
   println(encription(userinput)) 
   }else if(choice=="d"){
   println( decription(userinput))
   }else{
    println("Invalid response!")
    
   }
}
}
//question02
import scala.io.StdIn.readLine
object numbers{
    def main(args:Array[String]):Unit={
      val input:Int=readLine("Enter a integer:").toInt

      val mul3:Int=>Boolean= _%3==0
      val mul5:Int=>Boolean=_%5==0
    val mul3and5:Int=>Boolean=n=>mul3(n) && mul5(n)

    val result=input match{
         case n if mul3and5(n)=>"multiple of 3 and 5"
        case n if mul3(n)=>"multiple of 3"
        case n if mul5(n)=>"multiple of 5"
       case _=>"not a multiple of 3 and 5"
    }
    println(result)
    }
}
