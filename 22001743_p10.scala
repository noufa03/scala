// question 5
object occurance{
    def main(args:Array[String]):Unit={
        val words=List("apple", "banana", "cherry", "date")
        println(countLetterOccurrences(words))
    }
    def countLetterOccurrences(words:List[String]):Int={
        val lengths=words.map(words=>words.length)
        val totalcount=lengths.reduce((a,b)=>a+b)
        totalcount
    }

}

//question 1

class Rational(n:Int,d:Int){
    require(d!=0)
    private val gcdValue=gcd(n.abs,d.abs)
    val numerator:Int=n/gcdValue
    val denominator:Int=d/gcdValue

    def this(n:Int)=this(n,1)

    if(denominator <0){
        new Rational(-numerator,-denominator)
    }

    def neg:Rational=new Rational(-numerator,denominator)
    //2 question
     def -(that: Rational): Rational = {
    new Rational(
      this.numerator * that.denominator - this.denominator * that.numerator,
      this.denominator * that.denominator
    )
  }
    override def toString(): String =
    if(denominator==1) numerator.toString
    else s"$numerator/$denominator"

    private def gcd(a:Int,b:Int):Int =if (b==0) a else gcd(b,a%b)
}



object RationalApp{
    def main(args:Array[String]):Unit={
        val x=new Rational(5,8)
        val y=new Rational(2,7)

        println(s"x:$x")
        val negX=x.neg
        println(s"Negated x:$negX")
        println(sub(x,y))
    }

    def sub(x:Rational,y:Rational):Rational={
        x-y
    }
}
