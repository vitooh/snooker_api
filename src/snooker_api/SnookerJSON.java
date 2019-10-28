package snooker_api;

import java.io.IOException;

public class SnookerJSON {
	
	String json;
	
	SnookerJSON(SnookerResponse resp) {
		StringBuilder jsonBuilder = new StringBuilder();
		
		try {
			String inputLine;
			while ((inputLine = resp.anwser.readLine())!=null) {	
				jsonBuilder.append(inputLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		json = jsonBuilder.toString();
	}
	
	public String toString() {
		return json;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 1000;i++ ) {
			System.out.println(new SnookerJSON(new SnookerResponse("?e="+i)));
		}
		

	}

}
