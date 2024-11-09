public class ThisKullanimi {

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
