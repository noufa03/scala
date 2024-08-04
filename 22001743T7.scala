object questions{
    def main(args:Array[String]):Unit={
        val list=List(1,2,3,4,5,6,7,8,9,10)
       
        println( "Even Number list:"+filterEvenNumbers(list))
        println("Square list"+calculateSquare(list))
        println("prime list"+filterPrime(list))

    }
    def filterEvenNumbers(numbers:List[Int]):List[Int]={
        numbers.filter( n=> n%2 == 0)
    }

    def calculateSquare(numbers:List[Int]):List[Int]={
        numbers.map(n=> n*n)
    }

    def isprime(n:Int):Boolean={
        if(n <=1) false
        else if(n==2) true
        else !(2 until n).exists(i=> n% i == 0)
        
    }

    def filterPrime(numbers:List[Int]):List[Int]={
        numbers.filter(isprime)
    }
}
