//package Exception;
//
//import javax.imageio.stream.FileImageInputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Practice2 {
//
//    public static void main(String[] args) {
//
//
//        try {
//            FileInputStream file = new FileInputStream("Test.txt");
//
//            Scanner scanner = new Scanner(file);
//
//            while(scanner.hasNext()) {
//
//                System.out.println(scanner.nextLine());
//            }
//
//        } catch (IndexOutOfBoundsException exception) {
//
//            System.out.println("File not found");
//            System.out.println(Arrays.toString(exception.getStackTrace()));
//            System.out.println(exception.getCause());
//            System.out.println(exception.getMessage());
//        }
//    }
//
//}