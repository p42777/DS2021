import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(new GoogleQuery("音樂祭").query());
//			GoogleQuery g =new GoogleQuery("NCCU");
//			g.query();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}