public class Car {
    
    String color;
    int gear;
    int speed;

    int speedUp() {
        return speed++;
    }

    int speedDown() {
        return speed--;
    }

    void changeGear(int g) {
        gear = g;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
