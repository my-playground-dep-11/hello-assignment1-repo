public class Demo3 {
    public static void main(String[] args) {

        String int1 = "123";
        String int2 = "456";
        String int3 = "7890";
        final String COLOR = "\033[31m";
        final String COLOR2 = "\033[30;0m";


        System.out.printf("%1$s(%2$s)%3$s %4$s-%5$s\n",COLOR, int1, COLOR2, int2, int3);
        

    }
    
}
