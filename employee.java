public class employee {
    private int employeeCode;
	private String name;
	
	public void Employee(int employeeCode, String name) {
		this.employeeCode = employeeCode;
		this.name = name;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
