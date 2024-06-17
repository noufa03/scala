

object questions {
    def main(args:Array[String]):Unit={
        area(5)
        convert(35)
        volume(5)
        
        
    }
    def area(r:Int):Unit={//question1
        val area=3.14*r*r
        println(area)
    }
    def convert(c:Double):Unit={//question2
        val f =c*1.800+32.00
        println(f)
    }
    def volume(r:Int):Unit={//question 3
        val v=4/3*3.14*r*r*r
        println(v)
    }

}

object questions2{
    def main(args:Array[String]):Unit={
        val n:Int=58
      println(total(n))

    }
    def discount(n:Int):Double={// n is the number of books
        val coverprice=24.95
        val reducedPriceforonebook=coverprice-0.4*coverprice
        val totalreducedprice=n*reducedPriceforonebook
         totalreducedprice
    }

    def shipping(n:Int):Double={
        var shippingcost:Double=0
        if(n>50)  
        shippingcost = 50*3+(n-50)*0.75 
        else 
        shippingcost=n*3
        
        shippingcost.asInstanceOf[Double]; 
        
        


    }
    def total(n:Int):Double={
        discount(n)+shipping(n)
      

    }

}

object question3{
def main(args:Array[String]):Unit={
println(totaltime())
}

def easypace(x:Int):Int={
val y=8*x// 1km->8min,xkm->x*8min
y

}

def tempopace(x:Int):Int={
val y=7*3//1km->7min,xkm->7*xmin
y
}

def totaltime():Int={
val result=easypace(2)+tempopace(3)+easypace(2)
result
}
}