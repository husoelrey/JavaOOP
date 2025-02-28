public class Main {
    public static void main(String[] args) {
//bu örnek hem overload hem ovirrideı aynanda kullandığımız bir uygulama

//personel classı tipinde dizi oluşturuyoruz, veritipi personel yani
        Personel []per=new Personel[2];

        Ogretmen ogretmen=new Ogretmen("Ali Yaalçın",42,"matematik");
        idariPersonel idari=new idariPersonel("Yaemin yavuz",45,"muhasebe");



        per[0]=ogretmen;
        per[1]=idari;


        //foreach var, p döngü değişkeniyle per icinde dolaşacağız. ilk dönüşte öğretmen classına göre dönecek öğretmen classındaki metodları çağıracak
        //2.dönüşteyse idaripersonel classında o metodları bulacak. bulamazsa da ana classtan çağıracak o metodları
        for(Personel p:per){
            p.bilgiGoster();
            p.dersVer();
            p.dersVer("fen");

            System.out.println("************");

        }



    }
}

class Personel{
    String isim;
    int yas;

    public Personel(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;

    }

    public void bilgiGoster(){
        System.out.println("personel bilgisi isim"+isim+"-yaş:"+yas);

    }


    public void dersVer(){

    }
    public void dersVer(String ders){

    }

}

class Ogretmen extends Personel{
    String brans;
    public Ogretmen(String isim, int yas,String brans){
        super(isim,yas);
        this.brans = brans;

    }
    @Override
    public void bilgiGoster(){
        System.out.println("öğretmene ait bilgi: isim:"+isim+"-yaş:"+yas+"-BRANŞ:"+brans);
    }


    public void dersVer(){
        System.out.println(isim+"  ders veriyor (parametresiz dersver metodu)  ");
    }

    public void dersVer(String ders){
        System.out.println(isim+"  "+ders+"  dersini veriyor");
    }
}





class idariPersonel extends Personel{
    String departman;
    public idariPersonel(String isim, int yas,String departman){
        super(isim,yas);
        this.departman = departman;

    }

    @Override
    public void bilgiGoster(){
        System.out.println( "idari personel bilgisi:  isim:"+isim+"-yaş:"+yas+"  departman:"+departman);

    }


    //dersVer metodunu burada koymadık. eğer dersVer metodunu idariPersonel için kullanırsak burda bulamayacağı için ana classtan bulacak
    //ana classta da dersVer metodunun içi boş zaten boş olarak geçecek. ana sınıfta içi boş bile olsa tanımlamamızın sebebi buydu
}





