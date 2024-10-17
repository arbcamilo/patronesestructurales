package Domain.model;

public class User {
    private boolean registered;
    private boolean admin;

    public User(boolean registered, boolean admin) {
        this.registered = registered;
        this.admin = admin;
    }

    public boolean isRegistered() {
        return registered;
    }

    public boolean isAdmin() {
        return admin;
    }
}
