import javax.faces.bean.ManagedBean;

@ManagedBean
public class Vendor {
	
	private int id;
	private String name, address,payMethod; // create payment method object
	private long contactNum;
	private String group; // create a group object
	//private My_Date DocDate = new My_Date();
	
	public void setVendorId(int vendId) {
		this.id = vendId;
	}
	public int getVendorId() {
		return id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	/*public My_Date getDocDate() {
		return DocDate;
	}
	public void setDocDate(My_Date docDate) {
		DocDate = docDate;
	}*/
	
	
	

}
