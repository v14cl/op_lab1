package com.lab1.app;

public class ScalarTypesAndRefs {
    public static int inc(int a) {
        return ++a;
    }
    
    public static void inc(Num num) {
        ++num.n;
    }
}
