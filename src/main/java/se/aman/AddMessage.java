package se.aman;


import java.util.Objects;

public class AddMessage {

    private String flowInstanceID;
    private ExternalID externalID;


    public AddMessage(String flowInstanceID, ExternalID externalID) {
        this.flowInstanceID = flowInstanceID;
        this.externalID = externalID;
    }

    public String getFlowInstanceID() {
        return flowInstanceID;
    }

    public void setFlowInstanceID(String flowInstanceID) {
        this.flowInstanceID = flowInstanceID;
    }

    public ExternalID getExternalID() {
        return externalID;
    }

    public void setExternalID(ExternalID externalID) {
        this.externalID = externalID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddMessage)) return false;
        AddMessage that = (AddMessage) o;
        return Objects.equals(getFlowInstanceID(), that.getFlowInstanceID()) && Objects.equals(getExternalID(), that.getExternalID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlowInstanceID(), getExternalID());
    }

    @Override
    public String toString() {
        return "AddMessage{" +
                "flowInstanceID='" + flowInstanceID + '\'' +
                ", externalID=" + externalID +
                '}';
    }
}
