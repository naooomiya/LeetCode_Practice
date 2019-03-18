/*
  29. Divide Two Integers

  Description:
  Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

  Return the quotient after dividing dividend by divisor.

  The integer division should truncate toward zero.

  Example 1:
  Input: dividend = 10, divisor = 3
  Output: 3

  Example 2:
  Input: dividend = 7, divisor = -3
  Output: -2

  Note:
  Both dividend and divisor will be 32-bit signed integers.
  The divisor will never be 0.
  Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
  For the purpose of this problem, assume that your function returns 231 − 1 when the division result overflows.

*/
public class divide {
    public int Divide(int dividend, int divisor) {
        if (dividend == int.MinValue && divisor == -1) return int.MaxValue;
        Boolean flag = divisor>= 0 && dividend >= 0 || divisor <= 0 && dividend <= 0;

        long a = Math.Abs((long)dividend);
        long b = Math.Abs((long)divisor);

        int result = 0;
        while (a >= b) {
            a -= b;
            result++;
        }
        return flag? result : -result;
    }
}
