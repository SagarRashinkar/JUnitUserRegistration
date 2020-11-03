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
    //test case for valid Last name
    @Test
    public void testLNameValid(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateLName("Rashinkar");
        Assert.assertTrue(isValid);
    }
    //test case for invalid last name
    @Test
    public void testLNameWithInValidData(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateLName("rashinkar");
        Assert.assertTrue(isValid);
    }
    //test case for valid email
    @Test
    public void testValidEmail(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateEmail("abc@gmail.com");
        Assert.assertTrue(isValid);
    }
    //test case for invalid email
    @Test
    public void testInvalidEmail(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateEmail(".abc@gmail.com");
        Assert.assertTrue(isValid);
    }
    //test case for valid mobile number
    @Test
    public void testValidMobile(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateMobile("919527721648");
        Assert.assertTrue(isValid);
    }
    //test case for Invalid mobile number
    @Test
    public void testInvalidMobile(){
        UserRegistration user = new UserRegistration();
        boolean isValid = user.validateMobile("64255278");
        Assert.assertTrue(isValid);
    }
}
