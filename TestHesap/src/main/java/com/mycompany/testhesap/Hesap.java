/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testhesap;
import java.util.Date;
/**
 *
 * @author arisoy
 */
public class Hesap {
    
    private int id;    
    private int bakiye;
    private int yilSayisi;
    private double yillikFaizOrani;
    private double krediMiktari;
    private Date olusturulanTarih;
    
    Hesap()
    {
        this(1,1000,2.5,2,3000);
    }
    
    Hesap(int id, int bakiye,double yillikFaizOrani,int yilSayisi,double krediMiktari)
    {
        this.id=id;
        this.bakiye=bakiye;
        this.yilSayisi=yilSayisi;
        this.krediMiktari=krediMiktari;
        this.yillikFaizOrani=yillikFaizOrani;
        
        olusturulanTarih=new Date();
    
    }
    
    public int getID()
    {
        return id;
    }
    
    public void setID(int id)
    {
        this.id= id;
    }
    
    
       public int getBakiye()
    {
        return bakiye;
    }
    
    public void setBakiye(int bakiye)
    {
        this.bakiye= bakiye;
    }
    
    
       public double getyillikFaizOrani()
    {
        return yillikFaizOrani;
    }
    
    public void setyillikFaizOrani(double yillikFaizOrani)
    {
        this.yillikFaizOrani= yillikFaizOrani;
    }
    
       public double getkrediMiktari()
    {
        return krediMiktari;
    }
    
    public void setkrediMiktari(double krediMiktari)
    {
        this.krediMiktari= krediMiktari;
    }
    
    
    
    public Date getolusturulanTarih()
    {
        return olusturulanTarih;
    }
    
    public double[]  aylikOdemeGetir()            
    {
        double aylikFaizOrani=yillikFaizOrani/1200;
        
        double aylikOdeme=krediMiktari * aylikFaizOrani /(1-Math.pow(1/(1+aylikFaizOrani),yilSayisi * 12)); //math.pow üs alır
        
        double []arr=new double[2];
        arr[0]=aylikFaizOrani;
        arr[1]=aylikOdeme;
    
        return arr;
    }
    
    
    public void paraCek(int miktar)
    {
        if (miktar<bakiye) {
            bakiye=bakiye-miktar;
        }
        else 
            System.out.println("hesabınızdakinden daha fazla para çekemezsiniz");
        
    }
    
    public void paraYatir(int miktar)
    {
        bakiye+=miktar;
    }
}
