
public class JavaProgrammingBasicSummary {

    public static void main(String[] args) {
        //add(int, int)を呼び出す
        add(45, 13);
        
        //add(double, double)を呼び出す
        double result = add(12.3, 4.8);
        System.out.println("double型の加算：" + result);
    }
    
    //戻り値なし
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("int型の加算：" + result);
    }
    
    //戻り値あり
    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

}
