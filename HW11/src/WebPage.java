
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class WebPage {
	public String url;
	public String name;
	public WordCounter counter;
	public double score;
	
	public WebPage(String url,String name) throws UnsupportedEncodingException{
		this.url = url;
		//String name2 = new String(name.getBytes("GBK"),"UTF-8");
		this.name = name;
		this.counter = new WordCounter(url);	
	}
	
	public void setScore(ArrayList<Keyword> keywords) throws IOException{
		score = 0;
//		3.calculate score
		for(Keyword k : keywords){		
			score += k.weight*counter.countKeyword(k.name);	
		}
	}
	
}
