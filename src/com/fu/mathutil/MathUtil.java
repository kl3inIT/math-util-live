package com.fu.mathutil;

public class MathUtil {

    // n! = 1.2.3.4.5.6...n
    // 0! - 1! = 1, không tính giai thừa cho số âm
    // 20! là vùa khớp kiểu long, kiểu long tối đa là 18 con số 0
    // nếu đưa vào âm hay 21!, throw Exception
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20,");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
