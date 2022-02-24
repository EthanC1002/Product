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

import java.util.*;

public class SortProducts 
{
    public static void main(String[] args)
    {
        int i = 0;
        boolean sort = false;
        
        ArrayList<Products> prods = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Do you want to enter a product (y/n): ");
        char option = scan.next().charAt(0);
        
        switch (option) 
        {
            case 'y':
                while (option == 'y')
                {
                    String name = "name";
                    double price = 0;
                    Products prod = new Products(name , price);
                    
                    System.out.println("Enter product " +(i+1)+ " name: ");
                    prod.setName(scan.next());
                    System.out.println("Enter product " +(i+1)+ " price: ");
                    prod.setPrice(scan.nextDouble());
                    
                    prods.add(prod);
                    i++;
                    
                    System.out.println("Do you want to enter another product (y/n): ");
                    option = scan.next().charAt(0);
                    
                    if (option == 'n')
                    {
                        while(!sort)
                        {
                            sort = true;
                            for (i=0; i<prods.size()-1; i++) 
                            {
                                if (prods.get(i).getPrice()>prods.get(i+1).getPrice())
                                {
                                    double tempPrice = prods.get(i).getPrice();
                                    String tempName = prods.get(i).getName();
                                    prods.get(i).setPrice(prods.get(i+1).getPrice());
                                    prods.get(i).setName(prods.get(i+1).getName());
                                    prods.get(i+1).setPrice(tempPrice);
                                    prods.get(i+1).setName(tempName);
                                    sort = false;
                                }
                            }
                        }
                        System.out.println("The sorted array list is: ");
                        for (i = 0; i<prods.size(); i++)
                        {
                            System.out.println("Product: " +prods.get(i).getName()+ ". Price: " +prods.get(i).getPrice());
                        }
                    }
                }   break;
            case 'n':
                System.out.println("select 'y' before 'n'");
                  break;
            default:
                System.out.println("Enter valid option (y/n)");
                break;
        }
    }
}