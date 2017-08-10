package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/10/17.
 */
public class PackingListTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void PackingListInstantiatesCorrectly_true() {
        PackingList packingList = new PackingList();
        assertTrue(packingList instanceof PackingList);
    }

}