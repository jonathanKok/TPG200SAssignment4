/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SupplierTests;

import com.tpg200sassignment4.bardomainmodel.model.Supplier.AlcoholSupplier;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jonathan Kok 3A (211114448)
 */
public class SupplierTest {
    private static AlcoholSupplier createAlcSupplier;
    private static AlcoholSupplier updateAlcSupplier;
    
    public SupplierTest() {
    }

    //Alc Supplier
    @Test
    public void createAlcoholSupplier()
    {
        Assert.assertEquals(createAlcSupplier.getID(), "ASP1001");
    }
    
    @Test
    public void updateAlcoholSupplier()
    {
        Assert.assertEquals(updateAlcSupplier.getID(), "ASP1001");
        Assert.assertEquals(updateAlcSupplier.getName(), "Melissa");
    }
    
  
    @BeforeClass
    public static void setUpClass() throws Exception {
      createAlcSupplier = new AlcoholSupplier.Builder("ASP1001").name("Johan").build();
      updateAlcSupplier = new AlcoholSupplier.Builder("ASP1001").name("Melissa").build();
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
