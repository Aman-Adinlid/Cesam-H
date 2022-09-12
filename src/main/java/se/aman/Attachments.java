package se.aman;

import java.util.Objects;

public class Attachments {

    private String encodedData;
    private String filename;
    private int size;

    public Attachments(String encodedData, String filename, int size) {
        this.encodedData = encodedData;
        this.filename = filename;
        this.size = size;
    }

    public String getEncodedData() {
        return encodedData;
    }

    public void setEncodedData(String encodedData) {
        this.encodedData = encodedData;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attachments)) return false;
        Attachments that = (Attachments) o;
        return getSize() == that.getSize() && Objects.equals(getEncodedData(), that.getEncodedData()) && Objects.equals(getFilename(), that.getFilename());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEncodedData(), getFilename(), getSize());
    }

    @Override
    public String toString() {
        return "Attachments{" +
                "encodedData='" + encodedData + '\'' +
                ", filename='" + filename + '\'' +
                ", size=" + size +
                '}';
    }
}
