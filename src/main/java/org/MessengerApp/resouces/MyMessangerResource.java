package org.MessengerApp.resouces;

import java.sql.SQLException;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.MessengerApp.model.Message;
import org.MessengerApp.service.MessageService;

@Path("/mymessage")
public class MyMessangerResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON) // response type is XML for the
											// request made -> "/mymessage"
	public List<Message> getMessages() throws ClassNotFoundException, SQLException {

		MessageService messService = new MessageService();
		/*List<Message> listOfMess = messService.getAllMessage();
		for (Message message : listOfMess) {
			System.out.println("Message details " + message.getMessage_detail());
		}*/
		return messService.getAllMessage();
	}

	// to Map subsequent path for -> /mymessage

	/*
	 * @GET
	 * 
	 * @Path("/{messageId}")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String m1(@PathParam("messageId")
	 * String messageId){ return "GOT messageId praram : " + messageId;
	 * 
	 * }
	 */

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getParticularMessage(@PathParam("messageId") int id)
			throws NumberFormatException, ClassNotFoundException, SQLException {
		MessageService messService = new MessageService();
		return messService.getMessage(id);

	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addNewMessage(Message mess) throws ClassNotFoundException, SQLException {
		MessageService messServ = new MessageService();
		return messServ.addMessage(mess);
	}

	@PUT
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateExistingMessage(@PathParam("messageId") int id, Message messWithOutIdProp)
			throws ClassNotFoundException, SQLException {
		MessageService messServ = new MessageService();
		return messServ.updateMessage(id, messWithOutIdProp);
	}

	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteMyMessage(@PathParam("messageId") int id)
			throws NumberFormatException, ClassNotFoundException, SQLException {
		MessageService messService = new MessageService();
		return messService.removeMessage(id);

	}

}
