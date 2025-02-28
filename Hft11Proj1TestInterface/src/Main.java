///interface mantığını anlamak için basit bir örnek

public class Main {
    public static void main(String[] args) {
        Dev3 d3=new Dev3();
        d3.deposit();
        d3.withdraw();
        d3.account();
        d3.loan();
    }
}

interface Bank{
    void deposit(); ///bunlar doğal olarak abstract kabuledilcek derleyici tarafından, belirtmeye gerekbile yok
    void withdraw();
    void loan();
    void account();
}
///LEVEL1
abstract class Dev1 implements Bank{
    ///4 metodun 4ünü değil de 2 sini 3ünü uygulayacaksak abstract yazyoz başına ama 4ünü de kullancaksan abstract demeye gerek yok

    public void deposit(){
        System.out.println("depozito miktarı"+500+" tl");
    }
}

///LEVEL2
abstract class Dev2 extends Dev1{
    public void withdraw(){
        System.out.println("çekilen tutar: "+50000+" tl");
    }
}

///LEVEL3
class Dev3 extends Dev2{
    public void loan(){
        System.out.println("çekilen kredi:"+100000+" tl");
    }
    public void account(){
        System.out.println("bakiyeniz:"+20000+" tl");
    }
}