package Week4.Roles;

public class Degree extends Qualification {

	private int level;

public Degree(String n,int l)
{
super(n);
level = l;
}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
