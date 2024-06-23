


object question1{
    def main(args:Array[String]):Unit={
var k,j,i =2

var m,n =5


var f= 12.0f;
var g = 4.0f;
var c = 'X';

println (s"k + 12 * m=${k+12*m}")
println(s" m / j=${m/j}")
println( s"n % j=${n%j}")
println(s"m / j * j=${m/j*j}")
println(s"f + 10*5 +g=${f+10*5+g}")
i +=1
println (s"++i * n=${i*n}")

}}

object question2{
    def main(args:Array[String]):Unit={
 var  a ,g= 2
 var  b = 3 
 var c = 4
 var d = 5
 var k = 4.3f
b -=1
d -=1
  println(s" --b * a + c *d--=${b*a+c*d}");
 println(s"a++=${a+1}");
println (s"–2 * ( g – k ) +c=${-2*(g-k)}");
println (s"c=c++=${c+1}");
c=c+1
a=a+1
println (s"c=++c*a++=${c*a}");

        
    }
}

object question3{
    def main(args:Array[String]):Unit={
        def takehomesalary(normal:Int,ot:Int):Double={
            var normalsalary=normal*250
            var otsalary=ot*85

            var tax=(normalsalary+otsalary)* 0.12   
            var takehome=normalsalary+otsalary-tax


            takehome
            }
            println(takehomesalary(40,30))

    }
}

object  question4{
    def main(args:Array[String]):Unit={//ticket prices should be(10,15,20) 
        def bestticketprice(ticketprice:Int):Double={
            var initial_ticket_price=15
            var noofattendees=120
            var cost=0

            if(ticketprice==20){
                noofattendees +=20
                cost=500+noofattendees*3

            }
            else{
                noofattendees -=20
                cost=500+noofattendees*3
            }

            var profit:Double=ticketprice*noofattendees-cost
            profit
            
           
            
       
        }

        def max(x:Double,y:Double):Double={
            if(x>y){
                x
            }
            else{
                y
            }
        }
         var m=max(bestticketprice(10),bestticketprice(20))
         if(m==bestticketprice(10)){
            println("best ticket price is 10")
         }
         else{
              println("best ticket price is 20")
         }



}}
