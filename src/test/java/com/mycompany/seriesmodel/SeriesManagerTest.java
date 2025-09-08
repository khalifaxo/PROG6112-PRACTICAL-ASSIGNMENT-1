package com.mycompany.seriesmodel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for SeriesManager
 */
public class SeriesManagerTest {

    @BeforeClass
    public static void setUpClass() {
        // preload some series before tests
        SeriesManager.seriesList.clear();
        SeriesManager.seriesList.add(new SeriesModel("S1", "Breaking Bad", 18));
        SeriesManager.seriesList.add(new SeriesModel("S2", "Stranger Things", 16));
    }

    @AfterClass
    public static void tearDownClass() {
        SeriesManager.seriesList.clear();
    }

    @Test
    public void testSearchSeriesById_found() {
        SeriesModel result = SeriesManager.searchSeriesById("S1");
        assertNotNull("Series should be found", result);
        assertEquals("Breaking Bad", result.SeriesName);
    }

    @Test
    public void testSearchSeriesById_notFound() {
        SeriesModel result = SeriesManager.searchSeriesById("S99");
        assertNull("Series should not be found", result);
    }

    @Test
    public void testUpdateSeriesAge_success() {
        boolean updated = SeriesManager.updateSeriesAge("S2", 13);
        assertTrue("Age restriction should be updated", updated);

        SeriesModel updatedSeries = SeriesManager.searchSeriesById("S2");
        assertEquals(13, updatedSeries.AgeRestriction);
    }

    @Test
    public void testUpdateSeriesAge_fail() {
        boolean updated = SeriesManager.updateSeriesAge("X999", 12);
        assertFalse("Update should fail for non-existent ID", updated);
    }

    @Test
    public void testDeleteSeriesById_success() {
        boolean deleted = SeriesManager.deleteSeriesById("S1");
        assertTrue("Series should be deleted", deleted);
        assertNull("Deleted series should no longer exist",
                   SeriesManager.searchSeriesById("S1"));
    }

    @Test
    public void testDeleteSeriesById_fail() {
        boolean deleted = SeriesManager.deleteSeriesById("X000");
        assertFalse("Delete should fail for non-existent ID", deleted);
    }

    @Test
    public void testIsValidAgeRestriction() {
        assertTrue(SeriesManager.isValidAgeRestriction(13));
        assertTrue(SeriesManager.isValidAgeRestriction(18));
        assertFalse(SeriesManager.isValidAgeRestriction(-1));
        assertFalse(SeriesManager.isValidAgeRestriction(200));
    }

    @Test
    public void testShowTotalSeries() {
        int before = SeriesManager.seriesList.size();
        SeriesManager.seriesList.add(new SeriesModel("S3", "The Witcher", 18));
        int after = SeriesManager.seriesList.size();
        assertEquals(before + 1, after);
    }
}

