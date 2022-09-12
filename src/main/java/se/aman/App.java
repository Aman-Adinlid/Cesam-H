package se.aman;


import java.util.Stack;

public class App {

    public static void main(String[] args) {
        AddMessage addMessage = new AddMessage(137, "T800", "Skynet", "2022-09-09T11:57:11.9283614+02:00");
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

      /*  Stack stack = new Stack();
        Stack<String> stack1 = new Stack<>();
        System.out.println(stack.push(137));
        System.out.println(stack1.push("T800"));
        System.out.println(stack1.push("Skynet"));
        System.out.println(stack1.push("2022-09-09T11:57:11.9283614+02:00"));
        System.out.println(stack1.push("a2FuZWxidWxsZQ=="));
        System.out.println(stack1.push("bulle.txt"));
        System.out.println(stack.push(11));
        System.out.println(stack1.push("YmFuYW4="));
        System.out.println(stack1.push("frukt.txt"));
        System.out.println(stack.push(12));
        System.out.println(stack1.push("Detta är ett testmeddelande."));
        System.out.println(stack1.push("TestUser001"));
        System.out.println(stack1.empty());
        System.out.println(stack1.push("Dwight Shrute"));
        System.out.println(stack1.push("dwishu"));
        System.out.println(stack.push(137));
        System.out.println(stack1.push("T800"));

*/
    }
}













