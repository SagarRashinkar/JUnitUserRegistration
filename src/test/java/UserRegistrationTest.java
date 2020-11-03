import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //Test case for valid first name
    @Test
    public void testFNameValid(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateFName("Sagar");
        Assert.assertTrue(isValid);
    }
    //Test case for Invalid first name
    @Test
    public void testFNameWithInValidData(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateFName("sa");
        Assert.assertTrue(isValid);
    }
}
