
public class here {
	String [][] x = new String [4][4];
	
	here (String [][] c) {
		x=c;
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}
