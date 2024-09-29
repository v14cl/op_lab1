package com.lab1.app;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1: ");
        final int a = 5;
        final int b = ScalarTypesAndRefs.inc(a);
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }

    public static void task2() {
        System.out.println("Task 2: ");
        final Num obj = new Num(5);
        ScalarTypesAndRefs.inc(obj);
        System.out.printf(" Value of obj.n: %d\n", obj.n);
    }

    public static void task3() {
        System.out.println("Task 3: ");
        final int arr_size = 10;
        Object[] arr = new Object[arr_size];
        
        arr[0] = new String("apple");
        arr[1] = new Boolean(false);
        arr[2] = new Integer(1);
        arr[3] = new Double(1.123);
        arr[4] = new Double(3.321);
        arr[5] = new Boolean(true);
        arr[6] = new Float(1.5);
        arr[7] = new Integer(7);
        arr[8] = new String("hello");
        arr[9] = new Float(5.6);
        
        HashMap<String, Integer> hm = DataTypes.count_datatypes(arr);
        for (String key : hm.keySet()) {
            System.out.print(' ');
            System.out.print(key);
            System.out.print(" - ");
            System.out.println(hm.get(key));
        }
    }
}
