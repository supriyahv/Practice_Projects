package Basic;

public class pojo {
	private String firstname;
	private String lastname;
	private int orgid;
	private String status;

	
	public pojo() {
		
	}
	
	public pojo(String firstname,String lastname,int id,String status ) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.orgid=orgid;
		this.status=status;
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	public void setfirstname(String firstname) {
		this.firstname=firstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	
	public void setlastname(String lastname) {
		this.lastname=lastname;
	}
	
	public int getorgid() {
		return orgid;
	}
	
	public void setorgid(int orgid) {
		this.orgid=orgid;
	}

}
