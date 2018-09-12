package org.Gaurav.qlik.Service;

import java.util.*;
import java.io.*;

import org.Gaurav.qlik.Model.Message;
import org.Gaurav.qlik.Model.User;

public class MessageService {
	
   
private Map<Long,Message> users=DataService.getMessages();
   
   public MessageService() {
	   
   }

   public List<Message> getmessage() {
	   return new ArrayList<Message>(users.values());
   }
   public Message addMessage(Message message) {
	   message.setId(users.size()+1);
	   message.setDateCreated(new Date());
	   users.put(message.getId(),message);
	return message;
	   
   }
   
   public Message toCheckPalindrome(long messageId) {
	   String str=users.get(messageId).getMessage();
	   Message message=users.get(messageId);
	   char[] chararray=str.toCharArray();
	   char[] revStr=new char[chararray.length];
	   for(int i=chararray.length-1,j=0;i>=0;i--) {
		   revStr[j]=chararray[i];
		   j++;
	   }
	   String strRev=revStr.toString().valueOf(revStr);
	   if(str.compareToIgnoreCase(strRev)==0) {
		    message.setPalindrome(true);
		    return message;
	   }
		   else 
			   message.setPalindrome(false);
	    return message;
	

	   
   }
   public Message deleteMessage(long messageId) {
	   return users.remove(messageId);
   }
}
