package simpleNumber;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Софист on 06.07.2016.
 */
public class OperationNumericalSeries {
    Scanner scanner = new Scanner(System.in);

    public int createAnArray() {
        System.out.println("Пользователь,введи значение равное количеству ячеек в одномерном массиве");
        int cell = scanner.nextInt();

        return cell;
    }

    public void operationsWithNumericalSeries(int[] massiv) {
        int n = 1000, amount = 0;
        boolean[] primes = new boolean[n];
        //1
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; i++) {
            //2,3,4
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
                System.out.print(i + " ");
                amount++;
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел: " + amount);

        int j = 0;
        for (int i = 1; (j < massiv.length) && (i < primes.length); i++) {
            if (primes[i])
                massiv[j++] = i;
        }

    /*    for (j = 0; j < massiv.length; j++) {
            System.out.print(massiv[j] + " ");
        }
        System.out.println();
    */
        System.out.println(Arrays.toString(massiv) + " ");
    }
}


