// array of objects konusu, yani integer dizisi string dizisi değil de kendi oluşturduğumuz classın dizisini oluşturuyoruz

public class Main {
    public static void main(String[] args) {
// Circle tipinde 10 elemanlı bir dizi oluşturma
        Circle[] circles = new Circle[10];

        // Dizi elemanlarına Circle nesneleri atama
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1); // Her bir nesneye farklı yarıçap atıyoruz
        }

        // Dizideki her bir Circle nesnesinin alanını yazdırma
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Circle " + (i + 1) + " radius: " + circles[i].getRadius() + ", area: " + circles[i].getArea());
        }
    }
}


class Circle {
    private double radius=1;

    public Circle(double new_radius) {
        radius = new_radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double new_radius) {
        radius = (new_radius>=0) ? new_radius : 0; //girilen radius değeri 0dan büyük mü büyükse new_radiusu al değise 0 al
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
}