
public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(); //parametresizde 3.2 çağrılcak
        System.out.println(c1.getArea());

        Circle c2=new Circle(5.6); //parametrelide ne istersek
        System.out.println(c2.getArea());
    }
}




class Circle{

    //classs ile aaynı adda metoda constructor yapıcı metod diyoruz.
    public double radius;
    Circle(){
        radius = 3.2;
    } //bak bu constructor başında public yok ama olabillir sorun değil
    Circle(double new_radius){
        radius=new_radius;
    }  //buda parametre alan construcotr
    public double getArea(){
        return Math.PI * radius * radius; //Math.PI equals pi number. Burda pirekare yaptık

    }
}