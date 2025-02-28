///ABSTRACT KONUSU İÇİN KODLAR
/// tamamdıııııır


import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

   Fruit mango=new Mango(Color.orange,true); ///new fruit desek hata alırdık ABSTRACT sııftan nesne oluşturulmaz ama bu şekilde olur
   Fruit banana=new Banana(Color.yellow,true);


   mango.prepare();
   banana.prepare();

        ArrayList<Fruit>fruits=new ArrayList<Fruit>();
        fruits.add(mango);
        fruits.add(banana);

        servisEt(fruits); //bu metodu hemen aşağıda tanımladık. metodu tabiki main metodunun dışına yazıyoz ona dikkat
    }
    public static void servisEt(ArrayList<Fruit> ff) {
        ///ff; içinde Fruit nesneleri tutan arraylistimizin adı. bunu mainde içine herhangi bir Fruit tutan arraylisti vercez
        for(Fruit f:ff){
            System.out.println(f.getColor());
            System.out.println(f.getSeason());
            f.prepare();
        }
    }
}


abstract class Fruit{
    private Color color;
    private boolean season;

    public Fruit(Color color, boolean season) {
        this.season = season;
        this.color = color;
    }
    public abstract void prepare();

    //getterlar
    public Color getColor() {
        return this.color;
    }
    public boolean getSeason() {
        return this.season;
    }
}

class Mango extends Fruit{
    public Mango(Color color, boolean season) { //Color veritipinde color, boolean veritipinde season
        super(color, season); //bunu demek zorunlu
    }
    @Override
    public void prepare() {
        System.out.println("Mangoyu dilimle");
    }
}

class Banana extends Fruit{
    public Banana(Color color, boolean season) {
        super(color, season);
    }
    @Override
    public void prepare() {
        System.out.println("Muzu dilimle");
    }
}
























