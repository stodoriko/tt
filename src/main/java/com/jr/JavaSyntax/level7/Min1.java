package com.jr.JavaSyntax.level7;

import java.io.IOException;

public class Min1 {
    public static void main(String[] args) throws IOException
    {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println ("Min is " + min);
    }
}
