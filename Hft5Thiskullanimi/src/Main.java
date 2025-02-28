public class Main {
    public static void main(String[] args) {

        ThisKullanimi t1 = new ThisKullanimi();
        ThisKullanimi t2 = new ThisKullanimi();
//classtan 2 nesne oluşturduk şimdi değerlerini atayalım
        t1.setIvalue(7);
        t2.setIvalue(6);

        t1.SetKvalue(34);
        t2.SetKvalue(12);
        System.out.println( "t1 nesnesi için I değeri:"+t1.i);
        System.out.println( "t1 nesnesi için K değeri:"+ThisKullanimi.k);
        // k static değişken old için yine class adıyla eriştik

        System.out.println( "t2 nesnesi için I değeri:"+t2.i);
        System.out.println( "t2 nesnesi için K değeri:"+ThisKullanimi.k);
    }
}
class ThisKullanimi {
    int i=5;
    static double k=0;

    ThisKullanimi(int i){
        this.i=i; //bunu zaten biliyon bu kullanımı
    }
    ThisKullanimi(){
        this(3); //bu yeni bir this kullanımı.
        //bu classın yapıcı metodunu çağrımış oluyoruz
        //öbür yapıcı metoddan başka yapıcıyı çağırmak için kullandık yani
        //parametre vermeyip this(); diye de çağırırdık bu sefer parametre almayan yapıcıyı çağırır
    }

    void setIvalue(int i){
        this.i=i;
    }

    void SetKvalue(double k){
        ThisKullanimi.k=k; //k static tanımlandığı için classadı üzerinden erişiyoz
    }
//şimid maine geeel
}

