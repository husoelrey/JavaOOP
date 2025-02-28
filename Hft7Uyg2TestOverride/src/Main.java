import com.sun.source.tree.EnhancedForLoopTree;

public class Main {
    public static void main(String[] args) {

        EmployeManager manager = new EmployeManager();
        manager.addEmployee("yusuf", "yalçın", "müdür", 50000);

        EngineerManager eng = new EngineerManager();
        eng.addEmployee("hakan", "yolaç", "sistem mühensdisi", 49000);
        System.out.println(eng.getEmployeeInfo());

        eng.makeRaise(5600);
        EngineerManager.deneme();
        EmployeManager.deneme();

    }
}


    class EmployeManager {


        String employeeName, employeeSurname, employeeJob;
        double employeeMoney;

        public void addEmployee(String employeeName, String employeeSurname, String employeeJob, double employeeMoney) {
            this.employeeName = employeeName;
            this.employeeSurname = employeeSurname;
            this.employeeJob = employeeJob;
            this.employeeMoney = employeeMoney;
        }

        public String getEmployeeInfo() {
            if (employeeName != null && employeeSurname != null && employeeJob != null) {
                if (employeeMoney <= 0)
                    employeeMoney = 0;//money 0dan küçük değilse ztn buraya hiç girmicek
                return "çalışanın ismi" + employeeName + "\n" + "çalışanın soyismi" + employeeSurname + "\n" + "çalışanın işi" + employeeJob + "\n" + "çalışanın maaşı" + employeeMoney;

            }
            return "çalışan mevcut değil";
        }

        public void makeRaise(double artis) {
            this.employeeMoney += artis;
            System.out.println("ANA CLASSTAKİ çalışanın zamlı maaşı: " + this.employeeMoney);
        }

        public static void deneme() {
            System.out.println("ana classın statik metodu çalıştı");
        }

    }

    class EngineerManager extends EmployeManager {

        @Override //parentclasstaki aynı metod subclasstada varsa bu şekilde ovirride etmek gerekiyor çünkü burda aynı metodu düzenliyoruz (mühendislere göre)
        //polimorfizimin dinamik yani runtime ayağındaki özelliği oluyor

        //metodumuz statik olduğunda ovirride etmiyoruz slaytta da var. nedeni statik metodlar kalıtım yoluyla direk subclasslarda kullanılabilir
        //fakat anaclasstaki statik metod altclassta tekrar tanımlanırsa yani ovirride edilirse altclasstan o ovirride edilen çağrrılır

        public void makeRaise(double artis) {
            super.employeeMoney += artis;
            super.employeeMoney += 1000;
            System.out.println(this.employeeName + " " + this.employeeSurname + "çalışanına" + artis + "kadar zam yapıldı ayrıca mühendis old içiin " + 1000 + "TL daha artış sağlandı");
        }

        public static void deneme() {
            System.out.println("subclassın yani alt classın statik metodu çalıştı");
        }
    }




















