package Experiment1;

import java.util.Scanner;

public class Task2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入本月用电量：");
        double ElectricityUse=sc.nextDouble();
        double Fee;
        if(ElectricityUse<=50){
            Fee=ElectricityUse*0.4;
        }
        else if(ElectricityUse>50&&ElectricityUse<=100){
            Fee=ElectricityUse*0.6;
        }
        else{
            Fee=ElectricityUse*0.8;
        }
        System.out.println("本月应缴纳电费："+Fee+"元");
    }
}
