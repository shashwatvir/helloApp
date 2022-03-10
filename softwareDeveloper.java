public class softwareDeveloper {
    private String programmingLanguage;

	public softwareDeveloper(int employeeCode, String name, String programmingLanguage) {
		super();
		this.programmingLanguage = programmingLanguage;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public String getDetails() {
		return this.getName() + " (" + this.getEmployeeCode() + "),"
				+ " Software Developer with Programming Language: " + this.programmingLanguage;
	}

    private String getEmployeeCode() {
        return null;
    }

    private String getName() {
        return null;
    }
    
}
