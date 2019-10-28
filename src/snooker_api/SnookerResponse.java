package snooker_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SnookerResponse {
	
	String extension;
	
	String adress = "http://api.snooker.org/";
	
	BufferedReader anwser;
	
	public SnookerResponse(String extension) {
		this.extension = extension;
		getAnwser(this.adress+this.extension);
	}


	private void getAnwser(String address) {
		URL url;
		try {
			url = new URL(address);
			URLConnection connection = url.openConnection();
			anwser = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		
	}

	public static void main(String[] args) {
		try {
			System.out.println(new SnookerResponse("?e=555").anwser.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
