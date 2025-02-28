

public class Main {
    public static void main(String[] args) {

    }
}


class Rectangle{

    public double width=1;
    public double height=1;

    Rectangle(){
        this.width=1;
        this.height=1;
    }
    Rectangle(double new_width, double new_height){
        this.width=new_width ;
        this.height=new_height ;
    }
    public double getArea(){
        double alan=width*height;
        return alan;
    }
    public double getPerimeter(){
        double cevre=2*(height+width);
        return cevre;
    }
}



class TestrRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("r1 ve r2 yapıcı metodlardan ilk değerleri atanarak oluşturuldu");

        System.out.println("1.nesne with: "+r1.width+
                "1.nesne height: "+r1.height+"1.nesne alan: "+r1.getArea()+"1.nesne çevre: "+r1.getPerimeter());

        System.out.println("2.nesne with: "+r2.width+
                "2.nesne height: "+r2.height+"2.nesne alan: "+r2.getArea()+"2.nesne çevre: "+r2.getPerimeter());


    }
}