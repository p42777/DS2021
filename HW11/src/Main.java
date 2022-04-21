
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public class Main {




	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
	
		// 1
		//root node
//		WebPage rootPage = new WebPage("https://klrosie12.pixnet.net/blog/post/464370284-%25E7%25B2%25BE%25E9%2581%25B8%25E5%258F%25B0%25E5%258C%259725%25E9%2596%2593%25E5%25BF%2585%25E5%258E%25BB%25E7%25BE%258E%25E5%25A5%25BD%25E5%2592%2596%25E5%2595%25A1%25E5%25BB%25B3%25E3%2580%2581%25E6%2597%25A9%25E5%258D%2588%25E9%25A4%2590%25E3%2580%2581%25E4%25B8%258B%25E5%258D%2588&sa=U&ved=2ahUKEwjxtZqdiZ_1AhWiyosBHeRED-QQFnoECAMQAg&usg=AOvVaw0aSMbWjkEQuIIztZM6FikM", "精選台北25間必去美好咖啡廳、早午餐、下午茶網美餐廳、不限時");		
//		WebTree tree = new WebTree(rootPage);
//		//build childnode
//		tree.root.addChild(new WebNode(new WebPage("https://klrosie12.pixnet.net/blog/post/469412900","2020最夯台北特色文青咖啡廳")));
//		tree.root.addChild(new WebNode(new WebPage("https://klrosie12.pixnet.net/blog/post/488234078","台北森林系美食餐廳懶人包。早午餐、下午茶、咖啡廳")));
//		tree.root.addChild(new WebNode(new WebPage("https://klrosie12.pixnet.net/blog/post/547044991", "【台北網美餐廳】浪漫森林系韓風咖啡廳、下午茶、IG打卡餐廳")));
//		tree.root.addChild(new WebNode(new WebPage("https://klrosie12.pixnet.net/blog/post/469412900","【台北咖啡店】精選12家必去特色文青咖啡廳下午茶")));
//		
//		// 2
//		WebPage rootPage2 = new WebPage("https://klrosie12.pixnet.net/blog/post/469412900-%25E3%2580%2590%25E5%258F%25B0%25E5%258C%2597%25E7%2589%25B9%25E8%2589%25B2%25E5%2592%2596%25E5%2595%25A1%25E5%25BB%25B3%25E3%2580%2591%25E7%25B2%25BE%25E9%2581%25B815%25E5%25AE%25B6%25E5%2592%2596%25E5%2595%25A1%25E6%258E%25A7%25E5%25BF%2585%25E5%258E%25BB%25E5%2584%25AA%25E8%25B3%25AA&sa=U&ved=2ahUKEwjxtZqdiZ_1AhWiyosBHeRED-QQFnoECAkQAg&usg=AOvVaw0RRwvQVpdGuiOPTci7qEDz", "文青老屋咖啡廳、下午茶甜點- 台北");		
//		WebTree tree2 = new WebTree(rootPage2);
//		//build childnode
//		tree2.root.addChild(new WebNode(new WebPage("http://klrosie12.pixnet.net/blog/post/464370284","台北18間必去美好咖啡廳、早午餐、下午茶餐廳")));
//		tree2.root.addChild(new WebNode(new WebPage("http://klrosie12.pixnet.net/blog/post/466524299-(%E6%87%B6%E4%BA%BA%E5%8C%85)%E5%8F%B0%E5%8C%97%E6%97%A9%E5%8D%88%E9%A4%90/%E4%B8%8B%E5%8D%88%E8%8C%B6%E9%A4%90%E5%BB%B3%E3%80%82%E7%B2%BE%E9%81%B8%E4%B8%AD%E5%B1%B1%E7%AB%99%E3%80%81%E5%8C%97%E8%BB%8A%E3%80%81%E4%BA%AC%E7%AB%99%E3%80%81%E5%8F%B0%E5%8C%97%E6%9D%B1%E5%8D%80%E3%80%81%E5%BF%A0%E5%AD%9D%E6%95%A6%E5%8C%96%E3%80%81%E5%B8%82%E6%94%BF%E5%BA%9C%E7%AB%99%E3%80%81%E6%96%B0%E5%8C%97%E5%B8%82%E6%97%A9%E5%8D%88%E9%A4%90%E7%BE%8E%E9%A3%9F%E9%A4%90%E5%BB%B3","(懶人包)台北早午餐/下午茶餐廳。精選中山站、北車、京站、台北東區、忠孝敦化、市政府站、新北市早午餐美食餐廳")));
//		tree2.root.addChild(new WebNode(new WebPage("https://klrosie12.pixnet.net/blog/post/469412867", "精選2020台北必吃甜點蛋糕下午茶懶人包")));
//		tree2.root.addChild(new WebNode(new WebPage("https://klrosie12.pixnet.net/blog/post/464370284-%e7%b2%be%e9%81%b8%e5%8f%b0%e5%8c%9725%e9%96%93%e5%bf%85%e5%8e%bb%e7%be%8e%e5%a5%bd%e5%92%96%e5%95%a1%e5%bb%b3%e3%80%81%e6%97%a9%e5%8d%88%e9%a4%90%e3%80%81%e4%b8%8b%e5%8d%88","精選台北25間必去美好咖啡廳、早午餐、下午茶網美餐廳、不限時、不收服務費、有wifi、免費插座")));
//		
//		// 3
//		WebPage rootPage3 = new WebPage("https://ifoodie.tw/explore/%25E5%258F%25B0%25E5%258C%2597%25E5%25B8%2582/%25E6%2596%2587%25E5%25B1%25B1%25E5%258D%2580/list/%25E5%2592%2596%25E5%2595%25A1&sa=U&ved=2ahUKEwjxtZqdiZ_1AhWiyosBHeRED-QQFnoECAcQAg&usg=AOvVaw3pmCsO26W1rTi616TajxYG", "台北文山區『咖啡廳』| 精選TOP 15間熱門店家");		
//		WebTree tree3 = new WebTree(rootPage3);
//		
//		WebPage rootPage4 = new WebPage("https://drm88.pixnet.net/blog/post/35423494-%25E3%2580%2590%25E5%258F%25B0%25E5%258C%2597%25E5%2592%2596%25E5%2595%25A1%25E5%25BB%25B3%25E3%2580%2591%25E7%25B2%25BE%25E9%2581%25B8%25E5%258F%25B0%25E5%258C%259750%25E9%2596%2593%25E5%25BF%2585%25E5%258E%25BB%25E7%25B6%25B2%25E7%25BE%258Eig%25E5%2592%2596%25E5%2595%25A1&sa=U&ved=2ahUKEwjxtZqdiZ_1AhWiyosBHeRED-QQFnoECAgQAg&usg=AOvVaw2GAGnP8HLv2CRBqBNJQdP1", "【台北咖啡廳】精選台北50間必去網美IG咖啡廳，下午茶");		
//		WebTree tree4 = new WebTree(rootPage4);
		
		
		
		GoogleQuery q = new GoogleQuery();
		
		WebPage rootPage = new WebPage("https://drm88.pixnet.net/blog/post/35423494-%25E3%2580%2590%25E5%258F%25B0%25E5%258C%2597%25E5%2592%2596%25E5%2595%25A1%25E5%25BB%25B3%25E3%2580%2591%25E7%25B2%25BE%25E9%2581%25B8%25E5%258F%25B0%25E5%258C%259750%25E9%2596%2593%25E5%25BF%2585%25E5%258E%25BB%25E7%25B6%25B2%25E7%25BE%258Eig%25E5%2592%2596%25E5%2595%25A1&sa=U&ved=2ahUKEwjxtZqdiZ_1AhWiyosBHeRED-QQFnoECAgQAg&usg=AOvVaw2GAGnP8HLv2CRBqBNJQdP1","a");		
		WebTree tree = new WebTree(rootPage);

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
//			tree2.setPostOrderScore(keywords);
//			tree2.eularPrintTree();
//			tree3.setPostOrderScore(keywords);
//			tree3.eularPrintTree();
//			tree4.setPostOrderScore(keywords);
//			tree4.eularPrintTree();

		}
		scanner.close();
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

//static {
//	HttpsURLConnection.setDefaultHostnameVerifier((hostname,session) -> hostname.equals("127.0.0.1"));
//}	


/*
 * 
Input:
2
Fang 0.5
Yu 0.6

Output:

(Fang Yu,131.10000000000002
	(Publication,110.5)
	(Project,12.1
		(Stranger,0.0)
	)
	(Biography,2.8
		(Vlab,0.0)
	)
	(Course,2.3)
)

*/
