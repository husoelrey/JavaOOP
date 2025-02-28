
public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV(15,25,true);

        System.out.println("tv1 nesnesi için: kanal  " + tv1.kanal + "ses: " + tv1.sesSeviyesi);

        tv1.KanalAyarla(5);
        tv1.birKanalAsagi();
        tv1.sesAyarla(32);
        tv1.ses_arttir();
        System.out.println("tv1 nesnesi için: kanal  " + tv1.kanal + "ses: " + tv1.sesSeviyesi);
    }
}

class TV {
    public int kanal = 1;
    public int sesSeviyesi = 1;
    public boolean acikMi = false;

    TV(int kanal, int sesSeviyesi, boolean acikMi) {
        this.kanal = kanal;
        this.sesSeviyesi = sesSeviyesi;
        this.acikMi = acikMi;
    }
    public void TV_ac() {
        acikMi = true;
    }
    public void TV_kapat() {
        acikMi = false;
    }
    public void KanalAyarla(int yeni_kanal) {
        if (acikMi == true && yeni_kanal != kanal && yeni_kanal <= 20) {

            kanal = yeni_kanal;
        }
    }
    public void sesAyarla(int yeni_ses) {
        if (acikMi && yeni_ses != sesSeviyesi && sesSeviyesi <= 50) {
            sesSeviyesi = yeni_ses;

        }
    }
    public void birKanalYukari() {
        if (acikMi && kanal < 120) {
            kanal++;

        }
    }
    public void birKanalAsagi() {
        if (acikMi && kanal > 1) {
            kanal--;

        }
    }
    public void ses_arttir() {
        if (acikMi) {
            sesSeviyesi++;
        }
    }
    public void ses_azalt() {
        if (acikMi) {
            sesSeviyesi--;
        }
    }
}
