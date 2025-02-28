//inheritance

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Rectangle rec=new Rectangle(45,35, "mavi",true);

        Circle circ=new Circle(4.5,"yeşil",true);

        System.out.println("------------------------------------A-------------");
        System.out.println("rec objesinin çıktıları");
        System.out.println(rec.toString());
        System.out.println("alan:"+rec.getArea());
        System.out.println("çevre:"+rec.getPerimeter());

        System.out.println("-------------------------------------------------");
        System.out.println("circ objesinin çıktıları");
        System.out.println(circ.toString());
        System.out.println("alan:"+circ.getArea());
        System.out.println("çevre:"+circ.getPerimeter());

        System.out.println("-------------------------------------------------");
        System.out.println("GeoObj classının çıktılarına geçelim");
        GeoObj geo=new GeoObj("mavi",false);
        System.out.println(geo.toString());


    }
}





class GeoObj {

    private String color = "beyaz";
    private boolean filled; //dolu mu boş mu true false
    private Date dateCreated; //oluşturulduğu tarih

    GeoObj() {
        dateCreated = new Date(); //oluşturulduğu tarihi alıp dataCreated değişkenine verir
    }

    GeoObj(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }


    //sırayla getter setterları yazalım
    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean value) { //filled boolean old iççin true yada false parametre alsın istiyoruz
        this.filled = value;
    }

    public Date getDate() {
        return dateCreated;
    } //setDate koymuyoz onu yapamıyoz


    //nesnenin özelliklerini metin olarak veren metod
    public String toString() {
        return dateCreated + "      :TARİHİNDE oluşturuldu" + "\n"
                + "renk:   " + color + "\n" + "doluluk:   " + filled;
    }

}



class Rectangle extends GeoObj{

    private double width, height;
    //parametresizde width'i width'e ve height'i height'e atayalım. tarih kodunu eklemeye gerek yok super(); ile çağırdık onu
    Rectangle(int width, int height){
        super();
        this.width=width;
        this.height=height;
    }

    Rectangle(int width,int height,String color, boolean filled){
/**color ve filled üst classın constructorunda var zaten. o yüzden kod tekrarından kaçınalım ve super(color,filled);
kullanalım. Ha yine constructorumuza width ve height ekleyecez burda. Ama en azından color ve filledin eklenmesiyle uğraşmayak bidaha**/
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    /**GET'ler SET'ler(sadece subclassın set/getlerini yap yeter zaten diğer tüm PUBLIC metodlar miras alındı
    Ana classta public tanımladın dimi? sınavda da public tanımla skerm**/
    public double getWidth(){
        return width;
    }

    public void setWidth(int x){
        this.width=x;
    }

    public double getheight(){
        return height;
    }

    public void setHeight(int y){
        this.height=y;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }

    /**
    HADİ ŞU toString() metodunda override anlatalım(overload yapamayız çünkü parametresi yok)
    ----------------------------------------------------------------------------
    @Override
    public String toString(){
         return "rectangle classının toString() metodu çalıştı";
    }
    -----------------------------------------------------------------------------
    override ederiz bu şekilde. ama dikkat ettiysen ana classtayken fonksiyonumuz GeoObj bilgilerini
    gösteriyodu o bilgileri görcek şekilde override da edebiliriz!!
    --------------------------------------------------------------------------------------
     **/
    @Override
    public String toString(){ //string bişi dönmek gerek
/**  eğer sadece------>return super.toString() dersek
        Rectangle sınıfının toString metodu, GeoObj sınıfının toString metodunu çalıştırarak GeoObj'nin
        sahip olduğu bilgileri gösterecektir. AMAA biz rectangeleımızın da özelliklerini göstermek istiyorsakkkk
**/
         return super.toString() + "\n" +
         "Genişlik: " + width + "\n" +
         "Yükseklik: " + height;
    }
}

/**
 CIRCLE DA DA AYNILARINI YAPIYOZ SEN DİREK MAİNE GEL
 */




class Circle extends GeoObj{

    private double radius;

    //parametresize radius atamasını ekleyelim. tarih kodunu eklemeye gerek yok super(); ile çağırdık onu
    Circle(double radius){
        super();
        this.radius=radius;
    }

    //parametrelide üstclassın color ve filled'ını alalım burda yeni olarak radius katıldı.
    //radiusu radiusa atayalım aynı parametresizdeki gibi
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(int value){
        this.radius=value;

    }

    public double getArea(){
        return Math.PI*radius*radius;

    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public String toString(){
        return"Circle classının toString() metodu çalıştı";
    }

}
