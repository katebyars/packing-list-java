import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import models.PackingList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PackingListTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void PackingListInstantiatesCorrectly_true() {
        PackingList packingList = new PackingList("Jo's Backpack");
        assertTrue(packingList instanceof PackingList);
    }

    @Test
    public void PackingListInstantiatesWIthContent_True() {
        PackingList packingList = new PackingList("Jo's Backpack");
        assertEquals("Jo's Backpack", packingList.getName());
    }

    @Test
    public void AllBagItemsAreReturned_true() throws Exception {
        PackingList packingList = new PackingList("Jo'Backpack");
        PackingList otherPackingList = new PackingList("The other Backpack");
        assertEquals(2, PackingList.getAll().size());
    }

    @Test
    public void AllItemsPackedInBags_true() throws Exception {
        PackedInBag packed = new PackedInBag("axe");
        PackedInBag morePacked = new PackedInBag("water");
        assertEquals(2, PackedInBag.getItemsInBag().size());
    }

}