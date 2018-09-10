import java.util.*;
public class CSort implements Comparable<CSort> {
	int id;
	String name;
	Double gpa;
	
	CSort(int id,String name,Double gpa){
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public String toString() {
		return id+" "+name+" "+gpa;
	}

	@Override
	public int compareTo(CSort arg0) {
		return 0;
	}
	
	public static Comparator<CSort> nameComp = new Comparator<CSort>() {
		public int compare(CSort p1,CSort p2) {
			return p1.name.compareTo(p2.name);	
		}
	};
	
	public static Comparator<CSort> idComp = new Comparator<CSort>() {
		public int compare(CSort p1,CSort p2) {
			return p1.id-p2.id;
		}
	};
	
	public static Comparator<CSort> gpaComp = new Comparator<CSort>() {
		public int compare(CSort p1,CSort p2) {
			if(p1.gpa-p2.gpa<0) 
				return -1;
			if(p1.gpa-p2.gpa>0) 
				return 1;
			return 0;
			
		}
	};
	

}
