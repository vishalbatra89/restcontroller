package com.restcontroller.restcontroller;

public class product 
{
    private int productid;
    private String productname;
    private String productcategory;
    public int getProductid() {
        return productid;
    }
    public void setProductid(int productid) {
        this.productid = productid;
    }
    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public String getProductcategory() {
        return productcategory;
    }
    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory;
    }
    public product(int productid, String productname, String productcategory) {
        this.productid = productid;
        this.productname = productname;
        this.productcategory = productcategory;
    }
    public product()
    {

    }

}

