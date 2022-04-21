import java.util.*;

public class KeywordList {
	private ArrayList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new ArrayList<Keyword>();
    }
	
	public void add(Keyword keyword){
		lst.add(keyword);
    }
	
	
	public void sort(){
		
		if(lst.size() == 0){
			System.out.println("InvalidOperation");
		}
		else {
			quickSort(0, lst.size()-1);
		}

	}
	
	
	private void quickSort(int leftbound, int rightbound){
		
		if(leftbound >= rightbound) {
			return;
		}
		double pivot = lst.get(rightbound).count;
		int swapIndex = leftbound;
		for(int x = leftbound ; x < rightbound ; x++) {
			if(lst.get(x).count <= pivot) {
				swap(x, swapIndex);
				swapIndex++;
			}
		}
		swap(swapIndex,rightbound);
		quickSort(swapIndex + 1,rightbound);
		quickSort(leftbound,swapIndex - 1);
	}
	
	
	private void swap(int aIndex, int bIndex){
		
		Keyword temp = lst.get(aIndex);
		lst.set(aIndex, lst.get(bIndex));
		lst.set(bIndex, temp);
	}
	
	public void output(){
		
		//TODO: write output and remove all element logic here...
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < lst.size() ; i++){
			Keyword k = lst.get(i);
			if(i > 0) sb.append(" ");
			sb.append(k.toString());
		}
		
		System.out.println(sb.toString());	
	}
}