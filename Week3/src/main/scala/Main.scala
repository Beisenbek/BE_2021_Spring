import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map


object Main extends App{

 class Person(var firstName: String, var lastName: String = "R"){
   override def toString: String = {
     firstName + " " + lastName
   }
 }

 def f1(): Unit ={
   val x = new Person("A","B")
   val y = new Person(
     firstName = "RR",
     lastName =  "TT"
   )

   println(x)
   println(y)
 }

  def f2(): Unit ={
    trait Drawable{
      val t = 12
      def draw(): Unit ={
        println("drawing")
        println(t)
      }
    }

    class Rectangle(x:Int) extends Drawable{
      def doIt() {
        println(x)
      }
    }

    class Circle(x:Int) extends Drawable{
      def doIt() {
        println(x)
      }
    }

    val y = new Rectangle(12)
    y.doIt()
    y.draw()

    def Generate(x:Drawable){

    }
  }

  def f3(): Unit ={
    case class Student(name: String, year: Int)
    val s = Student("A", 2021)
    println(s)
  }

  def f4(): Unit ={

    class PersonX(var name: String, var relation:String)
    case class Person(name: String, relation: String)

    val christina1 = Person("Christina", "niece")
    val christina2 = Person("Christina", "niece")


    val xchristina1 = new PersonX("Christina", "niece")
    val xchristina2 = new PersonX("Christina", "niece")


    println(christina1 == christina2)
    println(xchristina1 == xchristina2)
  }

  def f5(): Unit ={
    object PizzaUtils {
      def doIt(): Unit ={
        println("did it!")
      }
    }
  }

  def f6()={
    val ints = ArrayBuffer[Int]()
    ints += 1
    ints += 2

    println(ints)
    println(ints(0))

    var ints2 =  List(7, 8, 9)
    println(ints2)
    println(ints2(0))

    val ints3 = Vector(1,2,3)
    println(ints3)
    println(ints3(0))
  }

  def f7()={
    def rec(list:List[Int]): Unit ={
      list match {
        case Nil => {
          println("end!")
        }
        case head :: tail => {
          println(head)
          rec(tail)
        }
        case _=>{
          println("error!")
        }
      }
    }
    var list =  List(-7, 8, 9)
    rec(list)
  }

  def f8()={
    val states = Map("AK" -> "Alaska")
    val s = Set(1, 2, 3, 4, 5)
    println(states)
    println(s)
  }

  def f9()= {

    def f(x:Int):Int= {
      x * 3
    }


  val ints = List(1,2,3)
    val doubledInts = ints.map(_ * 2)
    val tripleInts = ints.map(f)

    println(doubledInts)
    println(tripleInts)

  }

  f9()
}