public class Main {
    public static void main(String[] args) {

        /**
         GPTYE YAPTIR AMK ZORDU BU ÖRNEKKKK


         galeride 2 tane foto var ordaki kodları geçir buraya.
         c1.contains(new Circle2D(4,5,10.5))); gibi kullanım var sınavda buna benzer bir kullanım sorarım dedi

         */

        // İlk olarak c1 nesnesini tanımlıyoruz
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // c1 nesnesinin alan ve çevresini yazdırıyoruz
        System.out.println("C1'in Alanı: " + c1.getArea());
        System.out.println("C1'in Çevresi: " + c1.getPerimeter());

        // (3,3) noktasının c1 nesnesinin içinde olup olmadığını kontrol ediyoruz
        System.out.println("(3,3) noktası C1'in içinde mi? " + c1.contains(3, 3));

        // c2 nesnesini tanımlıyoruz (x=4, y=5, radius=10.5)
        Circle2D c2 = new Circle2D(4, 5, 10.5);
        // c2 nesnesinin c1'in içinde olup olmadığını kontrol ediyoruz
        System.out.println("C2 nesnesi C1'in içinde mi? " + c1.contains(c2));

        // c3 nesnesini tanımlıyoruz (x=3, y=5, radius=2.3)
        Circle2D c3 = new Circle2D(3, 5, 2.3);
        // c3 nesnesinin c1 ile örtüşüp örtüşmediğini kontrol ediyoruz
        System.out.println("C3 nesnesi C1 ile örtüşüyor mu? " + c1.overlaps(c3));
    }
}


class Circle2D {

    // 1. Adım: x ve y koordinatlarını private ve double olarak tanımla
    private double x;
    private double y;
    private double radius;

    // 2. Adım: Parametresiz yapıcı, x ve y için 0, radius için 1 olarak ayarla
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // 3. Adım: Parametreli yapıcı, x, y ve radius değerlerini atama
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter metodları
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // 4. Adım: Dairenin alanını döndüren metot
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // 5. Adım: Dairenin çevresini döndüren metot
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // 6. Adım: Belirli bir noktanın bu dairenin içinde olup olmadığını kontrol eden metot
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance <= radius;
    }

    // 7. Adım: Başka bir dairenin (Circle2D nesnesi) bu dairenin içinde olup olmadığını kontrol eden metot
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
        return distance + circle.getRadius() <= this.radius;
    }

    // 8. Adım: Başka bir dairenin (Circle2D nesnesi) bu daire ile örtüşüp örtüşmediğini kontrol eden metot
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
        return distance <= (this.radius + circle.getRadius()) && distance >= Math.abs(this.radius - circle.getRadius());
    }
}
