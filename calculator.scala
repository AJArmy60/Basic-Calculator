//Aidan Armellino
import scala.io.StdIn._
import scala.math._
//Define Functions
def add(a: Int, b: Int): Int = a + b
def sub(a: Int, b: Int): Int = a - b
def multi(a: Int, b: Int): Int = a * b
def div(a: Double, b: Double): Double = a / b
def modu(a: Int, b: Int): Int = a % b
def inc(a: Int): Int = a + 1
def abs(a: Int): Int =
  {
  if (a < 0)
  {
    a * -1
  } else
  { a }
}
def exponent(a: Int, b: Int): Double = math.pow(a, b)
//User Chooses Operation
println("Choose from the following list of operations:")
println("1. Add")
println("2. Subtract")
println("3. Multiply")
println("4. Divide")
println("5. Modulus")
println("6. Increment")
println("7. Absolute value")
println("8. Exponent")
val oper = readInt()
//User enters numbers and calculations
if (oper == 1){
  println("Enter the first number.")
  val a = readInt()
  println("Enter the second number.")
  val b = readInt()
  println("The result is:")
  println(add(a: Int, b: Int))
}

if (oper == 2){
  println("Enter the first number.")
  val a = readInt()
  println("Enter the second number.")
  val b = readInt()
  println("The result is:")
  println(sub(a: Int, b: Int))
}

if (oper == 3){
  println("Enter the first number.")
  val a = readInt()
  println("Enter the second number.")
  val b = readInt()
  println("The result is:")
  println(multi(a: Int, b: Int))
}

if (oper == 4){
  println("Enter the first number.")
  val a = readInt()
  println("Enter the second number.")
  val b = readInt()
  println("The result is:")
  println(div(a: Double, b: Double))
}

if (oper == 5){
  println("Enter the first number.")
  val a = readInt()
  println("Enter the second number.")
  val b = readInt()
  println("The result is:")
  println(modu(a: Int, b: Int))
}

if (oper == 6){
  println("Enter the number.")
  val a = readInt()
  println("The result is:")
  println(inc(a: Int))
}

if (oper == 7){
  println("Enter the number.")
  val a = readInt()
  println("The result is:")
  println(abs(a: Int))
}

if (oper == 8){
  println("Enter the first number.")
  val a = readInt()
  println("Enter the second number.")
  val b = readInt()
  println("The result is:")
  println(exponent(a: Int, b: Int))
}
