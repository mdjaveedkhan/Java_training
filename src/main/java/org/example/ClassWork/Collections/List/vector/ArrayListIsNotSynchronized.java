package org.example.ClassWork.Collections.List.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListIsNotSynchronized {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                arrayList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                arrayList.add(i);
            }
        });

        System.out.println("Initial size: " + arrayList.size()); // Expected: 0

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("ArrayList size after thread start: " + arrayList.size()); // Expected: 2002
    }
}