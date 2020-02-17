package com.example.beer_adviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> brands = new ArrayList<>();

    public List<String> getBrands(String color){
        if(color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
