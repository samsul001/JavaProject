
public class StaticConcpets {
	
	public StaticConcpets(){
		staticInt++;
		normalInt++;
	}
	
	public static int staticInt= 0;
	public int normalInt =0;
	
	public static void main(String[] args) {
		StaticConcpets obj1 = new StaticConcpets();
		
		System.out.println(staticInt);
		System.out.println(obj1.normalInt);
		System.out.println(obj1.staticInt);
		
		StaticConcpets obj2 = new StaticConcpets();
		obj1.staticInt=10;
		obj1.normalInt=10;
		System.out.println(obj2.staticInt);
		System.out.println(obj2.normalInt);
		
	}
	
	

}
