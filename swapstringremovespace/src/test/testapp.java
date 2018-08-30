package test;

public class testapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Output" + swapString("hello"));
		System.out.println("Output2" + removespace(" h h"));
		System.out.println("Output3" + deathToX(" h h h h h "));
	  }
	 static String swapString( String origin ) {
		  String resultString = "";
		  char[] chararray = origin.toCharArray();
		  
		  for(int i = 0; i<chararray.length; ) {
			  
			  if(i+1 < chararray.length) {
			 
			  resultString = resultString + chararray[i+1] + chararray[i];
			  i = i + 2;
			  
			  }else {
				  resultString =  resultString + chararray[i];
				  i = i + 1;
			  }
			  
			 
			  
		  }
		  
		  return resultString;
	}
	 
    static String removespace(String origin) {
    	
    	 String resultString = "";
		  char[] chararray = origin.toCharArray();
		  
		  for(int i = 0; i < chararray.length; i++  ) {
			  
			 if( !String.valueOf(chararray[i]).equals(" ") ) {
				 resultString = resultString + chararray[i];
				 	 
			 }
		  }
		  
		  return resultString;
	}
    
    public static String deathToX(String str){
        if (!str.isEmpty()){
            return (str.substring(0, 1).equals(" ") ? "" : str.substring(0, 1)) + deathToX(str.substring(1));
        }else{
            return "";
        }
    }
   	
}
