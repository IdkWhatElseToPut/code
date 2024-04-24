public class Phrase 
{ 

    private String currentPhrase; 



    public Phrase(String p) 
    { 
        currentPhrase = p; 
    } 



    public int findNthOccurrence(String str, int n) 
    { 

        int occurrence = 0;
        
        for(int i=0; i<currentPhrase.length(); i++)
        {
            if( i+str.length() < currentPhrase.length() )
            {
                if( currentPhrase.substring(i,i+str.length()).equals(str) )
                {
                    occurrence++;
                    if( occurrence == n )
                        return i;
                }
            }
        }
        
        return -1;
    
    }
    

    public void replaceNthOccurrence(String str, int n, String repl) 
    { /* to be implemented in part (a) */ 
        int index = findNthOccurrence(str, n);
        if(index != -1){
            currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());}
    }



    public int findLastOccurrence(String str) 
    { /* to be implemented in part (b) */ 
        int lastIndex = currentPhrase.lastIndexOf(str);
        return lastIndex;
    }

    public String toString() 
    { 
        return currentPhrase;
    } 

}
