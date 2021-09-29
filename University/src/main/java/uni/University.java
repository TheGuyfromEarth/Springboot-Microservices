package uni;

public class University {
	
	private String uniId;
	private String name;
	private String uniType;
	private Department dept;

	public University(String uniId, String name, String uniType, Department dept) {
		this.uniId = uniId;
		this.name = name;
		this.uniType = uniType;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getUniType() {
		return uniType;
	}
	public void setUniType(String uniType) {
		this.uniType = uniType;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getUniId() {
		return uniId;
	}

	public void setUniId(String uniId) {
		this.uniId = uniId;
	}
	
	

}
