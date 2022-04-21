import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Scanner;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

public class GoogleQuery

{

	public String searchKeyword;

	public String url;

	public String content;
	
	//
	public static String citeUrl2;
	public String title2;
	
	public static KeywordList k;
//	public PriorityQueue<WebNode> heap;

	public GoogleQuery(String searchKeyword) throws UnsupportedEncodingException

	{
		k = new KeywordList();
		// 對中文字進行解碼 encode for chinese charcters
		String message = java.net.URLEncoder.encode(searchKeyword,"utf-8");
		this.searchKeyword = message;
		this.url = "http://www.google.com/search?q=" + this.searchKeyword + "&oe=utf8&num=50";

	}

	public GoogleQuery() {
		
	}
	
	private String fetchContent() throws IOException

	{
		String retVal = "";

		URL u = new URL(url);

		URLConnection conn = u.openConnection();

		conn.setRequestProperty("User-agent", "Chrome/7.0.517.44");

		InputStream in = conn.getInputStream();

		InputStreamReader inReader = new InputStreamReader(in, "utf-8");

		BufferedReader bufReader = new BufferedReader(inReader);
		String line = null;

		while ((line = bufReader.readLine()) != null) {
			retVal += line;

		}
		return retVal;
	}

	public HashMap<String, String> query() throws IOException,MalformedURLException,FileNotFoundException

	{

		if (content == null)

		{

			content = fetchContent();

		}

		HashMap<String, String> retVal = new HashMap<String, String>();

		Document doc = Jsoup.parse(content);
		//System.out.println(doc.text());
		Elements lis = doc.select("div");
		 //System.out.println(lis);
		lis = lis.select(".kCrYT");
		 //System.out.println(lis.size());

		for (Element li : lis) {
			try

			{
				  citeUrl2 = li.select("a").get(0).attr("href").substring(7);
				  title2 = li.select("a").get(0).select(".vvjwJb").text();
				if (title2.equals("")) {
					continue;
				}
				
				
				WebPage rootPage = new WebPage(citeUrl2,title2);		
				WebTree tree = new WebTree(rootPage);
				
				// fill in absolute path
				File file = new File("C:/Users/User/git/DS_FinalProject/Web/input.txt");
				Scanner scanner = new Scanner(file);
				
				
				//read 2 Yu 1.2 Fang 1.8 
				//Scanner scanner = new Scanner(System.in);
				
				while(scanner.hasNextLine()){
					int numOfKeywords = scanner.nextInt();//2
					ArrayList<Keyword> keywords = new ArrayList<Keyword>();
					
					for(int i =0;i<numOfKeywords;i++)
					{
						String s = scanner.next();//Yu
						
						// encoding for Chinese characters
						String name = new String(s.getBytes("GBK"),"UTF-8");
						
						double weight = scanner.nextDouble();//1.2
						Keyword k = new Keyword(name, weight);//store key
						keywords.add(k);
					}
				
					
			
					tree.setPostOrderScore(keywords);
					tree.eularPrintTree();	
					
					k.getList().add(WebTree.result);
					//System.out.println(k.getList().toString());

				}
				scanner.close();
				
				System.out.println(citeUrl2);
				System.out.println("-----------------------------");
				
				//retVal.put(title2, citeUrl2); // key, value

			} catch (IndexOutOfBoundsException e) {
//		e.printStackTrace();
			} 
//			catch (MalformedURLException e) {
//				e.printStackTrace();
//				continue;
//			}
			catch (FileNotFoundException e) {
//				e.printStackTrace();
//				continue;
			}
			catch (IOException e) {
				
			}
			
			
//			 citeUrl2 = li.select("a").get(0).attr("href");
//			 title2 = li.select("a").get(0).select(".vvjwJb").text();

		}
		k.sort();
		Collections.reverse(k.lst);
		k.output();
		for(Result result:k.lst) {
			retVal.put(result.name, result.url);

		}
		return retVal;
	}

	
	static {
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() 
		{
			public boolean verify(String hostname,SSLSession session) 
			{
				return true;
			}
		});
	}
}
	
	
