public class Course {

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
            if (silinecekOgrenci==ogrenciler[i]){
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
