import Data.DataProcessor;
import ilog.concert.*;
import ilog.cplex.*;

public class Cplex {
	private DataProcessor dataProcessor;
	private IloCplex cplex;
	
	private int numberOfOrders, numberOfNodes,
		numberOfRoutes, numberOfTrucks,truckSize;
	
	private double[] costOfRoute;
	
	private int[][] orderToCustomer, routeGiven;
	
	private IloIntVar[][] x, y, z;
	
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
		x = new IloIntVar[numberOfOrders][];
		y = new IloIntVar[numberOfNodes][];
		z = new IloIntVar[numberOfRoutes][];
		
		try {	
			for(int i = 0; i<numberOfOrders; i++) {
				x[i] = cplex.intVarArray(numberOfTrucks, 0, 1);
			}
			for(int i = 0; i<numberOfNodes; i++) {
				y[i] = cplex.intVarArray(numberOfTrucks, 0, 1);
			}
			for(int i = 0; i<numberOfRoutes; i++) {
				z[i] = cplex.intVarArray(numberOfTrucks, 0, 1);
			}
		}catch (IloException e) {
			e.printStackTrace();
		}
		
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
