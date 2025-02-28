
///kendi veritiplerimizi enum ile oluşturabiliyoruz


public class Main {
    public static void main(String[] args) {
      Yemek yy=new Yemek(YemekTuru.PIZZA);
        System.out.println("seçilen yemek: "+YemekTuru.PIZZA);
        System.out.println("ödenmesi gereken hesap ücreti: "+yy.fiyatHesapla());

        Yemek siparis=new Yemek(YemekTuru.SALATA);
        System.out.println("seçilen yemek: "+YemekTuru.SALATA);
        System.out.println("ödenmesi gereken hesap ücreti: "+siparis.fiyatHesapla());

    }
}

enum YemekTuru{
    PIZZA(50), ///yemekturu nun yapıcı metodunu cağırmış oluyor yani pizza(50) diyince yapıcı çağrılıyor ve fiyat 50 oluyor
    BURGER(40),
    SALATA(20),
    MAKARNA(30);

    private final int fiyat;
    YemekTuru(int fiyat) {
        this.fiyat=fiyat;
    }
    public int getFiyat() {
        return fiyat;
    }
}


class Yemek{
    private YemekTuru yemekTuru; ///ENUMUMUZDAN DEĞİŞKEN OLUŞTURDUK
    Yemek(YemekTuru yemekTuru) { ///parametreli constructor
        this.yemekTuru=yemekTuru;
    }
    public int fiyatHesapla(){
        return yemekTuru.getFiyat();
    }
}