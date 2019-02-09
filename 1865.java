import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner ok = new Scanner (System.in);

			
		int hm,n;
		String c;
			hm= ok.nextInt();
			
			for(int i=0;i<hm;i++) {
				c= ok.next();
				n = ok.nextInt();
				
				
				if(c.indexOf("Thor") != -1){ 
					System.out.println("Y");;
				}
				else 
					System.out.println("N");
				
			}
			
		}
	}
