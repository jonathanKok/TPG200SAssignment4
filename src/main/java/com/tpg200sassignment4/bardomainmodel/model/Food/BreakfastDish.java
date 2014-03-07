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
public final class BreakfastDish implements Food
{
    private String id;
    private String name;
    
    private BreakfastDish()
    {
    }
    
    private BreakfastDish(Builder builder)
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
                
        public BreakfastDish build()
        {
            return new BreakfastDish(this);
        }
    }
    //end Builder
    
    public String getID() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BreakfastDish other = (BreakfastDish) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }


    
}
