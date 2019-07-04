import org.scalatest.{FreeSpec, Matchers}

class EvenFibonacciNumbersSpec extends FreeSpec with Matchers {
  "Question Two - Even Fibonacci Numbers" - {
    "Solution one should yield 4613732 " in {
      EvenFibonacciNumbers.solutionOne shouldBe 4613732
    }

    "Solution two should yield 4613732 " in {
      EvenFibonacciNumbers.solutionTwo shouldBe 4613732
    }
  }
}
