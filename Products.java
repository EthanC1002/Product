/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

/**
 *
 * @author ethan
 */
public class Products 
{
    //fields
    private String name;
    private double price;
    
    //constructor
    public Products(String name, double price)
    {
       this.name = name;
       this.price = price;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
