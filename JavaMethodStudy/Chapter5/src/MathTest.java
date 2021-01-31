public class MathTest {
    
    public static void main(String[] args) {
        Math mt = new Math();
        int x = mt.sum(5,3);
        System.out.println("Answer : 5 + 3 = " + x);

        int y = mt.square(7);
        System.out.println(y);

        double z = mt.square(7.5);
        System.out.println(z);
    }
}
