public class UserRegistration {
    public boolean validateFName(String fname){
        return (fname.matches("^[A-Z][a-z]{2,}"));
    }
}
