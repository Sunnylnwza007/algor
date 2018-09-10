import java.util.*;

public class search {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int index;
		
		classSearch[] cs = new classSearch[n];
		
		for (int i=0;i<n;i++) {
			cs[i] = new classSearch(a.nextInt(),a.next());
		}
		String what = a.next();
		
		int index1=0;
		if (what.equals("id")) {
			Arrays.sort(cs, classSearch.numComp);
			index1 = Arrays.binarySearch(cs,new classSearch(a.nextInt(),null),classSearch.numComp);
		}else if(what.equals("name")){
			Arrays.sort(cs, classSearch.nameComp);
			index1 = Arrays.binarySearch(cs,new classSearch(0,a.next()),classSearch.nameComp);
		}
		
		if (index1>=0) {
			System.out.println("found");
		}else if(index1<0){
			System.out.println("not found");
		}
		
	}

}
