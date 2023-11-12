
public class NotArithmeticExceptionSample {

    public static void main(String[] args) {
        // double型10.0をdouble型0.0で除算
        double a = 10.0 / 0.0; //例外エラーが発生せず

        // 結果
        System.out.print(a); //Infinityが表示される

    }

}
