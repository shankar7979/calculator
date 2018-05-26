import java.util.regex.*;

class Ex2{
	
	public static void main(String args[]){
		Pattern   pattern=Pattern.compile("[a-z]");
        String s;

		Matcher matcher=pattern.matcher("hello world");
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}
	
	}

