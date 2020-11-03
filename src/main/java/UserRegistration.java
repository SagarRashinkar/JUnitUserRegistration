public class UserRegistration {

    public boolean validateFName(String fname){
        return (fname.matches("^[A-Z][a-z]{2,}"));
    }

    public boolean validateLName(String lname){
        return (lname.matches("^[A-Z][a-z]{2,}"));
    }

    public boolean validateEmail(String email){
        return (email.matches("^[a-z][a-zA-Z0-9+_.-]+@[a-zA-Z0-9.]+(co|com|in|au)$"));
    }

    public boolean validateMobile(String mobile){
        return (mobile.matches("(0|91)?[7-9][0-9]{9}"));
    }

    public boolean validatePassword(String pass){
        return (pass.matches("^*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"));
    }
    public String moodAnalyse(String fname, String lname, String email, String mobile, String pass) {
        if (validateFName(fname) == true && validateLName(lname) == true && validateEmail(email) == true
                && validateMobile(mobile) == true && validatePassword(pass)) {
            return "HAPPY";
        } else {
            return "SAD";
        }

    }
}
