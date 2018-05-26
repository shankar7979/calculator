import java.util.regex.*;

class reg11{

   public static void main(String args[]){
	 String s="abc";  
	 Pattern p=Pattern.compile("[a-z]*");
	 Matcher m=p.matcher(s);

	 while(m.find()){
		 System.out.println(m.group(0)+"  "+m.start());
	
		 System.out.println(m.group(1)+"  "+m.start());
		 System.out.println(m.group(2)+"  "+m.start());
	 }
   }

}

