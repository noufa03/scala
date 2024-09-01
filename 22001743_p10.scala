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
