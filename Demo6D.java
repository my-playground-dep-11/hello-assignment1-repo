public class Demo6D{
    public static void main(String[] args) {
        
        final String HEAD_LINE_COLOR = "\033[30;1m";
        final String BACK_GROUND_COLOR = "\033[40m";
        final String YELLOW_COLOR = "\033[33m";
        final String GREEN_COLOR = "\033[32m";
        final String BLUE_COLOR = "\033[34m";
        final String PINK_COLOR = "\033[35m";
        final String RESET = "\033[30;0m";

        String str1 = "ITEM";
        String str2 = "QUANTITY";
        String str3 = "PRICE";
        String str4 = "Apples";
        String str5 = "Oranges";
        String str6 = "$";
        String int1 = "5";
        String int2 = "10";
        String double1 = "0.99";
        String double2 = "1.49";

        String a = String.format("-".repeat(10));
        String b = String.format("-".repeat(7));

        //System.out.printf("%1$s%2$s+--------------+----------+---------+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET);
        System.out.printf("%1$s%2$s+%4$s+%4$s+%5$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, a, b);
        System.out.printf("%s%3$s| %2$s%4$-8s %3$s| %2$s%5$-7s %3$s| %2$s%6$-6s%3$s|%7$s\n", BACK_GROUND_COLOR, HEAD_LINE_COLOR, YELLOW_COLOR, str1, str2, str3, RESET);
        //System.out.printf("%1$s%2$s+%4$s--------------%2$s+----------+%4$s---------%2$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, GREEN_COLOR);
        System.out.printf("%1$s%2$s+%4$s%5$s%2$s+%2$s%5$s+%4$s%6$s%2$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET,GREEN_COLOR, a, b);
        System.out.printf("%s%2$s| %3$s%1$s%7$-8s %2$s| %4$s%8$8s %2$s| %5$s%10$s%6$s%9$-4s %2$s|%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, BLUE_COLOR, GREEN_COLOR, PINK_COLOR, str4, int1, double1, str6);
        System.out.printf("%s%2$s| %3$s%1$s%7$-8s %2$s| %4$s%8$8s %2$s| %5$s%10$s%6$s%9$-4s %2$s|%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, BLUE_COLOR, GREEN_COLOR, PINK_COLOR, str5, int2, double2, str6);
        //System.out.printf("%1$s%2$s+%4$s--------------%2$s+----------+%4$s---------%2$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET, GREEN_COLOR);
        System.out.printf("%1$s%2$s+%4$s%5$s%2$s+%2$s%5$s+%4$s%6$s%2$s+%3$s\n", BACK_GROUND_COLOR, YELLOW_COLOR, RESET,GREEN_COLOR, a, b);
    }
}