public class Main {
    public static void main(String[] args) {

        IoTDevice termostat = new AkilliTermostat("11111", "koridor", 18.0, 25.0, "beklemede");
        IoTDevice kamera = new AkilliGuvenlikKamerasi("222222", "oturma odasi");

        termostat.agBaglantisiKur();
        kamera.agBaglantisiKur();

        termostat.fonksiyonCalistir();
        kamera.fonksiyonCalistir();

        System.out.println(termostat.durumGetir());
        System.out.println(kamera.durumGetir());
    }
}

abstract class IoTDevice {
    protected String cihazId;
    protected String konum;

    public IoTDevice(String cihazId, String konum) {
        this.cihazId = cihazId;
        this.konum = konum;
    }

    public void agBaglantisiKur() {      ///abstract class içinde standart metodlar da olabilir
        System.out.println("Bağlantı kurulan cihaz: " + cihazId + "   Cihaz konumu: " + konum);
    }

    public abstract void fonksiyonCalistir();  /// Gövde yok çünkü abstract metod alt sınıfta override edilecek
    public abstract String durumGetir();
}

class AkilliTermostat extends IoTDevice {
    private double mevcutSicaklik;
    private double hedefSicaklik;
    private String durum;

    public AkilliTermostat(String cihazId, String konum, double mevcutSicaklik, double hedefSicaklik, String durum) {
        super(cihazId, konum);
        this.mevcutSicaklik = mevcutSicaklik;
        this.hedefSicaklik = hedefSicaklik;
        this.durum = "Beklemede";
    }

    @Override
    public void fonksiyonCalistir() {
        System.out.println("Sıcaklığı şu hedef sıcaklığa ayarlıyor: " + hedefSicaklik);
        this.mevcutSicaklik = hedefSicaklik;
        this.durum = "Ayarlandı";
        System.out.println("Sıcaklık değeri başarıyla ayarlandı.");
    }

    @Override
    public String durumGetir() {
        return "Şu anki sıcaklık değeri: " + mevcutSicaklik + "   durum biligisi:  " + durum;
    }
}

class AkilliGuvenlikKamerasi extends IoTDevice {
    private boolean isRecording;
    private String durum;

    public AkilliGuvenlikKamerasi(String cihazId, String konum) {
        super(cihazId, konum);
        isRecording = false;
        this.durum = "Beklemede";
    }

    @Override
    public void fonksiyonCalistir() {
        System.out.println("Video kaydı başlatılıyor...");
        isRecording = true;
        durum = "Kayıtta";
        System.out.println("Video kaydı sürüyor...");
    }

    @Override
    public String durumGetir() {
        return "Kayıt ediyor mu? " + (isRecording ? "Aktif" : "Pasif") + "  Durum bilgisi: " + durum;
        //kısa for döngüsü var. true ise aktif false ise pasif yazacak
    }
}
// AkilliBuzdolabi.java
class AkilliBuzdolabi extends IoTDevice {
    private boolean isRunning;
    private String durum;

    public AkilliBuzdolabi(String cihazId, String konum) {
        super(cihazId, konum);
        isRunning = false;
        this.durum = "Beklemede";
    }

    @Override
    public void fonksiyonCalistir() {
        System.out.println("Buzdolabı çalıştırılıyor...");
        isRunning = true;
        durum = "Çalışıyor";
        System.out.println("Buzdolabı başarıyla başlatıldı.");
    }

    @Override
    public String durumGetir() {
        return "Bu buzdolabının aktif mi? " + (isRunning ? "Aktif" : "Pasif") + "  Durum bilgisi: " + durum;
    }
}