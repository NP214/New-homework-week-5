/*
Write a Java program to print the result of the following operations.
Test Data: a. -5 + 8 * 6
 b. (55+9) % 9
 c. 20 + -3*5 / 8
 d. 5 + 15 / 3 * 2 - 8 % 3
 */


public class Program9 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, i, j, k, l;
        a = -5;
        b = 8;
        c = 6;
        System.out.println(a + b * c);
        d = 55;
        e = 9;
        System.out.println((d + e) % e);
        f = 20;
        g = -3;
        h = 8;
        i=5;
        System.out.println(f+g*i/h);
        j=15;
        k=3;
        l=2;
        System.out.println(i+j/k*l-h%k);
    }
}
