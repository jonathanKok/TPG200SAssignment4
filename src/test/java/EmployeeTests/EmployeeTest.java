package EmployeeTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tpg200sassignment4.bardomainmodel.model.Employee.Bartender;
import com.tpg200sassignment4.bardomainmodel.model.Employee.Chef;
import com.tpg200sassignment4.bardomainmodel.model.Employee.DishWasher;
import com.tpg200sassignment4.bardomainmodel.model.Employee.Janitor;
import com.tpg200sassignment4.bardomainmodel.model.Employee.Manager;
import com.tpg200sassignment4.bardomainmodel.model.Employee.Repairman;
import com.tpg200sassignment4.bardomainmodel.model.Employee.Waiter;
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
public class EmployeeTest {
    
    private static Waiter createWaiterObj;
    private static Waiter updateWaiterObj;
    
    private static Bartender createBartender;
    private static Bartender updateBartender;
    
    private static Chef createChef;
    private static Chef updateChef;
    
    private static DishWasher createDishwasher;
    private static DishWasher updateDishwasher;
    
    private static Janitor createJanitor;
    private static Janitor updateJanitor;
    
    private static Manager createManager;
    private static Manager updateManager;
    
    private static Repairman createRepairman;
    private static Repairman updateRepairman;
    
    public EmployeeTest() {
    }

    //Waiter
    @Test
    public void createWaiter()
    {
        Assert.assertEquals(createWaiterObj.getID(), "WTR1001");
    }
    
    @Test
    public void updateWaiter()
    {
        Assert.assertEquals(updateWaiterObj.getID(), "WTR1001");
        Assert.assertEquals(updateWaiterObj.getName(), "Peter");
    }
    
    //Bartender
    @Test
    public void createBartender()
    {
        Assert.assertEquals(createBartender.getID(), "BTD1001");
    }
    
    @Test
    public void updateBartender()
    {
        Assert.assertEquals(updateBartender.getID(), "BTD1001");
        Assert.assertEquals(updateBartender.getName(), "Jossie");
    }
    
    //Chef
    @Test
    public void createChef()
    {
        Assert.assertEquals(createChef.getID(), "CHF1001");
    }
    
    @Test
    public void updateChef()
    {
        Assert.assertEquals(updateChef.getID(), "CHF1001");
        Assert.assertEquals(updateChef.getName(), "Sara");
    }
    
    //Dish Washer
    @Test
    public void createDishWasher()
    {
        Assert.assertEquals(createDishwasher.getID(), "DSW1001");
    }
    
    @Test
    public void updateDishWasher()
    {
        Assert.assertEquals(updateDishwasher.getID(), "DSW1001");
        Assert.assertEquals(updateDishwasher.getName(), "Lina");
    }
    
    //Janitor
    @Test
    public void createJanitor()
    {
        Assert.assertEquals(createJanitor.getID(), "JNR1001");
    }
    
    @Test
    public void updateJanitor()
    {
        Assert.assertEquals(updateJanitor.getID(), "JNR1001");
        Assert.assertEquals(updateJanitor.getName(), "Hellen");
    }
    
    //Manager
    @Test
    public void createManager()
    {
        Assert.assertEquals(createManager.getID(), "MGR1001");
    }
   
    @Test
    public void updateManager()
    {
        Assert.assertEquals(updateManager.getID(), "MGR1001");
        Assert.assertEquals(updateManager.getName(), "Katye");
    }
    
    //Repairman
    @Test
    public void createRepairman()
    {
        Assert.assertEquals(createRepairman.getID(), "RPR1001");
    }
    
    @Test
    public void updateRepairman()
    {
        Assert.assertEquals(updateRepairman.getID(), "RPR1001");
        Assert.assertEquals(updateRepairman.getName(), "Victor");
    }
    
    
    
    
    
    
    
    
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
       //Waiter
       createWaiterObj = new Waiter.Builder("WTR1001").name("John").build();
       updateWaiterObj = new Waiter.Builder("WTR1001").name("Peter").build();
       
       //Bartender
       createBartender = new Bartender.Builder("BTD1001").name("Jekkie").build();
       updateBartender = new Bartender.Builder("BTD1001").name("Jossie").build();
       
       //Chef
       createChef= new Chef.Builder("CHF1001").name("Andre").build();
       updateChef = new Chef.Builder("CHF1001").name("Sara").build();
       
       //Dishwasher
       createDishwasher = new DishWasher.Builder("DSW1001").name("Steven").build();
       updateDishwasher = new DishWasher.Builder("DSW1001").name("Lina").build();
       
       //Janitor
       createJanitor = new Janitor.Builder("JNR1001").name("Mark").build();
       updateJanitor = new Janitor.Builder("JNR1001").name("Hellen").build();
       
       //Manager
       createManager = new Manager.Builder("MGR1001").name("Rex").build();
       updateManager = new Manager.Builder("MGR1001").name("Katye").build();
       
       //Repairman
       createRepairman = new Repairman .Builder("RPR1001").name("Ram").build();
       updateRepairman  = new Repairman .Builder("RPR1001").name("Victor").build();
  
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
