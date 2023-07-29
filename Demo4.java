public class Demo4 {
    public static void main(String[] args) {
        String day = "28";
        String month = "12";
        String year = "2023";
        String hour = "23";
        String minute = "59";
        String second = "59";
        final String COLOR1 = "\033[31m";
        final String COLOR2 = "\033[32m";
        final String COLOR3 = "\033[33m";
        final String COLOR4 = "\033[34m";
        final String COLOR5 = "\033[35m";
        final String COLOR6 = "\033[36m";
        final String COLOR7 = "\033[30;0m";

        System.out.printf("%7$s%2$s%13$s/%8$s%1$s%13$s/%9$s%3$s %10$s%4$s%13$s:%11$s%5$s%13$s:%12$s%6$s\n", day, month, year, hour, minute, second, COLOR1, COLOR2, COLOR3, COLOR4, COLOR5, COLOR6, COLOR7);




    }
    
}
