

public class ArithmeticOperations {

    public static void main(String[] args) {
        // 変数の宣言・初期化
        int num1 = 100;
        int num2 = 3;
        int result;

        // 加算
        result = num1 + num2;
        System.out.println("num1 + num2 = " + result);

        // 減算
        result = num1 - num2;
        System.out.println("num1 - num2 = " + result);

        // 乗算
        result = num1 * num2;
        System.out.println("num1 * num2 = " + result);

        // 除算
        System.out.println("(double)num1 / num2; = " + (double)num1 / num2);

        // 切り捨て除算
        result = num1 / num2;
        System.out.println("num1 /num2 = " + result);

        // 剰余算
        result = num1 % num2;
        System.out.println("num1 % num2 = " + result);

    }

}
