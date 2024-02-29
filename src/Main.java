//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println(isPowerOfTwo(-16));
    }
    public static boolean isPowerOfTwo(int value){
        value = Math.abs(value);
        int result = Integer.bitCount(value);
        return result == 1;
    }
}