import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        
        System.out.println("Input : String ");
        Scanner input = new Scanner(System.in);
        while(true) {
            String www = input.nextLine();
            if(www.equals("quit") == true) {
                break;
            }
            if(www.matches("^www\\.(.+)")) {
                System.out.println("www로 시작");
            } else {
                System.out.println("www로 시작하지 않습니다");
            }
        }
       
    }
}
