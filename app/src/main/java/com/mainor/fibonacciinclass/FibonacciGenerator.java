package com.mainor.fibonacciinclass;

import java.util.ArrayList;

public class FibonacciGenerator {

    public static ArrayList<Long> getFibonacciNums(int count) {

        ArrayList<Long> list = new ArrayList<>(count);

        long n1=0,n2=1,n3,i;

        list.add(n1);
        list.add(n2);
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            list.add(n3);
            n1=n2;
            n2=n3;
        }
        return list;
    }
}
