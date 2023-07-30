public class Demo6B {
    public static void main(String[] args) {
        final String COLOR1 = "\033[33m";
        final String COLOR2 = "\033[34;1m";
        final String COLOR3 = "\033[35m";
        final String COLOR4 = "\033[40m";
        final String RESET = "\033[30;0m";
        String str1 = "NAME";
        String str2 = "AGE";
        String str3 = "Alice";
        String str4 = "Bob";
        String str5 = "24";
        String str6 = "30";
        String a = String.format("-".repeat(20));
        String b = String.format("-".repeat(5));

        System.out.printf("%2$s%1$s+%4$s+%5$s+%3$s\n", COLOR1, COLOR4, RESET, a, b);
        //System.out.printf("%2$s%1$s+-------------------------+-----------+%3$s\n", COLOR1, COLOR4, RESET);
        System.out.printf("%6$s%3$s| %4$s%1$-19s%3$s| %4$s%2$-4s%3$s|%5$s\n", str1, str2, COLOR1, COLOR2, RESET, COLOR4);
        //System.out.printf("%2$s%1$s+-------------------------+-----------+%3$s\n", COLOR1, COLOR4, RESET);
        System.out.printf("%2$s%1$s+%4$s+%5$s+%3$s\n", COLOR1, COLOR4, RESET, a, b);
        System.out.printf("%6$s%3$s| %5$s%6$s%1$-19s%3$s|  %4$s%2$-3s%3$s|%5$s\n", str3, str5, COLOR1, COLOR3, RESET, COLOR4);
        System.out.printf("%6$s%3$s| %5$s%6$s%1$-19s%3$s|  %4$s%2$-3s%3$s|%5$s\n", str4, str6, COLOR1, COLOR3, RESET, COLOR4);
        //System.out.printf("%2$s%1$s+-------------------------+-----------+\n", COLOR1, COLOR4, RESET);
        System.out.printf("%2$s%1$s+%4$s+%5$s+%3$s\n", COLOR1, COLOR4, RESET, a, b);
    

    }
    
}
