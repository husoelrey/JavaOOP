
package com.mycompany.deneme_testoverload;


class Sum
{
    public int sum(int x, int y)
    {
        System.out.println("2 paremetreli olan sum metodu çalıştı");
        return x+y;
    }

    public int sum(int a, int b, int c)
    {
        System.out.println("3 parametreli olan sum metodu çalıştı");
        return a+b+c;
    }

    public double sum(double x, double y)
    {
        System.out.println("double tipinde parametre alan sum çalıştı");
        return x+y;
    }
}



public class Deneme_TestOverload {

    public static void main(String[] args) {

        Sum s=new Sum();
        System.out.println(s.sum(34, 45));
        System.out.println(s.sum(40, 70, 90));
        System.out.println(s.sum(56.4, 45.2));

    }
}