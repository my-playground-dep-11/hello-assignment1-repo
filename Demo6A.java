public class Demo6A {
    public static void main(String[] args) {
        final String COLOR1 = "\033[41m";
        final String COLOR2 = "\033[42m";
    
        String num1 = "5";
        String num2 = "0";
        String str = "%";

        System.out.printf("%1$s[%3$5s%2$s%4$s%5$-5s]\n", COLOR1, COLOR2, num1, num2, str);
        
    }
    
}
