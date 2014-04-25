package reToNfa;

public class Nfa{
	private int[] start, end;
	private int startNo = 0, endNo=0;
	private Node[] states;
	private static int stateNo;
	
	public Nfa(int states){
		Nfa.stateNo = states;
		this.states = new Node[states];
		this.start = new int[states];
		this.end = new int[states];
		int i=0;
		while(i<states){
			this.states[i] = new Node(states);
			++i;
		}
	}
	public void newStart(int state){
		this.start[this.startNo] = state;
		++this.startNo;
	}
	public void newEnd(int state){
		this.end[this.endNo] = state;
		++this.endNo;
	}
	public int[] getStart() {
		return start;
	}
	public int[] getEnd() {
		return end;
	}
	public int getEndNo() {
		return endNo;
	}
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	public void setEnd(int[] end) {
		this.end = end;
	}
	public int getStartNum() {
		return startNo;
	}
	public int getEndNum() {
		return endNo;
	}
	public Node[] getStates() {
		return states;
	}
	public void setStates(Node[] states) {
		this.states = states;
	}
	public static int getStateNo() {
		return stateNo;
	}
	public static void setStateNo(int stateNo) {
		Nfa.stateNo = stateNo;
	}
}
