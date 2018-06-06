package com.hackercode.controller;
import com.hackercode.utilities.*;
import java.util.Scanner;
public class Driver {
    public static void main(String args[]){
        Scanner sr=new Scanner(System.in);
        int a=sr.nextInt();
        int b=sr.nextInt();
        Operations obj=new Operations();

        int c=obj.add(a,b);
        int diff=obj.sub(a,b);
        System.out.println("sum is "+c);
        System.out.println("diff is "+diff);
        int arr[]={3,2,4,5,8,1};
        SelectionSort sortObj = new SelectionSort();
        sortObj.sorting(arr);
    }
}
