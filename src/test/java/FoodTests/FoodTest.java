/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FoodTests;

import com.tpg200sassignment4.bardomainmodel.model.Drinks.Wine;
import com.tpg200sassignment4.bardomainmodel.model.Food.BeefDish;
import com.tpg200sassignment4.bardomainmodel.model.Food.BreakfastDish;
import com.tpg200sassignment4.bardomainmodel.model.Food.ChickenDish;
import com.tpg200sassignment4.bardomainmodel.model.Food.Food;
import com.tpg200sassignment4.bardomainmodel.model.Food.Sandwitch;
import com.tpg200sassignment4.bardomainmodel.model.Food.SeafoodDish;
import com.tpg200sassignment4.bardomainmodel.model.Food.VegetarianDish;
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
public class FoodTest {
    private static BeefDish createBeefDish;
    private static BeefDish updateBeefDish;
    
    private static BreakfastDish createBreakfastDish;
    private static BreakfastDish updateBreakfastDish;
    
    private static ChickenDish createChickenDish;
    private static ChickenDish updateChickenDish;
    
    private static Sandwitch createSandwitch;
    private static Sandwitch updateSandwitch;
    
    private static SeafoodDish createSeafoodDish;
    private static SeafoodDish updateSeafoodDish;
    
    private static VegetarianDish createVegetarianDish;
    private static VegetarianDish updateVegetarianDish;
    
    
    //Beef
    @Test
    public void createBeefDish()
    {
        Assert.assertEquals(createBeefDish.getID(), "BFF1001");
    }
    
    @Test
    public void updateBeefDish()
    {
        Assert.assertEquals(updateBeefDish.getID(), "BFF1001");
        Assert.assertEquals(updateBeefDish.getName(), "Beef Burger");
    }
    
    //Breakfeast
    @Test
    public void createBreakfastDish()
    {
        Assert.assertEquals(createBreakfastDish.getID(), "BFS1001");
    }
    
    @Test
    public void updateBreakfastDish()
    {
        Assert.assertEquals(updateBreakfastDish.getID(), "BFS1001");
        Assert.assertEquals(updateBreakfastDish.getName(), "Bacon and Eggs");
    }
    
    //Chicken
    @Test
    public void createChickenDish()
    {
        Assert.assertEquals(createChickenDish.getID(), "CHK1001");
    }
    
    @Test
    public void updateChickenDish()
    {
        Assert.assertEquals(updateChickenDish.getID(), "CHK1001");
        Assert.assertEquals(updateChickenDish.getName(), "Fried Chicken");
    }

    //Sandwitch
    @Test
    public void createSandwitch()
    {
        Assert.assertEquals(createSandwitch.getID(), "SND1001");
    }
    
    @Test
    public void updateSandwitch()
    {
        Assert.assertEquals(updateSandwitch.getID(), "SND1001");
        Assert.assertEquals(updateSandwitch.getName(), "Grilled Cheese");
    }
    
    //Seafood
    @Test
    public void createSeafoodDish()
    {
        Assert.assertEquals(createSeafoodDish.getID(), "SEA1001");
    }
    
    @Test
    public void updateSeafoodDish()
    {
        Assert.assertEquals(updateSeafoodDish.getID(), "SEA1001");
        Assert.assertEquals(updateSeafoodDish.getName(), "Fish and Chips");
    }

    //Vegetarian Dish
    @Test
    public void createVegetarianDish()
    {
        Assert.assertEquals(createVegetarianDish.getID(), "VEG1001");
    }
    
    @Test
    public void updateVegetarianDish()
    {
        Assert.assertEquals(updateVegetarianDish.getID(), "VEG1001");
        Assert.assertEquals(updateVegetarianDish.getName(), "Salad");
    }
    
    
    
    
    public FoodTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //Beef Dish
        createBeefDish = new BeefDish.Builder("BFF1001").name("Beef Lasagne").build();
        updateBeefDish  = new BeefDish.Builder("BFF1001").name("Beef Burger").build();
        
        //Breakfast
        createBreakfastDish = new BreakfastDish.Builder("BFS1001").name("Toast").build();
        updateBreakfastDish  = new BreakfastDish.Builder("BFS1001").name("Bacon and Eggs").build();
        
        //Chicken
        createChickenDish = new ChickenDish.Builder("CHK1001").name("Chicken Nuggets").build();
        updateChickenDish  = new ChickenDish.Builder("CHK1001").name("Fried Chicken").build();
    
        //Sandwitch
        createSandwitch = new Sandwitch.Builder("SND1001").name("Ham and Cheese").build();
        updateSandwitch  = new Sandwitch.Builder("SND1001").name("Grilled Cheese").build();
        
        //Seafood
        createSeafoodDish = new SeafoodDish.Builder("SEA1001").name("Fried Fish").build();
        updateSeafoodDish  = new SeafoodDish.Builder("SEA1001").name("Fish and Chips").build();
        
        //Vegetarian
        createVegetarianDish = new VegetarianDish.Builder("VEG1001").name("Vegetarian Pasta").build();
        updateVegetarianDish  = new VegetarianDish.Builder("VEG1001").name("Salad").build();
    
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
