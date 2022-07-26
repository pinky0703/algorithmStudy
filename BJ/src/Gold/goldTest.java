package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class goldTest {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		for(int i=0;i<10;i++) {
			String s1 = in.readLine();
			StringTokenizer st = new StringTokenizer(s1," "); 

			for(int j = 0; j <= st.countTokens(); j++) {
				String N = st.nextToken();
				System.out.print(N+" ");
			}
			System.out.print("\n");
		}
		
	
	}
}
