import java.util.ArrayList;
public class ArraylistDemo {

    public static void main(String[] args) {
        ArrayList<String>citylist=new ArrayList<String>();
        citylist.add("Ankara");
        citylist.add("Bursa");
        citylist.add("Konya");
        citylist.add("Van");
        citylist.add("Ankara");

        System.out.println(
        "arraylist ilk hali:"+citylist+
        "arraylist boyutu:"+citylist.size()+
        "arraylist balıkesir ilini içeriyor mu?-->"+citylist.contains("Balıkesir")+
        " Arraylistte Ankaranın bulunduğu İLK index no:"+citylist.indexOf("Ankara")+
        "Arraylistte Ankaranın bulunduğu SON index no:"+citylist.lastIndexOf("Ankara")+
        "citylist arraylisti boş mu?->"+citylist.isEmpty());

        citylist.add(2,"Elazığ");//2.indexe elazığ
        citylist.remove("Van");//nesneye göre eleman sildik
        citylist.remove(1);//indexe göre eleman sildik
        System.out.println("citylist güncel hali:"+citylist);

        System.out.println("citylist içeriği toString() ile de gösterilebilir"+citylist.toString());

        for (int i=citylist.size()-1;i>0;i--){
            System.out.println(citylist.get(i)+"-");
        }

        System.out.println("-----------------------------------");

        ArrayList<Circle> daireler=new ArrayList<Circle>();  //Arraylistimiz Integer, String tipinde olabileceği gibi Circle tipinde nesne de alabilir
        daireler.add(new Circle(5.0,"yeşil")); //daireler.add dediğimizde Circle tipinde nesne istiyor onu hemen new Circle deyip oluşturduk
        daireler.add(new Circle(3.5,"mor"));

        System.out.println("daireler arraylistinin ilk indexindeki nesne için alan:"+daireler.get(0).getArea());
        //circledaki getArea metodlarını falan da kullanabiliyoz indexi seçtikten sonra
        System.out.println("daireler arraylistinin ikinci indexindeki nesne için alan:"+daireler.get(1).getArea());


    }
}
