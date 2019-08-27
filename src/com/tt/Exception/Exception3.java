package com.tt.Exception;

import java.io.File;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {

        // Checked Exception(Compile time exception)
        // Unchecked(Runtime exception)



    /* Checked Exception - следует обрабатывать
    File file = new File("Bob");
    Scanner scanner = new Scanner(file); // это checked exception(не ошибка, а исключительный случай)
     */



    /* Unchecked - не надо обрабатывать, т.к. в нормальной программе они не должны возникать
        int a = 1 / 0; // это unchecked exception, неправильно написанная программа

        String str = null;
        str.length(); // NullPointer

        int[] arr = new int[2];
        System.out.println(arr[2]); // ArrayIndexOutOfBound
     */


    }
}
