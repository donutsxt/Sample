
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // 0,0で除算
        double b = 10.0 / 0.0;
        // この下の出力はInfinity！
        System.out.println(b);
        
        // int型10をint型0で除算
        int a = 10 / 0; // ここで、例外が発生！
        // この下の出力は実行されない！！
        System.out.println(a);
    }

}
