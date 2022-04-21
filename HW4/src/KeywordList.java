import java.util.*;
public class KeywordList {
	private LinkedList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new LinkedList<Keyword>();	
	}
	
	public void add(Keyword keyword){
		for(int i = 0 ; i < lst.size() ; i++){
			Keyword k = lst.get(i);	
			if(keyword.count <= k.count){				
				if(keyword.count < k.count) {
					lst.add(i,keyword);
					return;
				}
				else if(keyword.count == k.count && keyword.weight <= k.weight) {
					lst.add(i,keyword);
					return;
				}	
			}	
		}
		lst.add(keyword);
	
	}
	
	public void outputIndex(int i){
		if(i > lst.size()){
		    System.out.println("InvalidOperation");
		    return;
		}
		
		Keyword k = lst.get(i);	
		System.out.println(k);
	
	}
		
	public void outputCount(int c){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i = 0 ; i < lst.size() ; i++){
		    Keyword k = lst.get(i);
		    if(k.count == c){
		    	results.add(k);
		    }
		}
		
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}
		else{
		    printKeywordList(results);
		}
		
	}
	
	public void outputHas(String pattern){
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i = 0 ; i < lst.size() ; i++){
		    Keyword k = lst.get(i);
		    if(k.name.contains(pattern)){
		    	results.add(k);
		    }
		}
		
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}
		else{
		    printKeywordList(results);
		}
		
	}
	
	public void outputName(String pattern){
		
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i = 0 ; i < lst.size() ; i++){
		    Keyword k = lst.get(i);
		    if(k.name.equals(pattern)){
		    	results.add(k);
		    }
		}
		
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}
		else{
		    printKeywordList(results);
		}
		
	}
	
	public void outputFirstN(int n){
		if(n > lst.size()){
		    System.out.println("InvalidOperation");
		    return;
		}
		
		LinkedList<Keyword> found= new LinkedList<>();
		
		for(int i = 0 ; i < n ; i++){
			Keyword k =lst.get(i);
			found.add(k);
		}
		
		printKeywordList(found);
		
	}
	
	public void outputScore(){
		float results = 0;
		for(int i = 0 ; i < lst.size() ; i++){
		    Keyword k = lst.get(i);
		    results = results + k.getCount() * k.getWeight();
		}
		
		System.out.println(results);
		
	}
	
	public void deleteIndex(int i){
		
		if(i >= lst.size()){
		    return;
		}
			
		lst.remove(i);	
	}

	public void deleteCount(int c){
		LinkedList<Keyword> found = new LinkedList<>();
		 for (int i = 0; i < lst.size(); i++) {
			 Keyword k = lst.get(i);
			 if (c == k.getCount()) {
				 found.add(k);
			 }
		  }
		  
		 if (!found.isEmpty()) lst.removeAll(found);
		 
	}

	public void deleteHas(String pattern){
		LinkedList<Keyword> found = new LinkedList<>();
		for(int j = 0 ; j < lst.size() ; j++) {
		   Keyword k = lst.get(j);
		   if(k.getName().contains(pattern)) {
		    found.add(k);
		   }
		  
		}
		 
		if (!found.isEmpty()) lst.removeAll(found);
				 
	}
	
	public void deleteName(String name){
		LinkedList<Keyword> found = new LinkedList<>();
		for(int l = 0 ; l<lst.size() ; l++) {
		   Keyword k = lst.get(l);
		   if(k.getName().equals(name)) {
		    found.add(k);
		   }
		  
		}
		if (!found.isEmpty()) lst.removeAll(found);
		
		
	}
	
	public void deleteFirstN(int n){
		if(n > lst.size()) System.out.println("InvalidOperation");
		
		LinkedList<Keyword> found = new LinkedList<>();
		for (int m = 0 ; m < lst.size() ; m++) {
			Keyword k = lst.get(m);
			   found.add(k);
		}
		
		if (!found.isEmpty()) lst.removeAll(found);

	}
	
	public void deleteAll(){
		lst = new LinkedList<Keyword>();
	}
		
	private void printKeywordList(LinkedList<Keyword> kLst){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < kLst.size() ; i++){
			Keyword k = kLst.get(i);
			if(i > 0) sb.append(" ");
			sb.append(k.toString());
			
		}
		System.out.println(sb.toString());
		
	}
	

}


