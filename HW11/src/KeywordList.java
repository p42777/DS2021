import java.util.ArrayList;

public class KeywordList {
	protected ArrayList<Result> lst;
	
	public KeywordList(){
		this.lst = new ArrayList<Result>();
    }
	
	public ArrayList<Result> getList(){
		return this.lst;
	}
	public void add(Result result){
		lst.add(result);
//		System.out.println("Done");
    }
	
	//quick sort
	public void sort(){
		if(lst.size() == 0)
		{
			System.out.println("InvalidOperation");
		}
		else 
		{
			quickSort(0, lst.size()-1);
//			System.out.println("Done");
		}

	}
//	35214
//	34 33 i=0 j=0
//	54 j=1
//	24 i=1 j=2 32514
//	14 i=2 j=3 32154
//	(i=3) 32145
//	q0~2 q44
	
	
	private void quickSort(int leftbound, int rightbound){
	
		if (leftbound < rightbound) 
		{
			int i = (leftbound-1);
			
			for (int j = leftbound; j <= rightbound - 1; j++) 
			{
				if (lst.get(j).nodeScore < lst.get(rightbound).nodeScore) 
				{
					//System.out.println(j+" "+rightbound+" "+lst.get(j).nodeScore);
					i++;
					swap(i, j);
				}
			}
			swap((i+1), rightbound);

			quickSort(leftbound, i);
			quickSort(i + 2, rightbound);
		}


	}

	
	
	private void swap(int aIndex, int bIndex){
		Result temp = lst.get(aIndex);
		lst.set(aIndex, lst.get(bIndex));
		lst.set(bIndex, temp);
	}
	
	public void output(){
		//TODO: write output and remove all element logic here...
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<lst.size();i++){
			Result k = lst.get(i);
			if(i>0)sb.append(" ");
			sb.append(k.toString());
		}
		
		System.out.println(sb.toString());	
	}
	
}
