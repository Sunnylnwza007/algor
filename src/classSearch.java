import java.util.Comparator;

public class classSearch implements Comparable<classSearch>{
	int num;
	String  name;
	
	public classSearch(int num,String name){
		this.num=num;
		this.name=name;
	}
	


	public static Comparator<classSearch> nameComp = new Comparator<classSearch>() {
		public int compare(classSearch p1,classSearch p2) {
			return p1.name.compareTo(p2.name);	
		}
	};
	
	public static Comparator<classSearch> numComp = new Comparator<classSearch>() {
		public int compare(classSearch p1,classSearch p2) {
			return p1.num-p2.num;
		}
	};

	@Override
	public int compareTo(classSearch o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
