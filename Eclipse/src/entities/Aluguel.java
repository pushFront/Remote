package entities;

public class Aluguel {
	private Integer id;
	private String name;
	private String email;
	
	public Aluguel(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
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

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Aluguel [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
