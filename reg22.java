import java.util.regex.*;

class reg22 {
public static void main(String ar[]){

String s="hello world";
Pattern p=Pattern.compile("//bwo//b");
Matcher m=p.matcher(s);

    System.out.println("hello");
    
while(m.find())
  System.out.println(m.group()+"  "+m.start());

}

} 
