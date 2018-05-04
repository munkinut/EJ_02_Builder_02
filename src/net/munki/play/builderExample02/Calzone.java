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
public class Calzone extends Pizza {
    
    private final boolean sauceInside;
    
    public boolean getSauceInside() {
        return sauceInside;
    }
    
    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;
        
        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }
        
        @Override public Calzone build() {
            return new Calzone(this);
        }
        
        @Override protected Builder self() {
            return this;
        }
        
    }
    
    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
