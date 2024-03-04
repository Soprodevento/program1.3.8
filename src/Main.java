//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println(isPowerOfTwo(-16 ));
    }
    public static boolean isPowerOfTwo(int value){
        return value > 0 && (value & (value - 1)) == 0;
    }
}