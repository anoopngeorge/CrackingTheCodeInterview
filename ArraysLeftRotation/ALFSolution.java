import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
       int rotArray[] = new int[n]; 
        for (int j=0;j<k;j++)
        {
            /*System.out.println("Printing a ");
            for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
      
        System.out.println();
            System.out.println("Printing rotArray ");
            for(int i = 0; i < n; i++)
            System.out.print(rotArray[i] + " ");
      
        System.out.println();*/
            for(int a_i=0;a_i<n;a_i++)
            {
                /*
                System.out.println("Printing value of a_i "+a_i);
                System.out.println("Printing value of a[a_i] "+a[a_i]);
                System.out.println("Printing value of rotArray[a_i] "+rotArray[a_i]);
                */
                if(a_i != n-1)
                    rotArray[a_i] = a[a_i+1];
                else
                    rotArray[a_i] = a[0];
                   /*
                   System.out.println("Printing a after each shifting ");
            for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
      
        System.out.println();
            System.out.println("Printing rotArray after each shifting ");
            for(int i = 0; i < n; i++)
            System.out.print(rotArray[i] + " ");
             System.out.println();
             */
            }
            /*
            System.out.println("Printing a after shifting ");
            for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
      
        System.out.println();
            System.out.println("Printing rotArray after shifting ");
            for(int i = 0; i < n; i++)
            System.out.print(rotArray[i] + " ");
             System.out.println();
             */
            System.arraycopy(rotArray, 0, a, 0, n);
            
        }
      
        return rotArray;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
