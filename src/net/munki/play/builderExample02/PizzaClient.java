package net.munki.play.builderExample02;

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
