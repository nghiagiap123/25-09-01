/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27.pkg10;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static int chuyen(char c)
    {
        return (int) c - 48;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        s= sc.nextLine();
        int dem=0,tong=0,kt=1;
        for(int i=0;i<s.length();i++)
        {
           int x= chuyen(s.charAt(i));
           if (x>=0 && x<=9)
           {
               
               if( x%2 == 0)
               {
                   dem++;
                   tong+= x;
               }
           }
        }
        System.out.println(dem);
        System.out.println(tong);
    }
    
}
