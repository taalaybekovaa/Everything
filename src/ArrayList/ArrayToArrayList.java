package ArrayList;

import Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;// Import everything after this util

public class ArrayToArrayList {
    public static void main(String[] args) {


        Object[] objects= {2,true,"yes","no", 2.5, new Car()};
       // How to convert arrays to ArrayList

       List<Object> list =Arrays.asList(objects);
        System.out.println(list.size());

        //list.add("new element");//If you are going to change array to ArrayList you cannot change the size.Unsupported Operation Exception
        System.out.println(list);
        //list.remove("yes");
        System.out.println(list);

List<Object> list1= Arrays.asList(1,2,3,4,true);
        System.out.println(list1);

        }
    }
