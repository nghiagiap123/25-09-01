/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27.pkg10.b2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class B2 {

   static int ktra(int z)
    {
        int s=0;
        for(int i=1;i < z ;i++)
        {
            if(z%i==0)
                s= s + i;
        }
        if(s==z) return 1;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int []a = new int [n+5] ;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
        System.out.println("In mang da sap xep: ");
        for(int i=0;i<n;i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        System.out.println("");
        System.out.println("Nhap 1 so x: ");
        int x;
        x=sc.nextInt();
        int h=0;
        if (ktra(x) == 1)
        {
            a[n]=a[n-1];
            a[n-1]=x;
            h=1;
        }
        System.out.println("In mang: ");
        for(int i=0;i<n+1;i++)
            {
                if (h==0 && i== n)
                    break;
                System.out.print(a[i]);
                System.out.print(" ");
            }
    }
}
