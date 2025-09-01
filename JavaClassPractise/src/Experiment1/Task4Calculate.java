package Experiment1;

public class Task4Calculate
{
    double calculate(double num)
    {
        if(num<=50)
        {
            return 0.4*num;
        }
        else if(num>50&&num<=100)
        {
            return num*0.6;
        }
        else
        {
             return num*0.8;
        }
    }
}
