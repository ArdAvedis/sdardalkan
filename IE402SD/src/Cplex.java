import Data.DataProcessor;
import ilog.concert.*;
import ilog.cplex.*;

public class Cplex {
	private DataProcessor dataProcessor;
	private IloCplex cplex;
	
	public Cplex(DataProcessor dataProcessor) {
		this.dataProcessor = dataProcessor;
	}
	
	private void initiateCplex() {
		try {
			cplex = new IloCplex();
		}catch(IloException e) {
			e.printStackTrace();
		}
	}
	
	private void setVariables() {
		//TO-DO
	}
	
	private void setExpressions() {
		//TO-DO
	}
	
	private void setConstraints() {
		//TO-DO
	}
	
	private void setObjective() {
		//TO-DO
	}
	
	private void solveProblem() {
		
	}
}
