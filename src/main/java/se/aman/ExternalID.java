package se.aman;

import java.util.Objects;

public class ExternalID {


    private String id;
    private String system;

    public ExternalID(String id, String system) {
        this.id = id;
        this.system = system;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExternalID)) return false;
        ExternalID that = (ExternalID) o;
        return getId() == that.getId() && Objects.equals(getSystem(), that.getSystem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSystem());
    }

    @Override
    public String toString() {
        return "ExternalID{" +
                "id=" + id +
                ", system='" + system + '\'' +
                '}';
    }
}
