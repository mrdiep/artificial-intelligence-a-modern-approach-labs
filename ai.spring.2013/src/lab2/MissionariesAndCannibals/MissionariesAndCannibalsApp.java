package lab2.MissionariesAndCannibals;

import java.util.List;

import aima.core.agent.Action;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.framework.TreeSearch;
import aima.core.search.framework.GraphSearch;
import aima.core.search.uninformed.BidirectionalSearch;
import aima.core.search.uninformed.BreadthFirstSearch;
import aima.core.search.uninformed.DepthFirstSearch;
import aima.core.search.uninformed.DepthLimitedSearch;
import aima.core.search.uninformed.IterativeDeepeningSearch;
import aima.core.search.uninformed.UniformCostSearch;

public class MissionariesAndCannibalsApp {
	public static void main(String args[]) {
		try {
			int init[] = { 3,3,0,0 };
			int goal[] = { 0,0,3,3 };
			GameState intialState = new GameState(0,init);
			GoalEvaluator goalState = new GoalEvaluator(goal);
			ActionFactory actionLister = new ActionFactory();
			ResultFactory resultLister = new ResultFactory();

			Problem problem = new Problem(intialState, actionLister, resultLister, goalState);

//			Search search = new BreadthFirstSearch(new GraphSearch());
			//Search search = new BreadthFirstSearch(new TreeSearch());
			 Search search = new UniformCostSearch();
			//Search search = new DepthFirstSearch(new GraphSearch());
			// Search search = new DepthLimitedSearch(8);
			// Search search = new IterativeDeepeningSearch();

			SearchAgent agent = new SearchAgent(problem, search);
			List<Action> actions = agent.getActions();
			
			System.out.println("List of Actions should be performed to reach the goal state:");
			
			
			for (Action a : actions) {
				System.out.println(a.toString());
				VisualDemo.setStatus(a.toString());				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
