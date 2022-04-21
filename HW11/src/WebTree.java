
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public class WebTree {
	public WebNode root;
	
	public static Result result;
	
	public WebTree(WebPage rootPage){
		this.root = new WebNode(rootPage);
	}
	
	public void setPostOrderScore(ArrayList<Keyword> keywords) throws IOException{
		setPostOrderScore(root, keywords);
	}
	
	private void setPostOrderScore(WebNode startNode, ArrayList<Keyword> keywords) throws IOException{
		//1. compute the score of children nodes postorder
		for(WebNode child : startNode.children){
			setPostOrderScore(child, keywords);
			
		}
		//**setNode score of startNode
			startNode.setNodeScore(keywords);
		}
	
	public void eularPrintTree(){
		eularPrintTree(root);
	}
	
	private void eularPrintTree(WebNode startNode){
		int nodeDepth = startNode.getDepth();
		
		if(nodeDepth > 1) System.out.print("\n" + repeat("\t", nodeDepth-1));
		
		//print "("
		System.out.print("(");
		//print "name","score"
		System.out.print(startNode.nodeScore+","+startNode.webPage.name);
		
		// add node score to Result class in order to sort the scores
		
		WebTree.result = new Result(startNode.webPage.name,startNode.nodeScore, GoogleQuery.citeUrl2); 
		
		
		
		//2.print child preorder
		for(WebNode child : startNode.children){
			eularPrintTree(child);
		}
		
		//print ")"
		System.out.print(")");
		
		/*for example
		(Soslab,459.0
				(Publication,286.2)
				(Projects,42.0
						(Stranger,0.0)
				)
				(MEMBER,12.0)
				(Course,5.3999999999999995)
		)
		*/
		if(startNode.isTheLastChild()) System.out.print("\n" + repeat("\t", nodeDepth-2));
		
	}
//	eularPrintTree{
//		print=> "(startNode.webPage.name , startNode.nodeScore"
//		
//		//preorder
//		for(WebNode child : startNode.children){
//			eularPrintTree(child);
//		}
	
//		print=> ")"
//		
//	}
	
	
//	do {
//		print=> "(startNode.webPage.name , startNode.nodeScore"
//	}
//	while(WebNode child : startNode.children) {
//		print=> "(startNode.webPage.name , startNode.nodeScore"
//		
//	}
//	print=> ")"

	
	
	private String repeat(String str,int repeat){
		String retVal  = "";
		for(int i=0;i<repeat;i++){
			retVal+=str;
		}
		return retVal;
	}
}
