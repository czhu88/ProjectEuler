import org.scalatest.{FreeSpec, Matchers}

class EvenFibonacciNumbersSpec extends FreeSpec with Matchers {
  "Question Two - Even Fibonacci Numbers" - {
    "Solution one should yield 233168 " in {
      EvenFibonacciNumbers.solutionOne shouldBe 4613732
    }
  }
}
