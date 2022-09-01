package Language;


class Lang
{
 
    
    static boolean checkSentence(char[] str)
    {
 
       
        int len = str.length;
 
        
        {
        if (str[0] >= 'd' || str[0] <= 'u'&& str[0] >= 'D' || str[0] <= 'U')
   
        
        if (str[len - 1] != '.')
        	return false;
          }
		return false;
		
    }
    static void checkLength (String[] str ) {
    	
    	int len = str.length;
    	{
    		if(len>10)
    			return ;
    	}
    	return;
    }
    
           
 
       


 
    public static void main(String[] args)
    {
        String[] str = { "Nunddz id ulits orci.", "Cufabiu nonad in augueculrices.",
                         "Aenean aucbor purusa."};
        int str_size = str.length;
 
        int i = 0;
        for (i = 0; i < str_size; i++)
        {
            if (checkSentence(str[i].toCharArray()))
                System.out.println("\" "+ str[i] +
                                   "\"" + " - VALID");
            else
                System.out.println("\"" + str[i] +
                                   "\"" + " - INVALID");
        }
    }
}