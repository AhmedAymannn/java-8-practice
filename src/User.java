public class User {
    String username ;
    int securityLevel ;
    boolean isSystemActive ;

    public User(String username, int securityLevel, boolean isSystemActive) {
        this.username = username;
        this.securityLevel = securityLevel;
        this.isSystemActive = isSystemActive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public boolean isSystemActive() {
        return isSystemActive;
    }

    public void setSystemActive(boolean systemActive) {
        isSystemActive = systemActive;
    }

}
