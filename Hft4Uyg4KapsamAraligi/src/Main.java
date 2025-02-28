

public class Main {
    public static void main(String[] args) {

        //mesela fonk içinde print x ve print y deedin. fonk içinde x i tanımlayalım ama y yi tanımlamayalım
        //bu durumda x i fonk içinde tanımladığımız değer döner. y iin önce fonkta tanımlı mı diye bakar
        //tanımlı değilse classtaki y değişkenini alır(yani önce fonka baktı, eğer yoksa classa baktı)
        Foo foo = new Foo();

    }


}


class Foo {

    private int i;
    private int j = i + 2;
    private int x = 0;
    private int y = 3;

    // Yapıcı metot (Constructor)
    public Foo() {
        int x = 7;  // Yerel x değişkeni
        System.out.println("Foo yapıcı metodun x değeri: " + x);           // 7 yazdırır (yerel değişken)
        System.out.println("Doo yapıcı metodu tarafından çağrılan y değeri: " + y);  // 3 yazdırır (sınıf değişkeni)
        System.out.println("Doo yapıcı metodu tarafından çağrılan x değeri: " + this.x); // 0 yazdırır (sınıf değişkeni)
    }
}