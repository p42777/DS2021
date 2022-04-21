
// startNode.webPage.name+","+startNode.nodeScore
public class Result {
	public String name;
	public double nodeScore;
	public String url;
	public Result(String name,double nodeScore,String url){
		this.name = name;
		this.nodeScore = nodeScore;
		this.url = url;
	}
	
	@Override
	public String toString(){
		return "["+nodeScore+","+name+","+url+"]" + "\n";
	}
}

