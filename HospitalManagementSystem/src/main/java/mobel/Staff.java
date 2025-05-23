package mobel;

public class Staff {
    private int id;
    private String name;
    private String role;

    public Staff(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Staff(String name, String role) {
        this(0, name, role);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    
}