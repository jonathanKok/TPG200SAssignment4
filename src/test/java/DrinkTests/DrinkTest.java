/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DrinkTests;

import com.tpg200sassignment4.bardomainmodel.model.Drinks.Beer;
import com.tpg200sassignment4.bardomainmodel.model.Drinks.Champagne;
import com.tpg200sassignment4.bardomainmodel.model.Drinks.Cocktail;
import com.tpg200sassignment4.bardomainmodel.model.Drinks.SoftDrink;
import com.tpg200sassignment4.bardomainmodel.model.Drinks.Whiskey;
import com.tpg200sassignment4.bardomainmodel.model.Drinks.Wine;
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
public class DrinkTest {
    private static Beer createBeer;
    private static Beer updateBeer;
    
    private static Champagne createChampagne;
    private static Champagne updateChampagne;
    
    private static Cocktail createCocktail;
    private static Cocktail updateCocktail;
    
    private static SoftDrink createSoftDrink;
    private static SoftDrink updateSoftDrink;
    
    private static Whiskey createWhiskey;
    private static Whiskey updateWhiskey;
    
    private static Wine createWine;
    private static Wine updateWine;
    
    
    
    public DrinkTest() {
    }

    //Beer
    @Test
    public void createBeer()
    {
        Assert.assertEquals(createBeer.getID(), "BRR1001");
    }
    
    @Test
    public void updateBeer()
    {
        Assert.assertEquals(updateBeer.getID(), "BRR1001");
        Assert.assertEquals(updateBeer.getName(), "Black Label");
    }
    
    //Champagne
    @Test
    public void createChampagne()
    {
        Assert.assertEquals(createChampagne.getID(), "CHP1001");
    }
    
    @Test
    public void updateChampagne()
    {
        Assert.assertEquals(updateChampagne.getID(), "CHP1001");
        Assert.assertEquals(updateChampagne.getName(), "Xpensive");
    }
    
    //Cocktail
    @Test
    public void createCocktail()
    {
        Assert.assertEquals(createCocktail.getID(), "CCL1001");
    }
    
    @Test
    public void updateCocktail()
    {
        Assert.assertEquals(updateCocktail.getID(), "CCL1001");
        Assert.assertEquals(updateCocktail.getName(), "Zombie");
    }
    
    //SoftDrink
    @Test
    public void createSoftDrink()
    {
        Assert.assertEquals(createSoftDrink.getID(), "SFT1001");
    }
    
    @Test
    public void updateSoftDrink()
    {
        Assert.assertEquals(updateSoftDrink.getID(), "SFT1001");
        Assert.assertEquals(updateSoftDrink.getName(), "Pepsi");
    }
    
    //Whiskey
    @Test
    public void createWhiskey()
    {
        Assert.assertEquals(createWhiskey.getID(), "WKY1001");
    }
    
    @Test
    public void updateWhiskey()
    {
        Assert.assertEquals(updateWhiskey.getID(), "WKY1001");
        Assert.assertEquals(updateWhiskey.getName(), "Blue Blazer");
    }
    
    //Wine
    @Test
    public void createWine()
    {
        Assert.assertEquals(createWine.getID(), "WNE1001");
    }
    
    @Test
    public void updateWine()
    {
        Assert.assertEquals(updateWine.getID(), "WNE1001");
        Assert.assertEquals(updateWine.getName(), "Beringer");
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        //Beer
        createBeer = new Beer.Builder("BRR1001").name("Castle Lager").build();
        updateBeer = new Beer.Builder("BRR1001").name("Black Label").build();
        
        //Champagne
        createChampagne = new Champagne.Builder("CHP1001").name("Cheap CPX").build();
        updateChampagne = new Champagne.Builder("CHP1001").name("Xpensive").build();
        
        //Cocktail
        createCocktail = new Cocktail.Builder("CCL1001").name("Porto flip").build();
        updateCocktail = new Cocktail.Builder("CCL1001").name("Zombie").build();
        
        //SoftDrink
        createSoftDrink = new SoftDrink.Builder("SFT1001").name("Coca-Cola").build();
        updateSoftDrink = new SoftDrink.Builder("SFT1001").name("Pepsi").build();
        
        //Whiskey
        createWhiskey = new Whiskey.Builder("WKY1001").name("Bourbon Lancer").build();
        updateWhiskey = new Whiskey.Builder("WKY1001").name("Blue Blazer").build();
        
        //Wine
        createWine = new Wine.Builder("WNE1001").name("Pastich").build();
        updateWine = new Wine.Builder("WNE1001").name("Beringer").build();
        
        
        
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
