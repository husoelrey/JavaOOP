import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ///maine gelmeden önce diğer sınıfın koduna bak

        MyStackArraylist my=new MyStackArraylist();
        /**

         MyStackArraylist sınıfından bir nesne oluşturmuş oluyorsunuz. Bu, doğrudan bir ArrayList oluşturmak değildir, ancak MyStackArraylist
         sınıfınızın içinde bir ArrayList bulunduğundan, bu nesne aynı zamanda bir ArrayList'i kapsar ve onun üzerinde işlem yapar.

         Neden Direkt ArrayList Kullanmadık?

         Eğer sadece bir ArrayList oluşturmak isteseydik, şu şekilde yapabilirdik:

         ArrayList<Integer> listem = new ArrayList<>();

         Ancak burada bir stack (yığın) veri yapısını simüle etmek istiyoruz. Bunun için:

         Bir sınıf tanımlandı (MyStackArraylist).
         Bu sınıf, stack işlemlerini (push, pop, peek, vb.) bir arayüzle sunuyor.
         ArrayList, bu işlemleri gerçekleştirmek için bir araç olarak kullanılıyor.
         Bu şekilde, sadece bir liste değil, bir veri yapısı (stack) oluşturmuş olduk.


         */


        System.out.println("liste boşmu?:"+my.isEmpty());  //true dönecek çünkü liste şuan boş

        for(int i=0;i<20;i++){
            my.push(i);
        }
        System.out.println("arraylist yeni boyutu:"+my.getSize());
        System.out.println("arraylist peek sonucu(arrayliste son ekleneni return edecek):"+my.peek());

        while(my.getSize()!=0){ //false olmadığı sürece yani arraylist içi dolu olduğu sürece pop yapcaz(yığının en üstündeki elemanı çıkarcaz)
                                // boş bir araylistte pop yapazsın.
            System.out.println("arraylist pop sonucu(pop yığının en üstteki elemanı çıkarır ve çıkardığı o elemanı return eder:"+my.pop());
        }

        System.out.println("arraylist pop sonrası yeni size değeri: "+my.getSize());  //hepsini çıkardık az önce şuan bu 0 dönmeli:)

        ///Hadi arraylisti yine doldurak birkaç şey daha gösterelim
        my.push(5);
        my.push(7);
        my.push(5);
        my.push(5);

        int[]gelenindeks=new int[2]; ///tamaam 2 elemanlı standart dizi oluşturduk
        gelenindeks= my.searchfirstlast(5); ///oluşturduğumuz diziye de bu metodu çağırıp onu atadık.(searchfirstlast metodu 2 elemanlı dizi dönüyo!!)

/**
        TAMAM DİZİ OLUŞTU AMA diziyi döndürmek istiyoruz yani elemanlarına erişmek istiyoruz. bunu yapmanın 2 yolu var 1.si for döngüsüyle dizide dönüp yazdırmak
        2.yol ise tek tek elle yazdırmak                */
        ///1.YOL
        for (int i = 0; i < gelenindeks.length; i++) {
            System.out.println("gelen index değeri:" + gelenindeks[i]);
        }
        ///2.YOL
        System.out.println("İlk indeks: " + gelenindeks[0]);
        System.out.println("Son indeks: " + gelenindeks[1]);



        ArrayList<Integer>tumIndeksler=new ArrayList<Integer>();
        tumIndeksler=my.search(5); ///my.search arraylist tipinde değer döndürdüğü için yeni arraylist oluşturduk
        ///search metodu->Verilen değerin (5) tüm indekslerini bulur ve bir ArrayList olarak döner.
        System.out.println("5in bulunduğu tüm indexler"+tumIndeksler.toString());
        ///hee ARRAYLİST DÖNDÜRÜRKEN toString diyerek tüm elemanları görebiliyoz. yani dizideki gibi zahmetli değil
    }
}


class MyStackArraylist{

        ArrayList<Integer> listem;
        public MyStackArraylist() {
            listem = new ArrayList<Integer>();

        }
        public boolean isEmpty() { ///boşmu kontrol eder
            return listem.isEmpty();
        }
        public int getSize() {  ///eleman sayısını döner
            return listem.size();
        }

        public int peek(){ /// stack yığındaki en üstteki arkadaşı return ediyor. yani son ekleneni(son eklenen yığında en üsttekidir)
            return listem.get(listem.size()-1);
        }
        public void push(int a){
            listem.add(a); ///push(5) dediğinde listem.add(5) demiş oluyorsun
        }



        ///pop işleminin amacı bir stack (yığın) yapısında en üstteki elemanı çıkarmak ve o elemanı geri döndürmektir.
        /// Yani, hem elemanı silmek hem de silinen elemanın ne olduğunu bilmek istiyoruz. Bu işlem, stack yapısının temel bir özelliğidir.
        public int pop(){
            int deger=listem.get(listem.size()-1); ///sizeın bir eksiğindeki indexte son eleman vardır indexler 0dan başladığı için. Yani
            ///listede 6 eleman varsa 5.indeksi yani son elemanı seçip deger adında bir değişene atadık.
            ///o değişkeni listeden sildik ve return ile sildiğimiz değişkeni döndürdük
            listem.remove(deger);
            return deger;
        }



        ///search metodu->Verilen değerin (a) tüm indekslerini bulur ve bir ArrayList olarak döner.
        /// Örneğin, bir değerin birden fazla kez geçtiği durumlarda kullanışlıdır.
        public ArrayList<Integer> search(int a){    ///return olarak arraylist dönecek he dikkat et
            ArrayList<Integer>indeksler=new ArrayList<Integer>();

            for (int i = 0; i < listem.size(); i++) {
                if(listem.get(i)==a){
                    indeksler.add(i);
                }
            }
            return indeksler;
        }


        ///bu metod ise->
        ///Verilen değerin (a) ilk ve son geçtiği indeksleri döner.
        ///Sonuçları bir diziye atar ve döndürür.
        public int[] searchfirstlast(int a){ //dizi tipinde değer döndürüyoz burası önemli dedi yine
            int [] dizim=new int[2];
            dizim[0]=listem.indexOf(a); //.indexOf(4) dersen 4 ün ilk geçtiği indexi döner sana
            dizim[1]=listem.lastIndexOf(a);//lastIndexOf(4) dersen de 4ün son geçtiği indexi döner
            ///bu ilk ve son indexi alıp standart bir diziye eleman olarak bu indexleri verdik
            return dizim; ///veee dizi olarak döndük!! bu metod çağrılırken içine bir integer alacak ve dizi dönecek
        }

        public String toString(){
            return listem.toString();  ///ArrayList'in içeriğini bir String olarak döner.
        }
    }

