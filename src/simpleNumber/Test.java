package simpleNumber;

import java.util.Arrays;

/**
 * Created by Софист on 06.07.2016.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("ЗАПОЛНЕНИЕ МАССИВА ПРОСТЫМИ ЧИСЛАМИ (не имеющее других делителей, кроме единицы и самого себя)");

        OperationNumericalSeries value = new OperationNumericalSeries();
        int cell = value.createAnArray();
        int[] massiv = new int[cell];


        value.operationsWithNumericalSeries(massiv);
        System.out.println("Заполненный массив числами делящимися без остатка на себя и единицу - вывод через Test");
        System.out.println(Arrays.toString(massiv) + " ");

    }
}
