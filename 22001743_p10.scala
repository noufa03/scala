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

 case class Rational(n:Int,d:Int){
    require(d!=0)
    private val gcdValue=gcd(n.abs,d.abs)
    val numerator:Int=n/gcdValue
    val denominator:Int=d/gcdValue

    def normalize:Rational ={
        if(denominator <0) new Rational(-numerator,-denominator)
        else this
    }
  
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
//question 3 and 4

case class Account(id:Int,balance:Double){
    def deposit(amount:Double):Account={
        if(amount >0){
            this.copy(balance = balance+amount)
        }else{
            this.copy(balance = balance+0)
        }
    }

    def withdraw(amount:Double):Account={
        if(amount >0 && this.balance >= amount){
            this.copy(balance=balance-amount)
        }else{
            this
        }
    }
    def transfer(desaccount:Account,amount:Double):(Account,Account)={
        if(amount >0 && this.balance >= amount){
            val updatedsrcaccount=this.withdraw(amount)
            val updateddesaccount=this.deposit(amount)
            (updatedsrcaccount,updateddesaccount)
        }
        else{
            (this,desaccount)
        }
    }
    def applyInterest():Account={
        if(balance >0){
            this.copy(balance=balance+balance*0.05)
        }
        else{
            this.copy(balance=balance+balance*0.1)
        }
    }
}
object  bank{
    def main(args:Array[String]):Unit={
        val x=new Account(1,120000)
        val y=new Account(2,1212340)
        val z=new Account(3,120000.33)
        val a=new Account(4,1203435.34)
        val b=new Account(5,142220)

        val deposit=x.deposit(20000)
        print("x made this deposit and now the total balance is:\n"+deposit)
        val withdraw=y.withdraw(10000)
        print(" y made a withdrawal and now the balance is\n"+withdraw)
        val transfer=a.transfer(b,10000)
        print(" a transfers to b\n"+transfer)

        val applyInterest=b.applyInterest()
        print(applyInterest)


    }
}
