package Experiment1;

import java.util.Arrays;

public class Task3 {
    public static void main(String []args) {
        double[] number = new double[100];
        for (int i = 0; i < 100; i++) {
            number[i] = (Math.random() * 900) + 100;
        }
        SortNumber(number);
    }
    static void SortNumber(double []arr)
    {
        Arrays.sort(arr);
        for(int i=99;i>=90;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
