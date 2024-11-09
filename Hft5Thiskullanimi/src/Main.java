public class Main {
    public static void main(String[] args) {

        ThisKullanimi t1 = new ThisKullanimi();
        ThisKullanimi t2 = new ThisKullanimi();
//classtan 2 nesne oluşturduk şimdi değerlerini atayalım
        t1.setIvalue(7);
        t2.setIvalue(6);

        t1.SetKvalue(34);
        t2.SetKvalue(12);
        System.out.println( "t1 nesnesi için I değeri:"+t1.i);
        System.out.println( "t1 nesnesi için K değeri:"+ThisKullanimi.k);
        // k static değişken old için yine class adıyla eriştik

        System.out.println( "t2 nesnesi için I değeri:"+t2.i);
        System.out.println( "t2 nesnesi için K değeri:"+ThisKullanimi.k);
    }
}

