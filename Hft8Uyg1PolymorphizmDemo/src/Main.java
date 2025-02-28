//CASTINGLER

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(2, "kırmızı");
        rectangle r1 = new rectangle(34.5, 56.7, "yeşil");

        geometricObject g1 = new Circle();
        // rectangle c2=g1; //böyle dersek çalışmaz explicit casting yapacaksan başına subclass yazmamız gerek new SUBCLASS dememiz gerek
        rectangle c2 = (rectangle) g1;

        /* hatalı kod örneği, böyle yazma
        GeometricObject g1= new GeometricObject();       //new rectangle() yada new Circle() dememiz gerekir
        rectangle c2=(rectangle)g1;
         */

        geometricObject g2 = new Circle(5, "mor");
        geometricObject g3 = new rectangle(4, 7, "turuncu");

        Circle gg = (Circle) g2;

        displayObject(g2);
        displayObject(g3);
        displayObject(gg);


    }

    //mainin dışına displayobject tanımlayalım
    public static void displayObject(geometricObject geo) {
        System.out.println("oluşturulduğu tarih:" + geo.getDate() + "rengi:" + geo.getColor());
    }
}

class geometricObject {
    private String color;
    private LocalDate createdDate;


    public geometricObject() {
        createdDate = LocalDate.now();
    }

    public geometricObject(String color) {
        this.color = color;

    }

    public String getColor() {
        return this.color;
    }

    public LocalDate getDate() {
        return this.createdDate;
    }

}


class Circle extends geometricObject {
    private double radius;
    private String color;
    private LocalDate createdDate;

    public Circle() {
        createdDate = LocalDate.now();
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }


}

class rectangle extends geometricObject {
    private double width, height;
    private String color;
    private LocalDate createdDate;

    public rectangle() {
        createdDate = LocalDate.now();
    }

    public rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;

    }

    public String getColor() {
        return this.color;
    }
}


















