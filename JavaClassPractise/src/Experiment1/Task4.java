package Experiment1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        double use;
        System.out.println("请输入本月用电量：");
        Scanner sc=new Scanner(System.in);
        use=sc.nextDouble();
        Task4Calculate temp=new Task4Calculate();
        System.out.println("本月电费为："+temp.calculate(use));
    }
}
