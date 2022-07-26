package Day1_0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 채영
public class test2 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		
		while(n < 10) {
			String S = br.readLine();
			
			StringTokenizer st = new StringTokenizer(S, " ");
			for(int i = 0; i <= st.countTokens() + 1; i++) {
				String tmp = st.nextToken();
				System.out.print(tmp + " ");
			}
			System.out.println();
			n++;
		}
		
	}
}
