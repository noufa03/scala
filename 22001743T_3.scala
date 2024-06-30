import scala.math.BigDecimal.RoundingMode

object question1 {

     def main(args:Array[String]):Unit={
        var word="reverse"
        print(reverseString(word))

    }
     def reverseString(string:String):String={
        if(string.length==1 || string.length==0){
            string
        }else{
            s"${string.last}${reverseString(string.init)}"
        }
        
    }
   
}

object question2{
    def main(args:Array[String]):Unit={
        var listOfWords=List("onewwwww","twoewwwwwww","thre");
        print(newlist(listOfWords))

    }
    def newlist(l:List[String]):Unit={

            var newlistOfWord=l.filter(_.length > 5)
            print(newlistOfWord)

    }

}
    

object question3{
    def main(args:Array[String]):Unit={
        var num1=17
        var num2=45
        print(average(num1,num2))
    }

    def average(n1:Int,n2:Int):Double={
        var average=(n1+n2)/2.0
        val roundedmean=BigDecimal(average).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
        roundedmean

    }
}

object question4{
    def main(args:Array[String]):Unit={
        var listnum=List(1,2,3,4,5,6,7,8,9)
        sumofeven(listnum)
    }
    def sumofeven(l:List[Int]):Unit={
        var newlist=l.filter(_%2==0)
        var totolsum=newlist.sum
        print(totolsum)
    }
}


