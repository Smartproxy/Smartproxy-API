import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class delete_whitelisted_ip {

	public static void main(String[] args) throws IOException {
		// Details retrieved from Authentication part.
		String userId = "";
		String token = "";
		int id = 0; // Received from Get Whitelisted IPs part.
		
		URL url = new URL("https://api.smartproxy.com/v1/users/"+userId+"/whitelisted-ips/"+id);
				
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		
		
		httpConn.setRequestProperty("User-Agent", "Mozilla/5.0");
		httpConn.setRequestProperty ("Authorization", "Token "+token);
		httpConn.setRequestMethod("DELETE");

		
		if (200 <= httpConn.getResponseCode() && httpConn.getResponseCode() <= 299) {
		    BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
			System.out.print(br.lines().collect(Collectors.joining()));
		} else {
		    BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getErrorStream()));
			System.out.print(br.lines().collect(Collectors.joining()));
		}
		
		httpConn.disconnect();
		
	}

}
