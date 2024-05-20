package in.balaji.entity;


public class Customer {
	private Integer cid;
	private String name;
	private String email;
	public Customer() {
		
	}
	public Customer(Integer cid, String name, String email) {
		
		this.cid = cid;
		this.name = name;
		this.email = email;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + "]";
	}
	
}
