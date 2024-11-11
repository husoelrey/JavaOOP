//amele gibi dizi yazdığımız normal diziye eleman ekleyip çıkarmak için algo yazdığımız kod

public class Main {
    public static void main(String[] args) {
//öne course sınıfına git

        Course c1 = new Course("Nesneye Dayalı Programlama");
        Course c2 = new Course("Bilişim Sistemlerinin Analizi ver Tasarımı");

        c1.ogrenciEkle("Ali Al");
        c1.ogrenciEkle("Veli Gel");
        c1.ogrenciEkle("Ayşe Solmaz");

        c2.ogrenciEkle("Aylin Getir");
        c2.ogrenciEkle("Pınar Taşır");
        c2.ogrenciEkle("Gökhan Okur");


        System.out.println("c1 nesnesi öğrenci sayısı: " + c1.ogrenciSayisiniGetir());

        String[] tumOgrenciler = c1.ogrenciGetir();

        for (int i = 0; i < tumOgrenciler.length; i++) {
            System.out.print(tumOgrenciler[i] + ", ");
        }

        System.out.println();

        System.out.println("c2 nesnesi öğrenci sayısı: " + c2.ogrenciSayisiniGetir());

        String[] yeniOgrenciler = c2.ogrenciSil("Gökhan Okur");

        for (int i = 0; i < yeniOgrenciler.length; i++) {
            System.out.println("c2 nesnesi " + yeniOgrenciler[i]);
        }
    }
    }


class Course {

    /*
    BU İŞİ ARRAYLİSTLERDEKİ REMOVE METODUYLA YAPABİLİYORUZ
    AMA BİZ ARRAY GÖRDÜK HAFTAYA ARRAYLİST GÖRCEZ
    MANIĞINI ANLAYALIM DİYE GÖRDÜK BUNLARI

    dizilerde boyut sabittir başta kaç belirlediysen odur. o yüzden 2 dizi oluşturduk birindeen
    elemanı sildik. silinmiş halini yeni diziye atayan algoritmayı yazdık
    en sonda return ogrenciler diyince de o yeni öğrenci silinmiş diziyi döner
     */
    private String kursAdi;
    private String[] ogrenciler=new String[10];
    private int ogrenciSayisi;

    //constructor
    public Course(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public void ogrenciEkle(String ogr) {

        ogrenciler[ogrenciSayisi]=ogr;
        ogrenciSayisi++;
    }
    public String[] ogrenciGetir() {
        return ogrenciler;

    }
    public int ogrenciSayisiniGetir() {
        return ogrenciSayisi;
    }
    public String kursAdiGetir() {
        return kursAdi;

    }
    public String[] ogrenciSil(String silinecekOgrenci){
        String[]temp=new String[ogrenciler.length-1];
        int silinecekOgrenciIndex=0;


        for(int i=0;i<ogrenciler.length;i++){
            if (ogrenciler[i]==silinecekOgrenci){
                silinecekOgrenciIndex=i;
                break;//öğrenciyi bulduysak devam etmeye gerek yok. önemli olan hangi indexte old. bulmak
            }
        }


        for (int i=0,k=0; i< ogrenciler.length; i++){

            if(i!=silinecekOgrenciIndex){
                temp[k]=ogrenciler[i]; //öğrencilerin 2.indexini tempin 0.indexine atıyor
                k++;
            }
        }

        ogrenciler=new String[temp.length];
        ogrenciler=temp;
        return ogrenciler;
        //şimdi maine gell
    }


}



