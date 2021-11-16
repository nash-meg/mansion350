public class Registration {
    private String user;
    private String pass;

    //Constructor and assigned input to variables
    public Registration(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    //Getters and setters
    /*********** USERNAME ***********/
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    /*********** PASSWORD ***********/
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
}


