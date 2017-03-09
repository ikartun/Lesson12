package by.epam.tr.lesson12;

public class Journal {
	private String name;

	public Journal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected void printName() {
		System.out.println("A journal " + name);
	}
}
