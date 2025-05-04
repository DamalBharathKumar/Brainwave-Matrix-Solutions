package mobel;

import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private int patientId;
    private int staffId;
    private LocalDateTime dateTime;

    public Appointment(int id, int patientId, int staffId, LocalDateTime dateTime) {
        this.id = id;
        this.patientId = patientId;
        this.staffId = staffId;
        this.dateTime = dateTime;
    }

    public Appointment(int patientId, int staffId, LocalDateTime dateTime) {
        this(0, patientId, staffId, dateTime);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

   
}
