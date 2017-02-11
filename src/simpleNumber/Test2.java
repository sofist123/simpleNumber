package simpleNumber;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Софист on 10.07.2016.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь,введи значение равное количеству желаемых простых чисел ");
        int count = scanner.nextInt();
        int[] massiv = new int[count];

        int n = 0, i = 2;
        while (n < count) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag)
                massiv[n++] = i;
            i++;
        }
        System.out.println();
        System.out.println(Arrays.toString(massiv) + " ");
    }
}
