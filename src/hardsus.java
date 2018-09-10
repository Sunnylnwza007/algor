import java.util.*;
public class hardsus {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		
		String[][] c = new String[4][4];
		
		for (int i=0;i<4;i++) {
			c[i] = a.next().split("");
		}
		here game = new here(c);
		
	}

}
