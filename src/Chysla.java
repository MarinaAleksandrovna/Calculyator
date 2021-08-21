
public class Chysla {
	 public static int Deystve(char znak,int chys1,int chys2) {
			int rez=0;
		
		 switch (znak){
			case '*': rez=chys1*chys2; break;
			case '/': rez=chys1/chys2; break;
			case '+': rez=chys1+chys2; break;
			case '-': rez=chys1-chys2; break;
			default: System.out.println("Не корректное действие");
			}
			 return rez;
		 }
	 public static boolean checkString(String string) {
	        try {
	            Integer.parseInt(string);
	        } catch (Exception e) {
	            return false;
	        }
	        return true;}


}
