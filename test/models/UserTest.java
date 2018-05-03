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
        assertNotNull(user);
        assertEquals("abtin.sepanlou@gmail.com", user.getEmail());
    }

    @Test
    public void testUserGetFirstLast() {
        User user = new User("Abtin", "Sepanlou", "abtin.sepanlou@gmail.com");
        assertEquals("Abtin, Sepanlou", user.getFirstLast());
    }

    @Test
    public void testUserGetLastFirst() {
        User user = new User("Abtin", "Sepanlou", "abtin.sepanlou@gmail.com");
        assertEquals("Sepanlou, Abtin", user.getLastFirst());
    }
}
