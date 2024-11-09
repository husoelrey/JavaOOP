public class Main {
    public static void main(String[] args) {
//öne course sınıfına git

        Course c1 = new Course("nesneye dayalı programlama");
        Course c2 = new Course("algoritma ve programlama");

        c1.ogrenciEkle("ali");
        c1.ogrenciEkle("zeynep");
        c1.ogrenciEkle("ayşe");

        c2.ogrenciEkle("hasan");
        c2.ogrenciEkle("sümeyra");
        c2.ogrenciEkle("davut");

        System.out.println("c1 nesnesi için öğrensi sayısını getir:" + c1.ogrenciSayisiniGetir());
        System.out.println("c2 nesnesi için öğrensi sayısını getir:" + c2.ogrenciSayisiniGetir());

        String[] getirilenOgrenciler = c1.ogrenciGetir();

        for (int i = 0; i < getirilenOgrenciler.length; i++) {
            System.out.println(getirilenOgrenciler[i]);
        }

        String[] yeniOgrenciler = c2.ogrenciSil("sümeyra");
        for (int i = 0; i < yeniOgrenciler.length; i++) {
            System.out.println(yeniOgrenciler[i]);

        }

    }
}
