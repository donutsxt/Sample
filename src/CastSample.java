
public class CastSample {

    public static void main(String[] args) {
        // int型変数aとbの宣言及び初期化
        int a = 3;
        int b = 2;

        // int型同士の除算（結果はint型）
        System.out.println(a / b);

        // int型変数aを一時的にdouble型に型変換して除算する（結果は、double型）
        System.out.println((double) a / b);

        // int型同士の除算をした結果（int型）をdouble型に型変換
        System.out.println((double) (a / b));
    }

}
