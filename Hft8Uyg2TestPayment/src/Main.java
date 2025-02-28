//override ve casting KONULARI
public class Main {
    public static void main(String[] args) {

// payment dizisi oluşturuluyor ve her ödeme türünden bir nesne ekleniyor
        payment[] xyz = new payment[]{ //değerleri direk atadığımız için dizi boyutu belirtmedik
                //int[] numbers = {10, 20, 30}; // Diziyi başlangıçta değerlerle tanımlıyoruz BU ŞEKİLDE
                new CreditCardPayment(35000, "Akt3rfwor30"),
                new PayPalPayment(200000, "aliveli4950@gmail.com"),
                new cryptoPayment(1000000, "fımcknkfkvdkmr")
        };


        for (payment p : xyz) { //payment veritipindeki p döngü değişkeniyle xyz dizimizde geziyoruz FOREACH DÖNGÜSÜ
            processpaymentMethod(p);//main dşında tanımladık bu metodu
        }
    }//main bitişi


    //burda 2 yeni şey görüyoruz, instanceof ve try catch bloğu
    public static void processpaymentMethod(payment pp) {
        pp.initialize();
        //her ödeme işlemi başlatılır. Bu, initialize() metodunun override edilmesi sayesinde her ödeme türüne göre farklı bir mesaj gösterir.
        /**
         instanceof ve Casting:
         instanceof operatörü ile pp nesnesinin hangi alt sınıfa ait olduğunu kontrol ederiz.
         Eğer pp, cryptoPayment türünde bir nesne ise, cryptoPayment türüne cast edilir ve verifyTransaction() metodu çağrılır.
         PayPalPayment veya CreditCardPayment türündeki nesneler için de benzer işlemler yapılır.
         Bu sayede her ödeme türüne özgü işlemler yapılabilir.
         */
        if (pp instanceof cryptoPayment) { //instanceof cryptopayment dediğimiz şey, pp döngü değişkenimiz cryptopaymentin bir nesnesi mi on kontrol eder
            cryptoPayment crypto = (cryptoPayment) pp;
            crypto.verifyTransaction();//tip dönüşümü yaptık cp nesnesi üzerinden creditcardpayment sınfınfın nesnelerine erişebiliyoz
        } else if (pp instanceof PayPalPayment) {
            PayPalPayment paypal = (PayPalPayment) pp;
            paypal.authenticateUser();//tip dönüşümü yaptık paypal nesnesi üzerinden PayPalPayment sınfınfın nesnelerine erişebiliyoz
        } else if (pp instanceof CreditCardPayment) {
            CreditCardPayment cp = (CreditCardPayment) pp;
            cp.validateCard(); //tip dönüşümü yaptık cp nesnesi üzerinden CreditCardPayment sınfınfın nesnelerine erişebiliyoz

        } else System.out.println("bilinmeyen ödeme türü");
        pp.processPayment();

        try {
            cryptoPayment wrongCast = (cryptoPayment) pp; //wrongcast nesnenin adı
        } catch (ClassCastException e) {
            System.out.println("hatanın nedeni: " + e.getMessage());
        }
    }
}

class payment {
    private double amount;

    public payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void processPayment() {
        System.out.println("ödeme işleniyor" + amount + "TL");
    }

    public void initialize() {
        System.out.println("ödeme işlemi başlatılıyor..");
    }
}

class CreditCardPayment extends payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("kredi kartıyla ödeme yapılıyor" + getAmount() + "TL. kart numarası: " + cardNumber);
    }

    @Override
    public void initialize() {
        System.out.println("kredi karıtla ödeme başlatılıyor");
    }

    public void validateCard() {
        System.out.println("kart nuumarası: " + cardNumber);
    }

}

class PayPalPayment extends payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("PayPal ile ödeme yspılıyor " + getAmount() + "TL  paypsl emaili: " + email);
    }

    @Override
    public void initialize() {
        System.out.println("paypalla ödeme işlemi başlatılıyor");
    }

    public void authenticateUser() {
        System.out.println("kullanıcı paypal ile doğrulanıyor" + email);
    }
}


class cryptoPayment extends payment {
    private String walletAddress;

    public cryptoPayment(double amount, String walletAddress) {
        super(amount);
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("kripto parayla ödeme yapılıyor" + getAmount() + "TL  Cüzdan adresi: " + walletAddress);
    }

    @Override
    public void initialize() {
        System.out.println("kriptoyla ödeme işlemi başlatılıyor");
    }

    public void verifyTransaction() {
        System.out.println("işlem blokzincirde doğrulanıyor " + walletAddress);
    }
}



















