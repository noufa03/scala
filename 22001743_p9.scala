//question1

import scala.io.StdIn
object interest{
    def main(args:Array[String]):Unit={

        println("Enter the deposit:")

        val userinput=StdIn.readInt()
        
        
        println("Interest is:"+interestfunction(userinput))
    }

  
    
    val interest1:Int=>Double=(x:Int) => x*2/100
    val interest2:Int=>Double=(x:Int) => x*3.5/100
    val interest3:Int=>Double=(x:Int) => x*4/100
    val interest4:Int=>Double=(x:Int) => x*6.5/100



    def interestfunction(x:Int):Double=x match{
        case _ if x <=20000 =>interest1(x)
          case _ if x <=200000 => interest2(x)
            case _ if x <=2000000 => interest3(x)
              case _ if x >=20000000 => interest4(x)
              case _ =>0.0 
            
    }
    
}

//question 2

import scala.io.StdIn
object numbers{
    def main(args:Array[String]):Unit={

        println("Enter a number:")

        val userinput=StdIn.readInt()
        
        
        println("Number is:"+number(userinput))
    }

    val negative:Int=>String=(x:Int)=>"Negative"
    val zero:Int=>String=(x:Int)=>"Zero"
    val even:Int=>String=(x:Int)=>"Even Number"
    val odd:Int=>String=(x:Int)=>"odd number"

    def number(x:Int):String=x match{
        case _ if x <0 => negative(x)
          case _ if x==0 => zero(x)
            case _ if x%2==0 => even(x)
              case _ if x%2 != 0 => odd(x)
             
            
    }
    
}

//question 3

import scala.io.StdIn
object letters{
    def main(args:Array[String]):Unit={

        println("Enter a word:")

        val userinput=StdIn.readLine()
        
        println("Choose the operation:\n1.uppercase\n2.lowercase\n3.format to upper \n4.format to lower\n5.format first 2 letters upper\n6.last letter to capital\n7.default one")
        val choice=StdIn.readInt()
        printf(operations(choice,userinput))

        
    }
  


def upper(y:String):String=y.toUpperCase()
def lower(y:String):String=y.toLowerCase()
def format(y:String,function:String=>String):String=function(y)




    def operations(x:Int,y:String):String=x match{
        case _ if x==1 =>upper(y)
          case _ if x==2 => lower(y)
          case _ if x==3 => format(y,upper)
          case _ if x==4 => format(y,lower)
          case _ if x == 5=>format(y.substring(0,2),upper).concat(format(y.substring(2),lower))
          case _ if x==6 =>format(y.substring(0,y.length-1),lower).concat(format(y.substring(y.length-1),upper))
          case _ if x==7 =>format(y.substring(0,2),lower)+(format(y.substring(2,4),upper))+format(y.substring(4),lower)
            
          
             
            
    }
    
}
