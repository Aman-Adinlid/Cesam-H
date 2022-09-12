package se.aman;


public class App {

    public static void main(String[] args) {
        AddMessage addMessage = new AddMessage(133, "T800", "Skynet", "2022-09-09T11:57:11.9283614+02:00");
        System.out.println(addMessage.getFlowInstanceID());
        System.out.println(addMessage.getExternalID());
        System.out.println(addMessage.getExternalIDSystem());
        System.out.println(addMessage.getMessageAdded());


        Attachments attachments = new Attachments("a2FuZWxidWxsZQ==", "bulle.txt", 11);
        System.out.println(attachments.getEncodedData());
        System.out.println(attachments.getFilename());
        System.out.println(attachments.getSize());

        Attachments attachments1 = new Attachments("YmFuYW4=", "frukt.txt", 12);
        System.out.println(attachments1.getEncodedData());
        System.out.println(attachments1.getFilename());
        System.out.println(attachments1.getSize());


        Message message = new Message("Detta är ett testmeddelande.", "TestUser001", false);
        System.out.println(message.getMessage());
        System.out.println(message.getUserId());
        System.out.println(message.isReadReceiptEnabled());


        Principal principal = new Principal("Dwight Shrute", "dwishu");
        System.out.println(principal.getName());
        System.out.println(principal.getUserId());

    }


}










