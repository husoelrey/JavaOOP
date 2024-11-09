import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Rectangle rec=new Rectangle(45,35);

        Circle circ=new Circle(4.5,"yeşil",true);

        System.out.println(rec.toString());
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());

        System.out.println(circ.toString());
        System.out.println(circ.getArea());
        System.out.println(circ.getPerimeter());

        System.out.println("geoobj classının çıktıları:");
        GeoObj geo=new GeoObj("mavi",false);
        System.out.println(geo.toString());


    }
}





class GeoObj {

    private String color = "beyaz";
    private boolean filled;
    private Date dateCreated;

    GeoObj() {
        dateCreated = new Date();
    }

    GeoObj(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean value) {
        this.filled = value;
    }

    public Date getDate() {
        return dateCreated;
    }

    public String toString() {
        return dateCreated + "tarihinde oluşturuldu" + "\n"
                + "renk" + color + "\n" + "doluluk durumu" + filled;
    }
}



class Rectangle extends GeoObj{

    private double width, height;

    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    Rectangle(int width,int height,String color, boolean filled){

        //super(color.filled);
        this.width=width;
        this.height=height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(int value){
        this.width=value;
    }
    public double getheight(){
        return height;
    }
    public void setHeight(int value){
        this.height=value;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public String toString(){
        //return super.toString();
        return "rectangle classının toString() metodu çalıştı";
    }

}
//sınavda extends kullan ŞART KALITIM SORUSU GELECEK
class Circle extends GeoObj{

    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

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

        //return super.toString(); ikisi de aynı şey hangisini kullanmak istersen.
        return"Circle classının toString() metodu çalıştı";
    }

}
