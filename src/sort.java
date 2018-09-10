import java.util.*;
public class sort {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		String c1 = a.next();
		String c2 = a.next();
		ArrayList<CSort> x = new ArrayList<CSort>();
		
		for (int i =0;i<n;i++) {
			x.add(new CSort(a.nextInt(),a.next(),a.nextDouble()));
		}
		
		if (c1.equals("a")) {
			if (c2.equals("id")) {
				Collections.sort(x,CSort.idComp);
			}else if (c2.equals("name")) {
				Collections.sort(x,CSort.nameComp);
			}else if (c2.equals("gpa")) {
				Collections.sort(x,CSort.gpaComp);
			}
		}else if (c1.equals("d")) {
			if (c2.equals("id")) {
				Collections.sort(x,CSort.idComp.reversed());
			}else if (c2.equals("name")) {
				Collections.sort(x,CSort.nameComp.reversed());
			}else if (c2.equals("gpa")) {
				Collections.sort(x,CSort.gpaComp.reversed());
			}
		}
		
		for(int i =0;i<n;i++) {
			System.out.println(x.get(i).toString());
		}
		
 
	}
}


	

	

