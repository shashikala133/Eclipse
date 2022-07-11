package _pasted_code_;
class Alien extends Object{
	private String name;
	private String tech;
	private int exp;
	private String laptop;
	
	public Alien(String name,String tech,int exp,String laptop) {
		this.name=name;
		this.tech=tech;
		this.exp=exp;
		this.laptop=laptop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech=tech;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp=exp;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop=laptop;
	}
	public String toString() { //overriding
		return("my toString");
	}
}
public class first {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Alien obj=new Alien("navin","blockchain",4,"hp");
       //System.out.println(obj.getName());
       //System.out.println(obj.toString());
       System.out.println(obj);
	}

}
 