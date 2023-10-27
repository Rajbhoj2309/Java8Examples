package com.java8Features.lamdaExprssion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionExampleComparator {
	
	public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
          
        //Adding Products  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));
        list.add(new Product(7,"HP Laptop",25000f));  
        list.add(new Product(8,"Keyboard",300f));  
        list.add(new Product(9,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }
        
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
        
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
  
    }

}
