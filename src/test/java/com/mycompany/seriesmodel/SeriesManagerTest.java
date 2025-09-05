/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.seriesmodel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesManagerTest {
    
    public SeriesManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SeriesManager.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        SeriesManager.showMenu();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCaptureSeries() {
        System.out.println("captureSeries");
        SeriesManager.captureSeries();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchSeries() {
        System.out.println("searchSeries");
        SeriesManager.searchSeries();
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateAgeRestriction() {
        System.out.println("updateAgeRestriction");
        SeriesManager.updateAgeRestriction();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteSeries() {
        System.out.println("deleteSeries");
        SeriesManager.deleteSeries();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintReport() {
        System.out.println("printReport");
        SeriesManager.printReport();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchSeriesById() {
        System.out.println("searchSeriesById");
        String id = "";
        SeriesModel expResult = null;
        SeriesModel result = SeriesManager.searchSeriesById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateSeriesAge() {
        System.out.println("updateSeriesAge");
        String id = "";
        int newAge = 0;
        boolean expResult = false;
        boolean result = SeriesManager.updateSeriesAge(id, newAge);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteSeriesById() {
        System.out.println("deleteSeriesById");
        String id = "";
        boolean expResult = false;
        boolean result = SeriesManager.deleteSeriesById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsValidAgeRestriction() {
        System.out.println("isValidAgeRestriction");
        int age = 0;
        boolean expResult = false;
        boolean result = SeriesManager.isValidAgeRestriction(age);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPreloadSeries() {
        System.out.println("preloadSeries");
        SeriesManager.preloadSeries();
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateSeries() {
        System.out.println("updateSeries");
        SeriesManager.updateSeries();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchByName() {
        System.out.println("searchByName");
        SeriesManager.searchByName();
        fail("The test case is a prototype.");
    }

    @Test
    public void testListByAgeRestriction() {
        System.out.println("listByAgeRestriction");
        SeriesManager.listByAgeRestriction();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShowTotalSeries() {
        System.out.println("showTotalSeries");
        SeriesManager.showTotalSeries();
        fail("The test case is a prototype.");
    }
    
}
