import java.util.Date;
import java.util.Random;



/**
 * 1. Colorable isminde bir interface oluşturunuz
 * 2. Bu interface'in içinde howToColor() isminde void abstract metot yer alsın
 * 3. GeometricObject isminde abstract class tasarlayın ve bu class Colorable interface'ini implement etsin
 * 4. GeometricObject class'ında color, filled ve dateCreated adlı 3 değişken olsun
 * 5. GeometricObject class'ının parametre almayan yapıcı metodunda, new java.util.Date() kullanarak dateCreated değişkenine ilk değer ataması yapınız
 * 6. GeometricObject class'ının ikinci yapıcı metodunda parametre olarak color ve filled parametreleri yer alsın
 * 7. Color ve filled değişkenlerinin get ve set metotlarını tanımlayınız
 * 8. Ve dateCreated değişkeni için getDateCreated() metodu tanımlayınız
 * 9. GeometricObject class'ı içinde getArea ve getPerimeter adlı 2 abstract metot tanımlayınız
 * 10. Ayrıca GeometricObject class'ında her bir nesnenin hangi tarihte oluşturulduğunu, rengini ve dolu olup olmadığını ekrana yazdıran toString metodu oluşturunuz
 * 11. GeometricObject class'ından Square isimli bir subclass tanımlayınız
 * 12. Square içinde getArea, getPerimeter, howToColor metotları ile, Square'in double height tipinde parametre alan yapıcı metodunu da uygulayın
 * 13. Test class'ının main metodu içerisinde Random sınıfını kullanarak rnd isimli bir nesne oluşturunuz
 * 14. GeometricObject class'ı türünde içerisinde elemanlar barındıran 5 elemanlı bir dizi tanımlayınız
 * 15. Daha sonra rnd nesnesi ile 0-9 arasında double tipinde random sayılar ürettirerek bu sayıların 9 katını dizinin her bir indeksine atayınız
 * 16. Ardından, GeometricObject class'ı türünde içerisinde elemanlar barındıran dizide alan her bir indekste yer alan nesneler için o nesnenin alanını, howToColor() metodunu kullanarak nasıl boyandığı gibi bilgileri ekrana yazdırınız
 */


public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        /// Normal bir dizi şuu şekilde--->int [] dizim= new int[2];
        GeometricObject[] dizim = new GeometricObject[5];
        for (int i = 0; i < 5; i++) {
            dizim[i] = new Square(rnd.nextDouble() * 9, "blue", false);
            ///square nesnelerinii oluşturduk
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(dizim[i].getArea());
            dizim[i].howToColor(); ///burda da square'in metodlarını çağırdık dizide dönüp
        }
    }
}


interface Colorable {
    void howToColor();
}

abstract class GeometricObject implements Colorable {
    private String color;
    private boolean filled;
    private Date dateCreated;


    GeometricObject() {
        dateCreated = new Date();
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /// getter setterlar
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "created at: " + dateCreated.toString() + " color: " + color + " filled: " + filled;
    }
}

class Square extends GeometricObject {
    private double side;

    Square(double side, String color, boolean filled) {
        super(color, filled); // GeometricObject'in yapıcısını çağır
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /// overrideları yapalım
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("tüm kenarları boyayın");
    }
}