package firstweek;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ2338 {
    //긴자리 계산
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            System.out.println(a.add(b));
            System.out.println(a.subtract(b));
            System.out.println(a.multiply(b));
        }
    }

