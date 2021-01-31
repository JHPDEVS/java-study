public class CarTest {
    
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "red";
        c1.gear = 3;
        c1.speed = 50;
        System.out.println(c1);
        c1.changeGear(5);
        c1.speedDown();
        System.out.println(c1);
    }


}
