/**
* CSC223 Assignment 1
* Chris Stickney
* JRE: JavaSE-1.7
* OS: Windows 7 x64
*/
package reToNfa;

import java.util.Scanner;

public class ReToNfa {
	public static void main(String[] args){
		Nfa nfa1, nfa2, nfa3;
		Node[] states;
		int length;
		int q = 0;//most recently created state
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a regular expression in postfix: ");
		String re = input.nextLine();
		
		length = re.length()-1;
		int count=0, i=0, end = re.length() -1;
		while(i <= end){
			if(re.charAt(i) == 'a' || re.charAt(i) == 'b' || re.charAt(i) == 'c' || re.charAt(i) == 'd' || re.charAt(i) == 'e' || re.charAt(i) == 'E'){
				++count;
				++i;
			}
			else{
				++i;
			}
		}
		count = count*2+2;
		nfa1 = new Nfa(count);
		nfa2 = new Nfa(count);
		nfa3 = new Nfa(count);
		states = new Node[count];
		
		int state = 0; //state: 0-3 corresponding to the number of active NFA's in the program
		int consecutive = 0;//number of consecutive letters. only allow <2
		int[] begin, finish;
		int startNo, endNo;
		int j, k;
		
		i=0;
		while(i<=length){
			switch(re.charAt(i)){
			case '0'://todo
				
				//0*=E
				//0&A=0
				//0+A=A
				
				switch(state){
				case 0:
					//figure out how to make an nfa with '0'
					break;
				case 1:
					//figure out how to make an nfa with '0'
					break;
				case 2:
					//figure out how to make an nfa with '0'
					break;
				case 3:
					System.out.println("cannot take more inputs without an operation. exiting.");
					System.exit(1);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case 'a':
				switch(state){
				case 0:
					nfa1.newStart(q);//q=0
					states = nfa1.getStates();//extract states				
					states[q].newa(q+1);//0->a->1
					q++;
					nfa1.newEnd(q);//q=1
					nfa1.setStates(states);//replace states
					++state;//nfa 1 is now present, state = 1
					++consecutive;
					break;
				case 1:
					++q;
					nfa2.newStart(q);//q=2
					states = nfa1.getStates();//extract states
					states[q].newa(q+1);//2->a->3
					++q;
					nfa2.newEnd(q);//q=3
					nfa2.setStates(states);//replace states
					++state;//nfa 2 is now present, state = 2
					++consecutive;
					break;
				case 2:
					if(consecutive >=2){
						System.out.println("cannot take more inputs without an operation. exiting.");
						System.exit(1);
					}
					else{
						++q;
						nfa3.newStart(q);//q=4
						states = nfa1.getStates();//extract states
						states[q].newa(q+1);//4->a->5
						++q;
						nfa3.newEnd(q);//q=4
						nfa3.setStates(states);//replace states
						++state;//nfa 3 is now present, state = 3
						++consecutive;
					}
					break;
				case 3:
					System.out.println("cannot take more inputs without an operation. exiting.");
					System.exit(1);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case 'b':
				switch(state){
				case 0:
					nfa1.newStart(q);//q=0
					states = nfa1.getStates();//extract states				
					states[q].newb(q+1);//0->a->1
					q++;
					nfa1.newEnd(q);//q=1
					nfa1.setStates(states);//replace states
					++state;//nfa 1 is now present, state = 1
					++consecutive;
					break;
				case 1:
					++q;
					nfa2.newStart(q);//q=2
					states = nfa1.getStates();//extract states
					states[q].newb(q+1);//2->a->3
					++q;
					nfa2.newEnd(q);//q=3
					nfa2.setStates(states);//replace states
					++state;//nfa 2 is now present, state = 2
					++consecutive;
					break;
				case 2:
					if(consecutive >=2){
						System.out.println("cannot take more inputs without an operation. exiting.");
						System.exit(1);
					}
					else{
						++q;
						nfa3.newStart(q);//q=4
						states = nfa1.getStates();//extract states
						states[q].newb(q+1);//4->a->5
						++q;
						nfa3.newEnd(q);//q=4
						nfa3.setStates(states);//replace states
						++state;//nfa 3 is now present, state = 3
						++consecutive;
					}
					break;
				case 3:
					System.out.println("cannot take more inputs without an operation. exiting.");
					System.exit(1);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case 'c':
				switch(state){
				case 0:
					nfa1.newStart(q);//q=0
					states = nfa1.getStates();//extract states				
					states[q].newc(q+1);//0->a->1
					q++;
					nfa1.newEnd(q);//q=1
					nfa1.setStates(states);//replace states
					++state;//nfa 1 is now present, state = 1
					++consecutive;
					break;
				case 1:
					++q;
					nfa2.newStart(q);//q=2
					states = nfa1.getStates();//extract states
					states[q].newc(q+1);//2->a->3
					++q;
					nfa2.newEnd(q);//q=3
					nfa2.setStates(states);//replace states
					++state;//nfa 2 is now present, state = 2
					++consecutive;
					break;
				case 2:
					if(consecutive >=2){
						System.out.println("cannot take more inputs without an operation. exiting.");
						System.exit(1);
					}
					else{
						++q;
						nfa3.newStart(q);//q=4
						states = nfa1.getStates();//extract states
						states[q].newc(q+1);//4->a->5
						++q;
						nfa3.newEnd(q);//q=4
						nfa3.setStates(states);//replace states
						++state;//nfa 3 is now present, state = 3
						++consecutive;
					}
					break;
				case 3:
					System.out.println("cannot take more inputs without an operation. exiting.");
					System.exit(1);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case 'd':
				switch(state){
				case 0:
					nfa1.newStart(q);//q=0
					states = nfa1.getStates();//extract states				
					states[q].newd(q+1);//0->a->1
					q++;
					nfa1.newEnd(q);//q=1
					nfa1.setStates(states);//replace states
					++state;//nfa 1 is now present, state = 1
					++consecutive;
					break;
				case 1:
					++q;
					nfa2.newStart(q);//q=2
					states = nfa1.getStates();//extract states
					states[q].newd(q+1);//2->a->3
					++q;
					nfa2.newEnd(q);//q=3
					nfa2.setStates(states);//replace states
					++state;//nfa 2 is now present, state = 2
					++consecutive;
					break;
				case 2:
					if(consecutive >=2){
						System.out.println("cannot take more inputs without an operation. exiting.");
						System.exit(1);
					}
					else{
						++q;
						nfa3.newStart(q);//q=4
						states = nfa1.getStates();//extract states
						states[q].newd(q+1);//4->a->5
						++q;
						nfa3.newEnd(q);//q=4
						nfa3.setStates(states);//replace states
						++state;//nfa 3 is now present, state = 3
						++consecutive;
					}
					break;
				case 3:
					System.out.println("cannot take more inputs without an operation. exiting.");
					System.exit(1);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case 'e':
				switch(state){
				case 0:
					nfa1.newStart(q);//q=0
					states = nfa1.getStates();//extract states				
					states[q].newe(q+1);//0->a->1
					q++;
					nfa1.newEnd(q);//q=1
					nfa1.setStates(states);//replace states
					++state;//nfa 1 is now present, state = 1
					++consecutive;
					break;
				case 1:
					++q;
					nfa2.newStart(q);//q=2
					states = nfa1.getStates();//extract states
					states[q].newe(q+1);//2->a->3
					++q;
					nfa2.newEnd(q);//q=3
					nfa2.setStates(states);//replace states
					++state;//nfa 2 is now present, state = 2
					++consecutive;
					break;
				case 2:
					if(consecutive >=2){
						System.out.println("cannot take more inputs without an operation. exiting.");
						System.exit(1);
					}
					else{
						++q;
						nfa3.newStart(q);//q=4
						states = nfa1.getStates();//extract states
						states[q].newe(q+1);//4->a->5
						++q;
						nfa3.newEnd(q);//q=4
						nfa3.setStates(states);//replace states
						++state;//nfa 3 is now present, state = 3
						++consecutive;
					}
					break;
				case 3:
					System.out.println("cannot take more inputs without an operation. exiting.");
					System.exit(1);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case 'E':
				switch(state){
				case 0:
					nfa1.newStart(q);//q=0
					states = nfa1.getStates();//extract states				
					states[q].newE(q+1);//0->a->1
					q++;
					nfa1.newEnd(q);//q=1
					nfa1.setStates(states);//replace states
					++state;//nfa 1 is now present, state = 1
					++consecutive;
					break;
				case 1:
					++q;
					nfa2.newStart(q);//q=2
					states = nfa1.getStates();//extract states
					states[q].newE(q+1);//2->a->3
					++q;
					nfa2.newEnd(q);//q=3
					nfa2.setStates(states);//replace states
					++state;//nfa 2 is now present, state = 2
					++consecutive;
					break;
				case 2:
					if(consecutive >=2){
						System.out.println("cannot take more inputs without an operation. exiting.");
						System.exit(1);
					}
					else{
						++q;
						nfa3.newStart(q);//q=4
						states = nfa1.getStates();//extract states
						states[q].newE(q+1);//4->a->5
						++q;
						nfa3.newEnd(q);//q=4
						nfa3.setStates(states);//replace states
						++state;//nfa 3 is now present, state = 3
						++consecutive;
					}
					break;
				case 3:
					System.out.println("cannot take more inputs without an operation. exiting.");
					System.exit(1);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case '+'://both starts and ends are valid
				switch(state){
				case 0:
					System.out.println("not enough arguments for union. exiting.");
					System.exit(1);
					break;
				case 1:
					System.out.println("not enough arguments for union. exiting.");
					System.exit(1);
					break;
				case 2:
					begin = nfa2.getStart();
					finish = nfa2.getEnd();
					startNo = nfa2.getStartNum();
					endNo = nfa2.getEndNum();
					j=0;
					while(j<startNo){//copies start states to combined 
						nfa1.newStart(begin[j]);
						++j;
					}
					j=0;
					while(j<endNo){//copies end states to combined
						nfa1.newEnd(finish[j]);
						++j;
					}
					states = nfa1.getStates();
					j=nfa2.getStart()[0];
					while(j<q){//copies nodes to combined
						states[j] = nfa2.getStates()[j];
						++j;
					}
					nfa1.setStates(states);
					consecutive = 0;
					--state;
					nfa2 = new Nfa(count);
					break;
				case 3:
					begin = nfa3.getStart();
					finish = nfa3.getEnd();
					startNo = nfa3.getStartNum();
					endNo = nfa3.getEndNum();
					j=0;
					while(j<startNo){//copies start states to combined 
						nfa2.newStart(begin[j]);
						++j;
					}
					j=0;
					while(j<endNo){//copies end states to combined
						nfa2.newEnd(finish[j]);
						++j;
					}
					states = nfa2.getStates();
					j=nfa3.getStart()[0];
					while(j<q){//copies nodes to combined
						states[j] = nfa3.getStates()[j];
						++j;
					}
					nfa2.setStates(states);
					consecutive = 0;
					--state;
					nfa3 = new Nfa(count);
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case '*'://E transition from each A end state to all A start states.
				switch(state){
				case 0:
					System.out.println("not enough arguments for kleene star. exiting.");
					System.exit(1);
					break;
				case 1:
					begin = nfa1.getStart();
					finish = nfa1.getEnd();
					startNo = nfa1.getStartNum();
					endNo = nfa1.getEndNum();
					j=0;
					states = nfa1.getStates();
					while(j<endNo){
						k=0;
						while(k<startNo){
							states[finish[j]].newE(begin[k]);
							++k;
						}
						++j;
					}
					j=0;
					while(j<startNo){
						nfa1.newEnd(begin[j]);
						++j;
					}
					nfa1.setStates(states);
					consecutive = 0;
					break;
				case 2:
					begin = nfa2.getStart();
					finish = nfa2.getEnd();
					startNo = nfa2.getStartNum();
					endNo = nfa2.getEndNum();
					j=0;
					states = nfa2.getStates();
					while(j<endNo){
						k=0;
						while(k<startNo){
							states[finish[j]].newE(begin[k]);
							++k;
						}
						++j;
					}
					j=0;
					while(j<startNo){
						nfa2.newEnd(begin[j]);
						++j;
					}
					nfa2.setStates(states);
					consecutive = 0;
					break;
				case 3:
					begin = nfa3.getStart();
					finish = nfa3.getEnd();
					startNo = nfa3.getStartNum();
					endNo = nfa3.getEndNum();
					j=0;
					states = nfa3.getStates();
					while(j<endNo){
						k=0;
						while(k<startNo){
							states[finish[j]].newE(begin[k]);
							++k;
						}
						++j;
					}
					j=0;
					while(j<startNo){
						nfa3.newEnd(begin[j]);
						++j;
					}
					nfa3.setStates(states);
					consecutive = 0;
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			case '&'://E transition from each A end state to all B end states
				switch(state){
				case 0:
					System.out.println("not enough arguments for concatenation. exiting.");
					System.exit(1);
					break;
				case 1:
					System.out.println("not enough arguments for concatenation. exiting.");
					System.exit(1);
					break;
				case 2:
					begin = nfa2.getStart();
					finish = nfa1.getEnd();
					startNo = nfa2.getStartNum();
					endNo = nfa1.getEndNum();
					j=0;
					states = nfa1.getStates();
					while(j<endNo){
						k=0;
						while(k<startNo){
							states[finish[j]].newE(begin[k]);
							++k;
						}
						++j;
					}
					nfa1.setEndNo(nfa2.getEndNo());
					nfa1.setEnd(nfa2.getEnd());
					nfa1.setStates(states);
					nfa2 = new Nfa(count);
					consecutive = 0;
					--state;
					break;
				case 3:
					//concat nfa 2 and 3
					begin = nfa3.getStart();
					finish = nfa2.getEnd();
					startNo = nfa3.getStartNum();
					endNo = nfa2.getEndNum();
					j=0;
					states = nfa2.getStates();
					while(j<endNo){
						k=0;
						while(k<startNo){
							states[finish[j]].newE(begin[k]);
							++k;
						}
						++j;
					}
					nfa2.setEndNo(nfa3.getEndNo());
					nfa2.setEnd(nfa3.getEnd());
					nfa2.setStates(states);
					nfa3 = new Nfa(count);
					consecutive = 0;
					--state;
					break;
				default:
					System.out.println("invalid state. exiting.");
					System.exit(1);
				}
				break;
			default:
				System.out.printf("\nInvalid character '%c'. Please recheck your regular expression and try again.", re.charAt(i));
				System.exit(1);
			}
			++i;
		}
		if(state!= 1){
			System.out.printf("\nMissing argument(s). Please recheck your regular expression and try again.");
			System.exit(1);
		}
		i=0;//state counter
		System.out.format("	a			b			c			d			e			E\n");
		while(i<=q){
			//print qi
			System.out.printf("q%d ", i);
			//print if start
			j=0;
			boolean start = false;
			while(j<nfa1.getStartNum()){
				if(nfa1.getStart()[j] == i)
					start = true;
				++j;
			}
			if(start == true)
				System.out.printf("S ");
			//print if end
			j=0;
			boolean accept = false;
			while(j<nfa1.getEndNum()){
				if(nfa1.getEnd()[j] == i)
					accept = true;
				++j;
			}
			if(accept == true)
				System.out.printf("F");
			System.out.printf("	");
			
			Node qn = nfa1.getStates()[i];
			//print a connections
			if(qn.getaDegree() == 0)
				System.out.printf("0			");
			else{
				System.out.printf("q%d", qn.getaOut()[0]);
				j=1;
				while(j<qn.getaDegree()){
					
					System.out.printf(",q%d", qn.getaOut()[j]);
					++j;
				}
				System.out.printf("			");					
			}
			//print b connections
			if(qn.getbDegree() == 0)
				System.out.printf("0			");
			else{
				System.out.printf("q%d", qn.getbOut()[0]);
				j=1;
				while(j<qn.getbDegree()){
					System.out.printf(",q%d", qn.getbOut()[j]);
					++j;
				}
				System.out.printf("			");					
			}
			//print c connections
			if(qn.getcDegree() == 0)
				System.out.printf("0			");
			else{
				System.out.printf("q%d", qn.getcOut()[0]);
				j=1;
				while(j<qn.getcDegree()){
					System.out.printf(",q%d", qn.getcOut()[j]);
					++j;
				}
				System.out.printf("			");					
			}
			//print d connections
			if(qn.getdDegree() == 0)
				System.out.printf("0			");
			else{
				System.out.printf("q%d", qn.getdOut()[0]);
				j=1;
				while(j<qn.getdDegree()){
					System.out.printf(",q%d", qn.getdOut()[j]);
					++j;
				}
				System.out.printf("			");					
			}
			//print e connections
			if(qn.geteDegree() == 0)
				System.out.printf("0			");
			else{
				System.out.printf("q%d", qn.geteOut()[0]);
				j=1;
				while(j<qn.geteDegree()){
					System.out.printf(",q%d", qn.geteOut()[j]);
					++j;
				}
				System.out.printf("			");					
			}
			//print E connections
			if(qn.getEDegree() == 0)
				System.out.printf("0			");
			else{
				System.out.printf("q%d", qn.getEOut()[0]);
				j=1;
				while(j<qn.getEDegree()){
					System.out.printf(",q%d", qn.getEOut()[j]);
					++j;
				}
			}
			System.out.printf("\n");	
			++i;
		}
	}
}