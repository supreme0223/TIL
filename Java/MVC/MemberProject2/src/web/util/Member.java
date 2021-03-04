package web.util;

public class Member {

	private String id, pw, name;


	public Member(String id, String pw, String name) {
		super();
		setId(id);
		setPw(pw);
		setName(name);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != null) {
			this.id = id;
		}else {
			System.out.println("ID cannot be null.");
		}
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		if (pw != null) {
			this.pw = pw;
		}else {
			System.out.println("Password cannot be null.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}else {
			System.out.println("Name cannot be null.");
		}
	}
	
	
}
