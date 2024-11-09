/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testcourse;

/**
 *
 * @author arisoy
 */
public class Course {
    
    private String kursAdi;
    private String []ogrenciler=new String[100];
    private int ogrenciSayisi;
    
    public Course(String kursAdi)
    {
        this.kursAdi=kursAdi;
    }
    
    public void ogrenciEkle(String ogrenci)
    {
        ogrenciler[ogrenciSayisi]=ogrenci;
        ogrenciSayisi++;        
    
    }
    
    public String[] ogrencileriGetir()
    {    
        return ogrenciler;
    }
    
    public int ogrenciSayisiniGetir()
    {
        return ogrenciSayisi;
    }
    
    public String kursAdiGetir()
    {
        
        return kursAdi;
            
    }
    public String[] ogrenciSil(String silinecekOgrenci)//bu sayede listenin başından, ortasından ve sonundan eleman silebiliriz
    {
        String[]temp=new String[ogrenciler.length-1];
        int silinecekOgrenciIndex=0;
        
        for (int i = 0; i < ogrenciler.length; i++) 
        {
            if (ogrenciler[i]==silinecekOgrenci) {
                silinecekOgrenciIndex=i;
                break;
            }
            
        }
        
        for (int i = 0,k=0; i < ogrenciler.length; i++) 
        {
            if (i!=silinecekOgrenciIndex)
            {
                temp[k]=ogrenciler[i];
                k++;
            }
        }
        ogrenciler=new String[temp.length];
        ogrenciler=temp;
       
        return ogrenciler;
    }
            
    
    
}
