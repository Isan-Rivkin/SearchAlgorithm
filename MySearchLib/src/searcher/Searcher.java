package searcher;

import searchable.Searchable;
import searchable.Solution;

public interface Searcher<T>
{
	
	public Solution search(Searchable<T> s);
	public int getNumberOfNodesEvaluated();

}
