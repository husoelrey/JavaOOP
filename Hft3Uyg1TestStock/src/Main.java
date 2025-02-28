public class Main {
    public static void main(String[] args) {

        Stock XYZ = new Stock("JAVA", "sun microsystems inc", 4.5, 9.0);
        double degisimYuzdesi = XYZ.getChargePercent();
        System.out.println("% " + degisimYuzdesi);

        //burda değişim yüzdemiz %100 olur çünkü borsa açılışı 4.5 ile başlamış gün sonunda 9.0 olmuş. fark 2 kat


    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChargePercent() {
        double fark = Math.abs(previousClosingPrice - currentPrice); //mutlak değer aldık!! BUNU HESABA KATMASAK HATALI OLUR
        return (100 * fark) / previousClosingPrice; //doğru orantı ile yüzdelik olarak hesapladık burda bişi yok
    }
}

