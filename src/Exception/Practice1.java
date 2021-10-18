package Exception;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println(" This is my first Print before Exception");
        int a = 9;


        try {

            String str = "35c";
            String sub = str.substring(5);
            int number = Integer.parseInt(str);
            System.out.println(number);


        } catch (IllegalArgumentException exception) {

            int number = 5;
            int numbers2 = 25;
            System.out.println(" This is my first Print before Exception");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(" This is second catch block");
        }
        try {
            String str = " 35C";
            String sub = str.substring(5);

        } catch (IndexOutOfBoundsException exception){
            System.out.println("This is my print after exception");
        }
    }
}
