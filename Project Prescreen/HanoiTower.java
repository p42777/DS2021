

public class HanoiTower {
	private MyStack<Integer> rodA;
	private MyStack<Integer> rodB;
	private MyStack<Integer> rodC;
	private int times;
	private int numOfDisks;
	
	public HanoiTower(int numOfDisks){
		this.numOfDisks = numOfDisks;
		this.times = 1;
		this.rodA = new MyStack<Integer>("rodA");
		this.rodB = new MyStack<Integer>("rodB");
		this.rodC = new MyStack<Integer>("rodC");
		for(int i = numOfDisks ; i > 0 ; i--) {
			rodA.push(i);
		}
		
	}
	public void start() {
		execute(this.numOfDisks, rodA, rodC, rodB);
	
	}
	private void execute(int n, MyStack<Integer> src, MyStack<Integer> dest, MyStack<Integer> spare) {
		if(n>0) {
			execute(n-1, src, spare, dest);
			System.out.println("step "+ times + " from " + src.getName() + " to " + dest.getName() );
			printHanoiTower();
			dest.push(src.pop());
			execute(n-1, spare, dest, src);
		}
		
	}
	

	public void move(MyStack<Integer> src, MyStack<Integer> dest) {
		if (src.size() == 0) {
			System.out.println("Move unsuccessfully");
			System.exit(0);
		}
		if (dest.size()>src.size()) {
			System.out.println("Move unsuccessfully");
			System.exit(0);
		}
		
		dest.push(src.pop());
	}

	public int getTimes() {
		int totaltimes = (int)Math.pow(2, this.numOfDisks)-1;
		return totaltimes;
	}
	public void printHanoiTower() {
		
		
		
		System.out.println("Current state:" + this.times);
		this.times++;
		rodA.printStack();
		rodB.printStack();
		rodC.printStack();
		
		System.out.println("-------------");
		}

	
	
	//----------------
	public MyStack<Integer> getRodA() {
		return rodA;
	}

	public void setRodA(MyStack<Integer> rodA) {
		this.rodA = rodA;
	}

	public MyStack<Integer> getRodB() {
		return rodB;
	}

	public void setRodB(MyStack<Integer> rodB) {
		this.rodB = rodB;
	}

	public MyStack<Integer> getRodC() {
		return rodC;
	}

	public void setRodC(MyStack<Integer> rodC) {
		this.rodC = rodC;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getNumOfDisks() {
		return numOfDisks;
	}

	public void setNumOfDisks(int numOfDisks) {
		this.numOfDisks = numOfDisks;
	}
}