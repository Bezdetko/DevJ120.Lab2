package ru.avalon.devj120.lab2;

import java.util.Arrays;

public class StringService {
    
    public static String[] sort(String[] as, boolean dir) throws StringArrayException{
    if (as == null || as.length==0) throw new StringArrayException("Array is null or empty" );
        
    if (dir){
        Arrays.sort(as);
    }
        else {
    String[] reverseAs = new String [as.length];

        for (int i = 0; i<as.length ; i++){
            reverseAs[i] = as[as.length-1-i];
        }      
        as = reverseAs;    
}
    return as;
}
    
    public static char[] getCharStat(String str) {
        if (str==null || str.isEmpty()) 
            return null;
        else {
        char[] charStr =str.toCharArray();
        String allChars = new String();

        for (int i=0; i < charStr.length; i++){            

            if (allChars.indexOf(charStr[i]) == -1)

            allChars = allChars+charStr[i];
        }
        return allChars.toCharArray();
        }        
    }
    
}
