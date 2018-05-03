package models;

import org.junit.*;
import static org.junit.Assert.*;
import play.test.WithApplication;
import static play.test.Helpers.*;

public class UserTest extends WithApplication {

    @Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase()));
    }

    @Test
    public void testCanSaveAndFindUser() {
        new User("Abtin", "Sepanlou", "abtin.sepanlou@gmail.com").save();
        User user = User.find.query().where().eq("email", "abtin.sepanlou@gmail.com").findOne();
        assertEquals("Abtin, Sepanlou", user.getFirstLast());
        assertEquals("Sepanlou, Abtin", user.getLastFirst());
        assertEquals("abtin.sepanlou@gmail.com", user.getEmail());
    }
}
