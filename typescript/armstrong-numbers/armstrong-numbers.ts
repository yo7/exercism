export default class ArmstrongNumbers {
  static isArmstrongNumber(input: number) {
    const digits = input.toString().split('')
    const sum = digits.reduce((acc, i) => {
      return acc += Math.pow(parseInt(i, 10), digits.length)
    }, 0)
    return sum === input
  }
}