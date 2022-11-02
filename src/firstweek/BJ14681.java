package firstweek;

import java.util.Scanner;

public class BJ14681 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (0 < x && 0 < y) {
            System.out.println("제1사분면");
        } else if (x < 0 && 0 < y) {
            System.out.println("제2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("제3사분면");
        } else if (0 < x && y < 0) {
            System.out.println("제4사분면");
        }

    }
}