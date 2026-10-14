package com.restcontroller.restcontroller;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestcontrollerApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(RestcontrollerApplication.class, args);
		/*productservice ps = new productservice();

        int x = ps.noofproductstobeadded();

        List<product> products = ps.productaddition(x);

        for (product p : products) {
            System.out.println("Product ID: " + p.getProductid());
            System.out.println("Product Name: " + p.getProductname());
            System.out.println("Product Category: " + p.getProductcategory());
            System.out.println("----------------------");
        }*/
	}

}
