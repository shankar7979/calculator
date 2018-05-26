import  java.util.regex.*;

class Ex1{

public static void main(String args[]){
String var="13232 we are 66 hello i m 56 fine 666";
Pattern pattern=Pattern.compile("[0-9][0-9]");
      Matcher match =pattern.matcher(var);

while(match.find())
    {
    System.out.println(match.group());
    }
   }
 }
