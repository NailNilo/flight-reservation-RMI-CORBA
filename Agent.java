import java.io.Serializable;
public class Agent implements Serializable {
    private String password;
    private boolean isAuthenticated;

    public Agent(String id, String password) {
        this.password = password;
        this.isAuthenticated = false;
    }

    public boolean authenticate(String password) {
        if (this.password.equals(password)) {
            this.isAuthenticated = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAuthenticated() {
        return this.isAuthenticated;
    }

    public String getId() {
        return null;
    }
}