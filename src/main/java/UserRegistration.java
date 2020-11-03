public class UserRegistration {
    public boolean validateFName(String fname){
        return (fname.matches("^[A-Z][a-z]{2,}"));
    }
    public boolean validateLName(String lname){
        return (lname.matches("^[A-Z][a-z]{2,}"));
    }
}
