import java.util.HashMap;
import java.util.Map;

public class Roman_chysla extends Chysla {
	private  String roman_chyslo;
	private int znach;
	public Roman_chysla(String roman_numeral) { roman_chyslo=roman_numeral;
	 Map<String, Integer> roman_ch = new HashMap<String, Integer>();
     
     roman_ch.put("I",1 );
     roman_ch.put("II",2 );
     roman_ch.put("III",3 );
     roman_ch.put("IV",4 );
     roman_ch.put("V",5 );
     roman_ch.put("VI",6 );
     roman_ch.put("VII",7 );
     roman_ch.put("VIII",8 );
     roman_ch.put("IX",9 );
     roman_ch.put("X",10 );
     znach=roman_ch.get(roman_numeral);

}
	
	public static String Natur_v_Rom(int nat) { String rez="Sredy rymskih chysel net otricatelnyh";
	 Map<Integer,String> roman_ch = new HashMap<Integer,String>(); 
    
    roman_ch.put(1,"I" );
    roman_ch.put(2,"II");
    roman_ch.put(3,"III" );
    roman_ch.put(4,"IV");
    roman_ch.put(5,"V");
    roman_ch.put(6,"VI");
    roman_ch.put(7,"VII");
    roman_ch.put(8,"VIII" );
    roman_ch.put(9,"IX");
    roman_ch.put(10,"X" );
    roman_ch.put(20,"XX" );
    roman_ch.put(30,"XXX");
    roman_ch.put(40,"XL" );
    roman_ch.put(50,"L" );
    roman_ch.put(60,"LX");
    roman_ch.put(70,"LXX" );
    roman_ch.put(80,"LXXX");
    roman_ch.put(90,"XC");
    roman_ch.put(100,"C" );
    if(roman_ch.containsKey(nat) ) {rez=roman_ch.get(nat);}
    else if(nat>0&&nat<100){rez=roman_ch.get(nat-nat%10)+roman_ch.get(nat%10);}
    return rez;
}
	public static int Deystve(char znak, Roman_chysla chys1,Roman_chysla chys2) {
		int rez=0;
	
	 switch (znak){
		case '*': rez=chys1.znach*chys2.znach; break;
		case '/': rez=chys1.znach/chys2.znach; break;
		case '+': rez=chys1.znach+chys2.znach; break;
		case '-': rez=chys1.znach-chys2.znach; break;
		default: System.out.println("Nekorrektniy vvod");
		}
		 return rez;
	 }
	

}
