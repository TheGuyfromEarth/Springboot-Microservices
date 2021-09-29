package uni;

public class Department {
	
	private String deptId;
	private String deptName;
	private String uniId;
	
	public Department() {
		
	}
	
	public Department(String deptId, String deptName, String uniId) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.uniId = uniId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getUniId() {
		return uniId;
	}
	public void setUniId(String uniId) {
		this.uniId = uniId;
	}
	
	

}
