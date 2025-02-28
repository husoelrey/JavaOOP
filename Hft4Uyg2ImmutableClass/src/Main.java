
import java.util.Date;
//set metdu olmaması gerek ve set metodu da yok. YANNİİİ İMMUTABLE CLASS DEMEKTİR
public class Main {
    public static void main(String[] args) {


        Student s1=new Student(12345,"Ayşe yılmaz");
        Date gelentarih=s1.getDate();
        //s1.getDate diyerek o nesneyi gelentarih e attık.
        gelentarih.setTime(4000);
        // burda immutableelığı bozduk çünkü ikisi de aynı adresi işaret ediyordu referans tipli gibi. bunu set dediğimiz içiçn
        //sanki diğeri de set olmuş gibi oldu immutable da set olmazdı haniii

    }
}

class Student{
    private int id;
    private String name;
    private Date tarih;


    //constructor
    Student(){

    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
        tarih = new Date(); //date classı Math classı gibi hazır bir classtır. bu kodu yazarak tarihe ilk değerini vermiş olduk

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Date getDate() {
        return tarih;
    }
    //student classı bu kadar hepsinin sadece getlerini yazdık
}


