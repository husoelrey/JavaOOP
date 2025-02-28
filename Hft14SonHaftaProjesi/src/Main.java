/// ana clasın yapıcı metoduna gönderin demek super kullanın demektir ve superi ilk satıra yazman gerek hoca superi bu şekilde sorarım dedi
/// superin altındaki satıra da this.degiskenadı=degiskenadi; diyerek devam etcen


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SmartCitySystem smartCity = new SmartCitySystem();

        CitySystem vm = new VehicleManagement("hüso", "oluşturulma tarihi 24 aralık", SystemStatus.MAINTANANCE, 0);
        CitySystem em = new EnergyManagement("ali", "oluşturulma tarihi 24 aralık", SystemStatus.ACTIVE, 1.0);
        CitySystem wm = new WasteManagement("veli", "oluşturulma tarihi 24 aralık", SystemStatus.INACTIVE, 0);

        // Sistemleri SmartCitySystem'e ekle
        smartCity.addSystem(vm);
        smartCity.addSystem(em);
        smartCity.addSystem(wm);

        // Tüm sistemleri görüntüle
        smartCity.displayAllSystems();

        // Simülasyonları çalıştır
        smartCity.runSimulations();


        User admin = new User("Admin123", "ADMIN");
        CitySystem s = smartCity.getSystems().get(0);  ///SMARTCİTY sınfında en sonda arraylist döndüren getSystems metodu yazmıştık, smartCity.getSystems()
        ///diyerek o arraylisti seçmiş olduk ayrıca get(0) diyerek 0. indextekini seçmiş olduk. seçtiğimiz şey de s ye atandı.
        ///s üzerinen o arraylist elemanının(arraylistimiz citysystems türünde veri tutuyor, işte s ile onların metodlarını çağırabiliriz)
        s.interact(admin);


    }
}


interface Manageable {
    void monitor();

    void optimize();
}

interface Interactable {
    void interact(User user);
}

abstract class CitySystem implements Manageable, Interactable {
    protected String name;
    protected SystemStatus status;
    ///enum türünde
    protected String dateCreated;

    public CitySystem(String name, String dateCreated, SystemStatus ss) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.status = ss;
    }

    public SystemStatus getStatus() {
        return status;
    }

    public void SetStatus(SystemStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CitySystem{" + "name=" + name + "," + "status=" + status + "," + "dateCreated=" + dateCreated + '}';
    }

    public abstract void simulate();

}

enum SystemStatus {
    ACTIVE,
    INACTIVE,
    MAINTANANCE;
}

class VehicleManagement extends CitySystem {
    private int vehicleCount;

    public VehicleManagement(String name, String dateCreated, SystemStatus ss, int vehicleCount) {
        super(name, dateCreated, ss);
        this.vehicleCount = vehicleCount;
    }


    void addVehicle() {
        vehicleCount++;
    }

    void removeVehicle() {
        vehicleCount--;
    }

    @Override
    public void simulate() {
        System.out.println("araç sistemlerini simüle eder");
    }

    @Override
    public void monitor() {
        System.out.println("araç durumlarını izler");
    }

    @Override
    public void optimize() {
        System.out.println("araç yönetimini optimize eder");
    }

    @Override
    public void interact(User user) {
        System.out.println("kullanıcıyla etkileşim sağlar");
    }
}


class EnergyManagement extends CitySystem {
    double energyConsumption;

    public EnergyManagement(String name, String dateCreated, SystemStatus ss, double energyConsumption) {
        super(name, dateCreated, ss);
        this.energyConsumption = energyConsumption;
    }

    void reduceEnergyConsumption(double amount) {
        energyConsumption -= amount;
    }

    @Override
    public void simulate() {
        System.out.println("enerji yönetimini simüle eder");
    }

    @Override
    public void monitor() {
        System.out.println("enerji tüketimini izler");
    }

    @Override
    public void optimize() {
        System.out.println("enerji tüketimini optimize eder");
    }

    @Override
    public void interact(User user) {
        System.out.println("kullanıcıyla etkileşim sağlar");
    }

}


class WasteManagement extends CitySystem {
    int wasteLevel; //atık seviyesini tutar

    public WasteManagement(String name, String dateCreated, SystemStatus ss, int wasteLevel) {
        super(name, dateCreated, ss);
        this.wasteLevel = wasteLevel;
    }

    public void collectWaste() {
        System.out.println("atıkları toplar");
    }

    @Override
    public void simulate() {
        System.out.println("atık yönetimini simüle eder");
    }

    @Override
    public void monitor() {
        System.out.println("atık seviyesini izler");
    }

    @Override
    public void optimize() {
        System.out.println("atık yönetimini optimize eder");
    }

    @Override
    public void interact(User user) {
        System.out.println("kullanıcıyla etkileşim sağlar");
    }
}


class User {
    private String name;
    private String userType;

    public User(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getUserType() {
        return userType;
    }
}

class SmartCitySystem {
    private ArrayList<CitySystem> systems = new ArrayList<>();

    ///bu sınıftan nesne oluştuğu an Arrayliist de otomatik oluşacak
    void addSystem(CitySystem system) {
        systems.add(system);
    }

    void displayAllSystems() {
        System.out.println("ALL systems: ");
        for (CitySystem system : systems) {
            System.out.println(system);
        }
    }

    void runSimulations() {
        System.out.println("runing simulations: ");
        for (CitySystem system : systems) {
            system.simulate();
        }
    }

    public ArrayList<CitySystem> getSystems() { ///public int xyz() ile aynı mantık sadece return olarak arraylist vercez
        return systems;
    }

}



