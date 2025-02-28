
public class Main {
    public static void main(String[] args) {

        Kategori elk = new Elektronik("Laptop", 35000, 5000);
        Kategori gym = new Giyim("Ceket", 3000, 500);
        Kategori gd = new Gıda("Dondurma", 50, 5);

        System.out.println("Ürün kategorisi: " + elk.getkategori());
        System.out.println("Ürün adı: " + elk.getUrunAdi());
        System.out.println("ürün indirimli fiyatı: " + elk.indirimHesapla());

        System.out.println("Ürün kategorisi: " + gym.getkategori());
        System.out.println("Ürün adı: " + gym.getUrunAdi());
        System.out.println("ürün indirimli fiyatı: " + gym.indirimHesapla());

        System.out.println("Ürün kategorisi: " + gd.getkategori());
        System.out.println("Ürün adı: " + gd.getUrunAdi());
        System.out.println("ürün indirimli fiyatı: " + gd.indirimHesapla());

    }
}

enum UrunKategorisi {
    ELEKTRONİK, //illayapıcıya gerek yok yani parametresiz de olur hatta ayrıca parametresiz constructor yazmaya da gerek yok kendi içinde hallediyo
    GİYİM,
    GIDA;
}

abstract class Kategori {
    private String urunAdi;
    private double fiyat;
    private UrunKategorisi urun_kategorisi;

    Kategori(String urunAdi, double fiyat, UrunKategorisi urun_kategorisi) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.urun_kategorisi = urun_kategorisi;
    }

    /// abstract olmayan 3 metod var bunları tüm subclasslar çağırabilir
    public String getUrunAdi() {
        return urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public UrunKategorisi getkategori() {
        return urun_kategorisi;
    }

    public abstract double indirimHesapla(); ///override zorunlu
}


class Elektronik extends Kategori {
    private double teknoolojiVergisi;

    Elektronik(String urunAdi, double fiyat, double teknoolojiVergisi) {
        super(urunAdi, fiyat, UrunKategorisi.ELEKTRONİK); ///elektronik sınıfındayız superde urunKategorisini elektronik olarak verdik
        this.teknoolojiVergisi = teknoolojiVergisi;
    }

    @Override
    public double indirimHesapla() {
        return getFiyat() - (getFiyat() * 0.10) + teknoolojiVergisi;
    }
}

class Giyim extends Kategori {
    private double sezonIndirimi;

    Giyim(String urunAdi, double fiyat, double sezonIndirimi) {
        super(urunAdi, fiyat, UrunKategorisi.GİYİM);///giyim sınıfındayız superde urunKategorisini giyim olarak verdik
        this.sezonIndirimi = sezonIndirimi;
    }

    @Override
    public double indirimHesapla() {
        return getFiyat() - (getFiyat() * 0.20) - sezonIndirimi;
    }
}


class Gıda extends Kategori {
    private double kdvOrani;

    Gıda(String urunAdi, double fiyat, double kdvOrani) {
        super(urunAdi, fiyat, UrunKategorisi.GIDA);///gıda sınıfındayız superde urunKategorisini gıda olarak verdik
        this.kdvOrani = kdvOrani;
    }

    @Override
    public double indirimHesapla() {
        return getFiyat() - (getFiyat() * 0.05) + (getFiyat() + kdvOrani);
    }
}



















