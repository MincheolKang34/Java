package app;

public class Account {
	private String ano;
	private String owner;
	private int balanace;

	public Account(String ano, String owner, int balanace) {
		this.ano = ano;
		this.owner = owner;
		this.setBalanace(balanace);
	}

	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}

	public int getBalanace() {
		return balanace;
	}

	public void setBalanace(int balanace) {
		this.balanace = balanace;
	}
}
