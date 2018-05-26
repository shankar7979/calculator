class SplitTest{
   
    public static void main(String args[]){
        
       String s="we-will:learn&java learning java is easy";
     
      for(String p:  s.split("-|:|&|\\s"))
        System.out.println(p);     
    
      StringTokenizer st=new StringTokenizer("-|:|&|\\s");
        
      System.out.println("using string tokenizer");
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }   
}                 

