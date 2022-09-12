package se.aman;

import java.util.Objects;

public class AddMessage {

    private int flowInstanceID;
    private String externalID;
    private String externalIDSystem;
    private String messageAdded;


    public AddMessage(int flowInstanceID, String externalID, String externalIDSystem, String messageAdded) {
        this.flowInstanceID = flowInstanceID;
        this.externalID = externalID;
        this.externalIDSystem = externalIDSystem;
        this.messageAdded = messageAdded;
    }

    public int getFlowInstanceID() {
        return flowInstanceID;
    }

    public void setFlowInstanceID(int flowInstanceID) {
        this.flowInstanceID = flowInstanceID;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public String getExternalIDSystem() {
        return externalIDSystem;
    }

    public void setExternalIDSystem(String externalIDSystem) {
        this.externalIDSystem = externalIDSystem;
    }

    public String getMessageAdded() {
        return messageAdded;
    }

    public void setMessageAdded(String messageAdded) {
        this.messageAdded = messageAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddMessage)) return false;
        AddMessage that = (AddMessage) o;
        return getFlowInstanceID() == that.getFlowInstanceID() && Objects.equals(getExternalID(), that.getExternalID()) && Objects.equals(getExternalIDSystem(), that.getExternalIDSystem()) && Objects.equals(getMessageAdded(), that.getMessageAdded());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlowInstanceID(), getExternalID(), getExternalIDSystem(), getMessageAdded());
    }

    @Override
    public String toString() {
        return "AddMessage{" +
                "flowInstanceID=" + flowInstanceID +
                ", externalID='" + externalID + '\'' +
                ", externalIDSystem='" + externalIDSystem + '\'' +
                ", messageAdded='" + messageAdded + '\'' +
                '}';
    }

}
