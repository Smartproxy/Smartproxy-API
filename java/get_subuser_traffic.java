import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class get_subuser_traffic {

	public static void main(String[] args) throws IOException {
		// Details retrieved from Authentication part.
		String userId = "";
		String token = "";
		String username = ""; // Username of your subuser
		String type = ""; // Date range, available types: 24h, month, 7days, custom. If custom type is selected you must provide String from and String to parameters.
		// to and from format yyyy-mm-dd
		
		URL url = new URL("https://api.smartproxy.com/v1/users/"+userId+"/sub-users/"+username+"/traffic?type="+type);
		
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		
		httpConn.setRequestProperty("User-Agent", "Mozilla/5.0");
		httpConn.setRequestProperty ("Authorization", "Token "+token);
		httpConn.setRequestMethod("GET");
		
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
