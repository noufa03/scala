//question 01
  import scala.io.StdIn
  
  object inventory{
      def main(arg:Array[String]):Unit={
          val list=getProductList()
          println(list.mkString(","))
          printProductList(list)
          println("Total Number of products:"+getTotalProducts(list))
      }
      def getProductList(products:List[String]=List()): List[String]={
         
          var input:String=StdIn.readLine("Enter the products(done if you are finish):\n")
         
              if(input!="done"){
                
                  getProductList(products :+ input)
  
              }
              else{
              products
          }
          }
  
  
  def printProductList(products:List[String]): Unit={
      def func(products:List[String],index:Int):Unit={
          products match{
              case Nil => 
              case head :: tail => println(s"${index+1}.$head")
              func(tail,index +1)
              
          }
          
          
      }
      func(products ,0)
  }
  
  def getTotalProducts(products:List[String]):Int={
      products.length
  }
  
  }
  //question 02
  case class book(title:String,author:String,ISBN:String)
  
  object books{
     
  
   
  
      var lib:Set[book]=Set(
          book("Harry potter","J.K.rolling","0001"),
           book("HI","J.M","0002"),
            book("Bye","K.j","0003"),
  
      )
       def main(args:Array[String]):Unit={
      displayLibrary()
      val newbook=book("dd","ddd","1223")
      addBook(newbook)
      displayLibrary()
      removebook("0001")
      displayLibrary()
      val ebook=existbook("0001")
      if(ebook==true){
          print("exist")
  
      }else{
          print("does not exist")
  
      }
      val findbooktitle="HI"
          findbookbytitle(findbooktitle) match{
              case Some(book) =>println("found the book") 
              case None => println("not found")
  
      }
  
      val findbookauthor="J.k"
      findbookbyauthor(findbookauthor) match{
        case Some(book) =>println("found the book") 
              case None => println("not found")
  
      }
      
  }
      def addBook(b:book):Unit={
          lib +=b
      }
      def removebook(ISBN:String):Unit={
          lib=lib.filterNot(_.ISBN==ISBN)
          
      }
      def existbook(ISBN:String):Boolean={
          lib.exists(_.ISBN == ISBN)
      
  
      }
  
      def displayLibrary():Unit={
       def func(lib:Set[book],index:Int):Unit={
         if(lib.nonEmpty){
          val head=lib.head
          val tail=lib.tail
          println(s"${index+1}.Title:${head.title}, Author:${head.author},ISBN:${head.ISBN}")
          func(tail,index+1)
         }
         
      }
      func(lib,0)
  }
  def findbookbytitle(title:String):Option[book]={
      lib.find(_.title==title)
  }
  def findbookbyauthor(author:String):Option[book]={
      lib.find(_.author==author)
  }
  
  
  
  }
  //question 03
  object fib{
      def main(args:Array[String]):Unit={
          println(fib(5))
  
      }
      def fib(n:Int):List[Int]={
          def fibrec(n:Int,a:Int,b:Int,acc:List[Int]):List[Int]={
              if(n==0){
                  acc
              }else{
                  fibrec(n-1,b,a+b,acc :+a)
              }
          }
          fibrec(n,0,1,List())
      }
  }

