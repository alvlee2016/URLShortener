import org.junit.*;
import java.util.*;
public class KeyTester {
    RandomKeyGenerator rand;
    @Before
    public void init()
    {
        rand = new RandomKeyGenerator();
    }

    @Test
    public void testLength()
    {
        String key = rand.randomKey("https://mission-fusd-ca.schoolloop.com/file/1439532706630/1335087048875/71015114171863847641599967019253.pdf?filename=Building%2BJava%2BPrograms%2B%25283rd%2BEdition%2529.pdf");
        Assert.assertEquals(8, key.length());
    }
    @Test
    public void testCollide()
    {
        ArrayList<String> list = new ArrayList<>();
        for(int i  = 0; i < 10; i++)
        {
            String key = rand.randomKey("randomLink.com/afiuhafweaef");
            Assert.assertFalse(list.contains(key));
            list.add(key);
        }
    }
    @Test
    public void testNull()
    {
        String key = rand.randomKey("");
        Assert.assertNull(key);
    }
}
