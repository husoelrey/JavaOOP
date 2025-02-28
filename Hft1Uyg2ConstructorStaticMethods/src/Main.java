public class Main {
    public static void main(String[] args) {
        System.out.println("c1 nesnesi olusturulmadan once");
        System.out.println("nesne sayisi:" + Circle.getNesneSayisi());//static FONKA direk class adından erişiyoz çünkü classa özgü fonklar statik
        System.out.println("nesne sayisi:" + Circle.nesneSayisi);//static DEĞİŞKENE direk class adından erişiyoz çünkü classa özgü değişkenler statik
        //nesneye özgü değişkenlere/metodlara(STATIC TANIMLANMAYAN) c1 c2 nesne adlarıyla erişiriz

        Circle c1 = new Circle(); //parametresiz Circle yapıcı metoduyla nesne oluşturduk nesneSayisi++
        System.out.println("c1 nesnesi olusturulduktan sonra nesne sayisi:" + Circle.nesneSayisi);
        System.out.println("c1 nesnesi icin radius:" + c1.radius);
        System.out.println("c1 nesnesi icin alan:" + c1.getArea()); //redius*radius*PI
        System.out.println("----------------------------------");

        Circle c2 = new Circle(3.9); //parametreli Circle yapıcı metoduyla nesne oluşturduk, nesneSayisi++
        System.out.println("c2 nesnesi olusturulduktan sonra nesne sayisi:" + Circle.nesneSayisi);
        System.out.println("c2 nesnesi icin radius:" + c2.radius);
        System.out.println("c2 nesnesi icin alan:" + c2.getArea());

        c1.radius = 5.5;
        //sonradan da değiştirebiliyoz illa prametreli constructora gerek yok yani


    }
}

class Circle {

    public double radius; //radius=yarıçap statik olmayan bir değişkendir. Her Circle nesnesi, kendi radius değerine sahip olur.
    /*Neden Statik Değil: radius, her daire nesnesi için farklı olabileceğinden, statik olarak tanımlanması mantıklı olmaz. Bu sayede Circle sınıfından oluşturulan her nesne,
    kendi radius değerini bağımsız olarak tutabilir*/
    public static int nesneSayisi = 0;
    public static final double pi = 3.14; //final demişiz
    // bi değişkenin veya metodun başına  final dersek bir sabit ifade constant tanımlamş oluyoruz ve hiç değiştirilemiyor

    Circle() {  //constructor
        radius = 2.4;
        nesneSayisi++;
    }

    Circle(double newRadius) { //paramtereli çağıracaksan double tipinde yeni bir yarıçap değeri girmen isteniyor
        radius = newRadius;
        nesneSayisi++;
    }

    public static int getNesneSayisi() {  //statik metod
        return nesneSayisi; //statik metod statik tanımlı değişkenleri kullanır
    }

    public double getArea() {
        return radius * radius * pi;
    }
}