/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testhesap;
import com.mycompany.testhesap.Hesap;
/**
 *
 * @author arisoy
 */
public class TestHesap {

    public static void main(String[] args) {
        
        Hesap h1=new Hesap(2311,20000,4.5,4,500000);
        
        h1.paraCek(2500);
        h1.paraYatir(3000);
        
        double []arr=h1.aylikOdemeGetir();
        double aylikFaizOrani=arr[0];        
        double aylikOdeme=arr[1];
        
        
        System.out.println("bakiye: "+h1.getBakiye()+"-aylık faiz oranı: "+aylikFaizOrani+ "-aylik ödeme miktarı: "+aylikOdeme+"-hesap tarihi: "+h1.getolusturulanTarih());
        
    }
}
