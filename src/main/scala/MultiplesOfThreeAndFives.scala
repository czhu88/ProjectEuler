object MultiplesOfThreeAndFives {
  def solutionOne(maxNum: Int): Int = (3 to maxNum).fold(0)((total, num) => if (num % 3 == 0 || num % 5 == 0) total + num else total)

  def solutionTwo(maxNum: Int): Int = calculateMultipleSum(maxNum, 3) + calculateMultipleSum(maxNum, 5) - calculateMultipleSum(maxNum, 15)

  private def calculateMultipleSum(maxNum: Int, multiple: Int): Int = multiple * sumOfSequence(maxNum / multiple)

  private def sumOfSequence(sequenceEndNumber: Int): Int = (sequenceEndNumber * (sequenceEndNumber + 1)) / 2
}
