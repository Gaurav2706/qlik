package org.Gaurav.qlik.Service;

import java.util.HashMap;
import java.util.Map;

import org.Gaurav.qlik.Model.Message;
import org.Gaurav.qlik.Model.User;

public class DataService {
	
	private static Map<Long,Message> messages=new HashMap<Long,Message>();
	//private static Map<Long,Message> messages=new HashMap<Long,Message>();
	
	public static Map<Long,Message> getMessages(){
		return messages;
		
	}

}
