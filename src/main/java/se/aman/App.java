package se.aman;


import java.time.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        AddMessage addMessage = new AddMessage("1337", new ExternalID("T800", "Skynet"));
        map.put("addMessage_flowInstanceID", addMessage.getFlowInstanceID());
        map.put("addMessage_externalID_ID", addMessage.getExternalID().getId());
        map.put("addMessage_externalID_System", addMessage.getExternalID().getSystem());


        Attachments attachments = new Attachments("a2FuZWxidWxsZQ==", "bulle.txt", 11);
        map.put("addMessage_message_attachments_encodedData", attachments.getEncodedData());
        map.put("addMessage_message_attachments_filename", attachments.getFilename());
        map.put("addMessage_message_attachments_size", String.valueOf(attachments.getSize()));

        Attachments attachments1 = new Attachments("YmFuYW4=", "frukt.txt", 12);
        map.put("addMessage_message_attachments_encodedData2", attachments1.getEncodedData());
        map.put("addMessage_message_attachments_filename2", attachments1.getFilename());
        map.put("addMessage_message_attachments_size2", String.valueOf(attachments1.getSize()));

        Message message = new Message("Detta är ett testmeddelande.", "TestUser001", false, LocalDateTime.of(2022, Month.SEPTEMBER, 9, 11, 57, 11, 9283614));
        map.put("addMessage_message_message", message.getMessage());
        map.put("addMessage_message_userID", message.getUserId());
        map.put("addMessage_message_readReceiptEnabled", String.valueOf(message.isReadReceiptEnabled()));
        map.put("addMessage_message_added", String.valueOf(message.getAdded()));

        Principal principal = new Principal("Dwight Shrute", "dwishu");
        map.put("addMessage_principal_name", principal.getName());
        map.put("addMessage_principal_userID", principal.getUserId());


        for (Map.Entry m : map.entrySet()) {
            System.out.println("key: " + m.getKey() + " = " + "Value: " + m.getValue());

        }
      /*  Set<String> keys = map1.keySet();
        for (String key : keys){
            System.out.println(key + " = " +map1.get(key));

       */
        //for (Map.Entry pairEntry : map1.entrySet()){
        //System.out.println(pairEntry.getKey() + "=" + pairEntry.getValue());

     /*   Stream<String> stream = map1.values().stream();
        stream.forEach((value) -> {
            System.out.println(value);
        });
      */

    }
}













