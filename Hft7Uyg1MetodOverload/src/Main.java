public class Main {
    public static void main(String[] args) {
//düzgün çalışıyor

        Sum s=new Sum();
        System.out.println(s.sum(34,45));
        System.out.println(s.Sum(40,70,90));
        System.out.println(s.Sum(56.4,45.2));


    }
}

class Sum{
    public int sum(int x, int y){
        System.out.println("2 parametreli olan sum metodu çalıştı");
        return x+y;

    }

    public int Sum(int x, int y, int z){
        System.out.println("3 parametreli summ metodu çalıştı");
        return x+y+z;
    }


    public double Sum(double x, double y){
        System.out.println("double tipinde parametre alan sum çalıştı");
        return x+y;
    }
}
