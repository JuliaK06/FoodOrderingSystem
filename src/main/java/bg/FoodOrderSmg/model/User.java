package bg.FoodOrderSmg.model;

public class User {
    private long id;
    private String firstsname;
    private String lastsname;
    private String username;
    private String password;
    private boolean isAdmin;

    public User() {
    }

    public User(String firstsname, String lastsname, String username, String password, boolean isAdmin,long id) {
        this.firstsname = firstsname;
        this.lastsname = lastsname;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.id=id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstsname='" + firstsname + '\'' +
                ", lastsname='" + lastsname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstsname() {
        return firstsname;
    }

    public void setFirstsname(String firstsname) {
        this.firstsname = firstsname;
    }

    public String getLastsname() {
        return lastsname;
    }

    public void setLastsname(String lastsname) {
        this.lastsname = lastsname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
