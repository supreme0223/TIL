package student.entity;

public class StudentDTO {
	private int no;
	private String name;
	private String det;
	private String addr;
	private String tel;
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(int no) {
		super();
		setNo(no);
	}
	
	public StudentDTO(int no, String name, String det, String addr, String tel) {
		this(no);
		setName(name);
		setDet(det);
		setAddr(addr);
		setTel(tel);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		if (no > 0) {
			this.no = no;
		}
		else {
			System.out.println("Student ID must be greater than 0 as well as cannot be null.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
		else if (name == null) {
			name = "";
		}
	}

	public String getDet() {
		return det;
	}

	public void setDet(String det) {
		if (det != null) {	
			this.det = det;
		}
		else if (det == null) {
			det = "";
		}
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		if (addr != null) {
			this.addr = addr;
		}
		else if (addr == null) {
			addr = "";
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel != null) {
			this.tel = tel;
		}
		else if (tel == null) {
			tel = "";
		}
	}

	@Override
	public String toString() {
		return no + " " + name + det + addr + tel;
	}
	
	
}



