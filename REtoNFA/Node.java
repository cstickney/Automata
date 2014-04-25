package reToNfa;

public class Node{
	private int[] aOut, bOut, cOut, dOut, eOut, EOut;//destinations array
	private int aDegree = 0, bDegree=0, cDegree=0, dDegree=0, eDegree=0, EDegree=0;//degrees
	
	public Node(int states){
		this.aOut = new int[states];
		this.bOut = new int[states];
		this.cOut = new int[states];
		this.dOut = new int[states];
		this.eOut = new int[states];
		this.EOut = new int[states];
		
	}
	public void newa(int state){
		int x=0;
		boolean present = false;
		while(x<this.aDegree){
			if(this.aOut[x] == state)
				present = true;
			++x;
		}
		if(present == false){
			this.aOut[this.aDegree] = state;
			++this.aDegree;
		}
	}
	public void newb(int state){//todo
		int x=0;
		boolean present = false;
		while(x<this.bDegree){
			if(this.bOut[x] == state)
				present = true;
			++x;
		}
		if(present == false){
			this.bOut[this.bDegree] = state;
			++this.bDegree;
		}
	}
	public void newc(int state){//todo
		int x=0;
		boolean present = false;
		while(x<this.cDegree){
			if(this.cOut[x] == state)
				present = true;
			++x;
		}
		if(present == false){
			this.cOut[this.cDegree] = state;
			++this.cDegree;
		}
	}
	public void newd(int state){//todo
		int x=0;
		boolean present = false;
		while(x<this.dDegree){
			if(this.dOut[x] == state)
				present = true;
			++x;
		}
		if(present == false){
			this.dOut[this.dDegree] = state;
			++this.dDegree;
		}
	}
	public void newe(int state){//todo
		int x=0;
		boolean present = false;
		while(x<this.eDegree){
			if(this.eOut[x] == state)
				present = true;
			++x;
		}
		if(present == false){
			this.eOut[this.eDegree] = state;
			++this.eDegree;
		}
	}
	public void newE(int state){//todo
		int x=0;
		boolean present = false;
		while(x<this.EDegree){
			if(this.EOut[x] == state)
				present = true;
			++x;
		}
		if(present == false){
			this.EOut[this.EDegree] = state;
			++this.EDegree;
		}
	}
	public int[] getaOut() {
		return aOut;
	}
	public int[] getbOut() {
		return bOut;
	}
	public int[] getcOut() {
		return cOut;
	}
	public int[] getdOut() {
		return dOut;
	}
	public int[] geteOut() {
		return eOut;
	}
	public int[] getEOut() {
		return EOut;
	}
	public int getaDegree() {
		return aDegree;
	}
	public int getbDegree() {
		return bDegree;
	}
	public int getcDegree() {
		return cDegree;
	}
	public int getdDegree() {
		return dDegree;
	}
	public int geteDegree() {
		return eDegree;
	}
	public int getEDegree() {
		return EDegree;
	}
}