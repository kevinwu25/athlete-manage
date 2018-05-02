package models;

import org.junit.*;
import static org.junit.Assert.*;
import play.test.WithApplication;
import static play.test.Helpers.*;

public class NameTest extends WithApplication {

    @Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase()));
    }

    @Test
    public void testCanSaveAndFindName() {
        new Name("Abtin", "Sepanlou").save();
        Name name = Name.find.query().where().eq("Abtin", "Sepanlou").findOne();
        assertEquals("Abtin, Sepanlou", name.getFirstLast());
        assertEquals("Sepanlou, Abtin", name.getLastFirst());
    }
}
