package server;

import javax.xml.ws.Endpoint;

import ws.BanquService;

public class ServerJaxws {

	public static void main(String[] args) {
		String url = "http://localhost:8585/";
				Endpoint.publish(url, new BanquService());
System.out.println(url);
	}

}
