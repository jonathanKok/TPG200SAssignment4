/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tpg200sassignment4.bardomainmodel.model.Drinks;
import java.util.Locale.Builder;

/**
 *
 * @author student
 */
public final class Champagne implements Drinks
{
    private String id;
    private String name;
    
    private Champagne()
    {
    }
    
    private Champagne(Builder builder)
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
                
        public Champagne build()
        {
            return new Champagne(this);
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
        final Champagne other = (Champagne) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
}
