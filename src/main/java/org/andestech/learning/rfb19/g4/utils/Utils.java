package org.andestech.learning.rfb19.g4.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

    public static List<Integer> genRandomIntegerList(int N, int min, int max)
    {
        List<Integer> list = new ArrayList<>(N);
        int data;

        for (int i =0; i<N; i++) {
            data = min + new Random().nextInt(max-min);
            list.add(data);
        }

        return list;
    }

    public static List<String> genRandomPasswordList(int N, int minSize, int maxSize)
    {


        return null;
    }


    public static String genRandomPassword(int size)
    {
        // 33 - 126
        int min_ascii = 33, max_ascii = 126;
        StringBuilder sb = new StringBuilder(size);

        for(int i =0; i<size; i++) {

            sb.append(
                    (char) (min_ascii + new Random().nextInt(max_ascii - min_ascii))
            );
        }

        return sb.toString();
    }

    public static List<String> genRandomPasswordList(int N, int size)
    {
        List<String> list = new ArrayList<>(N);
        for(int i = 0; i<N; i++) list.add( genRandomPassword(size));
        return list;
    }

}
