
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WordCounter {
	
	private String urlStr;
    private String content;
    
    public WordCounter(String urlStr){
    	this.urlStr = urlStr;
    }
    
    private String fetchContent() throws IOException{
		URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStreamReader reader = new InputStreamReader(conn.getInputStream(),"UTF8");
		BufferedReader br = new BufferedReader(reader);
		String retVal = "";
		String line = null;
		
		while ((line = br.readLine()) != null){
		    retVal = retVal + line + "\n";
		}
		
		return retVal;
    }
    
    public int countKeyword(String keyword) throws IOException{
		if (content == null){
		    content = fetchContent();
		}
		content = content.toUpperCase();
		keyword = keyword.toUpperCase();
		int retVal = 0; 
		
		String[] word = content.split(" ");
		    	for (String chr : word){
		    		if (chr.contains(keyword)){
	                   retVal++;    
	                 }
	          }
		return retVal;
    }
}