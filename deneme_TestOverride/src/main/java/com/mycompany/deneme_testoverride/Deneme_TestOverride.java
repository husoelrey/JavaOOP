package com.mycompany.deneme_testoverride;


public class Deneme_TestOverride {

    public static void main(String[] args) {
        
        EmployeManager manager=new EmployeManager();
        manager.addEmployee("Yusuf", "Yalçın", "Müdür", 50000);
        
        System.out.println(manager.getEmployeeInfo());
        
        EngineerManager eng=new EngineerManager();
        eng.addEmployee("Hakan", "Yolaç", "Sistem Mühendisi", 49000);
        System.out.println(eng.getEmployeeInfo());
        
        eng.makeRaise(5600);
        EngineerManager.deneme();
        
        EmployeManager.deneme();
        
        
        
    }
}

class EmployeManager{

    String employeeName,employeeSurName,employeeJob;
    double employeeMoney;
    
    public void addEmployee(String employeeName,String employeeSurName, String employeeJob, double employeeMoney)
    {
        this.employeeName=employeeName;
        this.employeeSurName=employeeSurName;
        this.employeeJob=employeeJob;
        this.employeeMoney=employeeMoney;
                
    }
    
    public String getEmployeeInfo()
    {
        if (employeeName!=null && employeeSurName!=null && employeeJob!=null) {
            if (employeeMoney<=0)
                employeeMoney=0;
                
            return "Çalışanın ismi:"+employeeName+"\n"+
                        " soyismi:"+employeeSurName+"\n"
                        +"mesleği:"+employeeJob+"\n"+
                        "maaşı:"+employeeMoney;
                
            
            
        }
        return "Çalışan mevcut değildir!"; 
    
    }
    
    public void makeRaise(double artis) //zam yap fonksiyonu
    {
        this.employeeMoney+=artis;
        System.out.println("ana classtaki çalışanın zamlı maaşı:"+this.employeeMoney);        
    
    }
    
    public static void deneme()
    {
        System.out.println("ana classın statik metodu çalıştı");
    }

  }

class EngineerManager extends EmployeManager
{
    
    @Override
    public void makeRaise(double artis)
    {
        super.employeeMoney+=artis;
        super.employeeMoney+=1000;
        System.out.println(this.employeeName+" "+this.employeeSurName+
                " çalışanına "+ artis+ " kadar zam yapıldı ayrıca mühendis olduğu için "
                +1000+ " TL daha artış sağlandı");    
    
    }
    
    
    public static void deneme()
    {
        System.out.println("sub classın static metodu çalıştı");
    }
            



}



