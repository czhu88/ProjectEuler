import org.scalatest.{FreeSpec, Matchers}

class MultiplesOfThreeAndFivesSpec extends FreeSpec with Matchers{
    "Question One - Multiples of 3 and 5" - {
        "Solution one should yield 233168 for 999" in {
            MultiplesOfThreeAndFives.solutionOne(999) shouldBe 233168
        }

        "Solution two should yield 233168 for 999" in {
            MultiplesOfThreeAndFives.solutionTwo(999) shouldBe 233168
        }
    }
}
