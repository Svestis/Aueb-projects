
public class Cleaning extends FixedExpense {
	public Cleaning(String code, String description, double costPerSquare) {
		super(code, description, costPerSquare );
	}
	
	@Override
	public double calculateCost(Expense exp) {
		return getCostPerSquare()*exp.getBuilding().getSquareMeters();
	}
	
	@Override
	public String toString() {
		return "Code : " + this.getCode() + "\n"
				+ "Description: " + this.getDescription() + "\n"
						+ "Cost Per Sqare (m^2): " + this.getCostPerSquare();
								
	}

}
