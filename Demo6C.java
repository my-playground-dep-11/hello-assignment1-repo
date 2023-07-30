public class Demo6C {
    public static void main(String[] args) {
        final String COLOR1 = "\033[30;1m";
        final String YELLOW_COLOR = "\033[33m";
        final String GREEN_COLOR = "\033[32m";
        final String PINK_COLOR = "\033[35m";
        final String BACK_GROUND_COLOR = "\033[40m";
        final String RESET = "\033[30;0m";

        String str1 = "CITY";
        String str2 = "STATE";
        String str3 = "POPULATION";
        String str4 = "Los Angeles";
        String str5 = "California";
        String str6 = "New";
        String str7 = "York";
        int int1 = 3966936;
        int int2 = 8336817;

        String a = String.format("-".repeat(15));
        String b = String.format("-".repeat(12));
        
        
        System.out.printf("%1$s%2$s+%4$s+%5$s+%5$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, a, b);
        System.out.printf("%1$s%2$s| %3$s%5$-14s%2$s| %3$s%6$-11s%2$s| %3$s%7$-11s%2$s|%4$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, COLOR1, RESET, str1, str2, str3);
        System.out.printf("%1$s%2$s+%4$s+%5$s+%5$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, a, b);
        System.out.printf("%1$s%2$s| %4$s%1$s%5$-14s%2$s| %4$s%1$s%6$-11s%2$s| %3$s%7$-,11d%2$s|%4$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, PINK_COLOR, RESET, str4, str5, int1);
        System.out.printf("%1$s%2$s| %3$s%6$s%5$s%1$s %7$-10s%2$s| %3$s%6$s%5$s%1$s %7$-7s%2$s| %4$s%8$-,11d%2$s|%5$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, GREEN_COLOR, PINK_COLOR, RESET, str6, str7, int2);
        System.out.printf("%1$s%2$s+%4$s+%5$s+%5$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, a, b);


    }
    
}
