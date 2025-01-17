// This class is an extension of the NodeStmt object. It has an
// assignment node that is evaluated in the parse tree. This node
// containts the assignment which has the id and expression so
// effectively, it is the whole statement

public class NodeStmtSt extends NodeStmt {

	private NodeStmtAssn assn;

	// Constructor of the St node
	public NodeStmtSt(NodeStmtAssn assn) {
		this.assn=assn;
	}

	// Evaluates the assignment which will likely assign
	// a value from an expression
	public double eval(Environment env) throws EvalException { // Modified to accept double
		return assn.eval(env);
	}

	// Returns the assignment in a string literal
	public String code() { return assn.code(); }

}
