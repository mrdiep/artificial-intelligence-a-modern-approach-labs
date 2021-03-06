package lab4.nqueen;



import aima.core.agent.impl.DynamicAction;
import aima.core.util.datastructure.XYLocation;


public class QueenAction extends DynamicAction {
	public static final String MOVE_QUEEN = "moveQueenTo";

	public static final String ATTRIBUTE_QUEEN_LOC = "location";

	public QueenAction(String type, XYLocation loc) {
		super(type);
		setAttribute(ATTRIBUTE_QUEEN_LOC, loc);
	}

	public XYLocation getLocation() {
		return (XYLocation) getAttribute(ATTRIBUTE_QUEEN_LOC);
	}

	public int getX() {
		return getLocation().getXCoOrdinate();
	}

	public int getY() {
		return getLocation().getYCoOrdinate();
	}
}
