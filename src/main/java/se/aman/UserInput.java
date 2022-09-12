package se.aman;

public class UserInput implements TextInput,NumericInput{


    private String currEntValue;


    public String getCurrEntValue() {
        return currEntValue;
    }

    @Override
    public void add(char c) {

    }

    @Override
    public String getValue() {
        return currEntValue;
    }

    public static class TextInput {}

    public static class NumericInput {}

}
