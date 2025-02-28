import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hesap xyz = new Hesap();
        double[] odemeler = xyz.aylikOdemeGetir();
        xyz.paraYatir(2000);
        System.out.println("------------Hesap------------\n"
                + "Hesap id:" + xyz.GetId() + "\n" +
                "Hesap Bakiyesi:" + xyz.GetBakiye() + "\n" +
                "Aylık Faiz Oranı ve Aylık Ödeme Miktarı:" + Arrays.toString(odemeler) + "\n" +
                "Hesabın oluşturulduğu tarih:" + xyz.GetOlusturulanTarih()+ "\n" );
    }
}


class Hesap {

    private int id = 0, yilSayisi;
    private double bakiye = 0, krediMiktari, yillikFaizOrani = 0;
    private Date olusturulanTarih;

    public Hesap() { //bu fonku kullandım ama tanımlandığı yer hemen aşağıda
        this(2, 2000, 5.6, 20, 20000);
    }

    public Hesap(int id, double bakiye, double yillikFaizOrani, int yilSayisi, double krediMiktari) {
        this.id = id;
        this.bakiye = bakiye;
        this.yillikFaizOrani = yillikFaizOrani;
        this.yilSayisi = yilSayisi;
        this.krediMiktari = krediMiktari;
    }


    //getterlar
    public int GetId() {
        return id;
    }

    public void SetId(int id) { //setter parametre alıyor set edeceği için
        this.id = id;
    }

    public int GetYilSayisi() {
        return yilSayisi;
    }

    public void SetYilSayisi(int yilSayisi) {
        this.yilSayisi = yilSayisi;
    }

    public double GetBakiye() {
        return bakiye;
    }



    //setterlar, void olmalarına dikkat et sadece değer atıyoruz
    public void SetBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double GetYillikFaizOrani() {
        return yillikFaizOrani;
    }

    public void SetYillikFaizOrani(double yillikFaizOrani) {
        this.yillikFaizOrani = yillikFaizOrani;
    }

    public double GetKrediMiktari() {
        return krediMiktari;
    }

    public void SetKrediMiktari(double krediMiktari) {
        this.krediMiktari = krediMiktari;
    }

    public Date GetOlusturulanTarih() {
        return olusturulanTarih;
    }


    //soruda double dizisi döndür ve içine aylikFaizOrani aylikOdemeMiktari koyup diziyi returna ver dedi
    public double[] aylikOdemeGetir() {
        double aylikFaizOrani = yillikFaizOrani / 12;
        double aylikOdemeMiktari = krediMiktari / (yilSayisi * 12);
        double[] dizi = new double[2];
        dizi[0] = aylikFaizOrani;
        dizi[1] = aylikOdemeMiktari;
        return dizi;
    }

    public double paraCek(double miktar) {
        bakiye -= miktar;
        return bakiye;
    }

    public double paraYatir(double miktar) {
        bakiye += miktar;
        return bakiye;
    }

}