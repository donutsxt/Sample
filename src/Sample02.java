
public class Sample02 {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 10;
        int result;
        result = sumMethod2(num1, num2);
        System.out.println(result + " method2");
    }

    public static int sumMethod2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}