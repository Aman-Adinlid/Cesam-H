package se.aman;

import java.util.Objects;

public class Principal {

    private String name;
    private String userId;

    public Principal(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal)) return false;
        Principal principal = (Principal) o;
        return Objects.equals(getName(), principal.getName()) && Objects.equals(getUserId(), principal.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getUserId());
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
