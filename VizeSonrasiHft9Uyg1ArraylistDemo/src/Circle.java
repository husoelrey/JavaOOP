import java.time.LocalDate;
public class Circle {
    private double radius;
    private String color;
    private LocalDate date;


    Circle(){
        date = LocalDate.now();
    }
Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
}

public String getColor() {
        return this.color;
}
    public double getArea() {
        return Math.PI * radius * radius;
    }

}

