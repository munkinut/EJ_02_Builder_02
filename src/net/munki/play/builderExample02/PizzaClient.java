/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.munki.play.builderExample02;

/**
 *
 * @author Warren
 */
public class PizzaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();
        
        for (Pizza.Topping topping : pizza.toppings) {
            System.out.println("Topping : " + topping);
        }
        
        System.out.println("Sauce Inside : " + calzone.getSauceInside());
    }

}
