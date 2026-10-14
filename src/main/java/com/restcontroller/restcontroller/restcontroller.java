package com.restcontroller.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller 
{
     productservice ps = new productservice();

    @GetMapping("/product")
    public List<product> addproduct(@RequestBody product p) 
    {
    return ps.productaddition(p);
}
}
