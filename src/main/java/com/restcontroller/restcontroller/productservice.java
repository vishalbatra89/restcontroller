package com.restcontroller.restcontroller;

import java.util.*;

public class productservice 
{
    List<product> l=new ArrayList<>();
    public List<product> productaddition(product p) 
    {
        l.add(p);
        return l;
    }





    /*Scanner sc=new Scanner(System.in);
    private int productid;
    private String productname;
    private String productcategory;
    public int noofproductstobeadded()
    {
        System.out.println("Enter the number of products to be added");
        int x=sc.nextInt();
        return 0;
    }
    
    public List<product> productaddition(int x)
    {
        List<product> l=new ArrayList<>();
        for (int i=x;i>0;i--)
        {
            System.out.println("Enter the Product ID");
            int productid=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Product Name");
            String productname=sc.nextLine();

            System.out.println("Enter the Product Category");
            String productcategory=sc.nextLine();

            product p=new product(productid,productname,productcategory);
            l.add(p);
        }
        return l;
    }*/

}
