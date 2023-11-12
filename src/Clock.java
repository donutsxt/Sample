import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("時 > ");
        int my_h = scanner.nextInt();
        System.out.print("分 > ");
        int my_m = (int)scanner.nextInt();
        System.out.print("秒 > ");
        int my_s = (int)scanner.nextInt();
        
        scanner.close();
        
        int seconds = getSeconds(my_h, my_m, my_s);
        System.out.println(seconds);
    }

    public static int getSeconds(int my_h, int my_m, int my_s) {
        int result = my_h * 3600 + my_m * 60 + my_s;
        return result;
    }
}
