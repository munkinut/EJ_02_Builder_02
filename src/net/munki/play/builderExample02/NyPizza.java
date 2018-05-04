/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.munki.play.builderExample02;

import java.util.Objects;

/**
 *
 * @author Warren
 */
public class NyPizza extends Pizza {
    
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;
    
    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
    
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override public NyPizza build() {
            return new NyPizza(this);
        }

        @Override protected Builder self() {
            return this;
        }
    }
    
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
