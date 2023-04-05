package Programa;

public class Cliente {

	private static int counter = 1;

	private String name;
	private String cpf;
	private String email;
	
	
	
	// CONSTRUTOR
	
	public Cliente(String name, String cpf, String email) {
		this.name = name;
		this.cpf =cpf;
		this.email = email;
		counter += 1;
	}
	
	
	// métodos
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return 		"\nName=" + this.getName()
				+ " \nCPF=" + this.getCPF()
				+ " \nEmail=" + this.getEmail();
	}
	
	
	
}
