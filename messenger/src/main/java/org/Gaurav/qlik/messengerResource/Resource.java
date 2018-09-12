package org.Gaurav.qlik.messengerResource;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Gaurav.qlik.Model.Message;
import org.Gaurav.qlik.Model.User;
import org.Gaurav.qlik.Service.MessageService;

@Path("/messages")
public class Resource {

	MessageService messageservice=new MessageService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
        return messageservice.getmessage();
        		}
    
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message) {
    	return messageservice.addMessage(message);
    }
    
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message checkPalindrome(@PathParam("messageId") long messageId) {
    	return messageservice.toCheckPalindrome(messageId);
    }
    
    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message deleteMessage(@PathParam("messageId") long messageId) {
    	return messageservice.deleteMessage(messageId);
    }
    
}
