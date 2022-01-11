package javaBasics;

//1) How to find the maximum occurring character in a given string?

public class StringsPractices_maximumOccurance {
	
	public static void main(String[] args) {
	
	    String str = "grass is greener on the other side";  
        int[] freq = new int[str.length()];  
        char  maxChar = str.charAt(0);  
        int i, j, max;          
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
          
        //Count each word in given string and store in array freq  
        for(i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Determine minimum and maximum occurring characters  
   max = freq[0];  
        for(i = 0; i <freq.length; i++) { 
            //If max is less than frequency of a character   
            //then, store frequency in max and corresponding character in maxChar  
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
         
        System.out.println("Maximum occurring character: " + maxChar);  
    }  
}  
	
