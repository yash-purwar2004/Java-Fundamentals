package OOPS;


public class test {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Blue";
        car.speed = 40;
        car.brand = "Tata";
    

        car.accelerate(1);
        System.out.println(car.speed);
    }
}
