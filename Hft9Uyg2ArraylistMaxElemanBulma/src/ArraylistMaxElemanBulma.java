import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistMaxElemanBulma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sıfırdan farklı bir sayı girin, sayı girmeyi bitirmek için 0 a basabilirsin");

        ArrayList<Integer>list=new ArrayList<Integer>();
        Integer integer;

        while((integer=sc.nextInt())!=0){ //0 olmadığı sürece whilea gir ve listeye eleman ekle. yani kullanıcı sürekli int eleman gircek 0 girince bitircek eleman almayı
            list.add(integer);
        }
        System.out.println("girilen sayılar içinde en büyügü bul:"+EnBuyukBul(list));//enbuyukbul metodu aşağıda tanımlı, EnbuyukBul dediğimiz metod içine arraylist alıyor ona göre tanımladık dikkat et
    }


    public static Integer EnBuyukBul(ArrayList<Integer> listem){
        if(listem.isEmpty()==true || listem==null){
            return null;
        }
        Integer enbuyuksayi=listem.get(0);  //varsaılan olarak en büyük sayıyı buna atadık listenin diğer elemanlarıyla
        //  karşılaştırcaz eğer daha büyük sayı varsa o sayıya enbüyük değerini atıcaz falan
        for(Integer ii:listem){ //arraylistimiz Integer tipinde ozaman ii döngü değişkenimiz de Integer tipinde olmalı
            enbuyuksayi=Math.max(enbuyuksayi,ii); //math.max iki sayıdan en büyüğünü alır ONU DA enbuyuksayi değişkenine atadık
        }
        return enbuyuksayi;
    }

}


