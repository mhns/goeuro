import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.LinkedList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;




public class RESTConnector {
	
	final String endpoint = "http://api.goeuro.com/api/v2/position/suggest/en/";
	
	
	private static String readAll(Reader rd) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    int cp;
		    while ((cp = rd.read()) != -1) {
		      sb.append((char) cp);
		    }
		    return sb.toString();
		  }

	public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException  {
		    InputStream is = new URL(url).openStream();
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		      String jsonText = readAll(rd);
		      System.out.println(jsonText);
		      
		      JSONArray json = new JSONArray(jsonText);
		      
		      return json;
		  }

	  
		public static void main(String[] args) throws IOException, JSONException {
		  JSONArray json = readJsonFromUrl("http://api.goeuro.com/api/v2/position/suggest/en/berlin");

		}

	


}
