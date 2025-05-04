package mobel;

public class Bill {
    private int patientId;
    private double amount;
    

	public Bill(int patientId, double amount) {
		super();
		this.patientId = patientId;
		this.amount = amount;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    
}
