/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tpg200sassignment4.bardomainmodel.model.Food;
import java.util.Locale.Builder;

/**
 *
 * @author student
 */
public final class VegetarianDish implements Food
{
    private String id;
    private String name;
    
    private VegetarianDish()
    {
    }
    
    private VegetarianDish(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getName() {
       return name;
    }
    
    public static class Builder
    {
        private String id;
        private String name;
        
        public Builder(String idValue)
        {
            id = idValue;
        }
        
        public Builder name(String nm)
        {
            name = nm;
            return(this);
        }
                
        public VegetarianDish build()
        {
            return new VegetarianDish(this);
        }
    }
    //end Builder
    
    public String getID() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VegetarianDish other = (VegetarianDish) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
}
