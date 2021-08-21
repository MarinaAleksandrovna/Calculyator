import java.util.Map;

import java.util.Scanner; 
import java.util.HashMap;
public class  Conv  {

	    public static void main(String[] args) {
	    	char [] mas_zn={'*','/','+','-'};
	    	Scanner sc = new Scanner(System.in);
			System.out.print("Vvedite primer: ");
			String roman_numeral_input = sc.nextLine();
			int num_zn=0; char zn;int i=0;
			 try {
			while(num_zn<=0) {
			num_zn=roman_numeral_input.indexOf(mas_zn[i]);i++;
			
			}
			zn=roman_numeral_input.charAt(num_zn);
		
			String ch1=roman_numeral_input.substring(0,num_zn );
			String ch2=roman_numeral_input.substring(num_zn+1 );
		
			boolean chch1=Chysla.checkString(ch1); boolean chch2=Chysla.checkString(ch2); 
			if(!chch1&&!chch2) 
			{Roman_chysla ar_ch1=new Roman_chysla(ch1);
			Roman_chysla ar_ch2=new Roman_chysla(ch2); 
			int rez_nat=Roman_chysla.Deystve(zn,ar_ch1,ar_ch2);
			System.out.println(Roman_chysla.Natur_v_Rom(rez_nat));
			}
			else if(chch1&&chch2&&Integer.parseInt(ch1)>0&&Integer.parseInt(ch1)<11&&Integer.parseInt(ch2)>0&&Integer.parseInt(ch2)<11)
			{
				int ar_ch1=Integer.parseInt(ch1); 
				int ar_ch2=Integer.parseInt(ch2);int res=Chysla.Deystve(zn,ar_ch1,ar_ch2);System.out.println(res);}
			else {System.out.println("Nekorrektniy vvod");
			}
		
		
			}catch (Exception e) {
				System.out.println("Nekorrektniy vvod");}
	    
	    }
}
