package searchable;

import java.io.Serializable;
import java.util.LinkedList;

public class Solution implements Serializable {
	
	private LinkedList<Action> theSolution;
	
	public Solution(){}
	public Solution(LinkedList<Action> theSolution) {
		this.theSolution = theSolution;
	}

	public LinkedList<Action> getTheSolution() {
		return theSolution;
	}

	public void setTheSolution(LinkedList<Action> theSolution) {
		this.theSolution = theSolution;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		
		for(Action a: theSolution)
		{
			sb.append(a.getAction()).append("\n");
		}
		
		return sb.toString();
		
	}
	
	
}
