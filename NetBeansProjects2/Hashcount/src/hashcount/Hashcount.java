
package hashcount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Hashcount {

    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String[] args) {
        Map sto= new HashMap();
        String fileName = "pg100.txt";
                
		try {
			Scanner scanner = new Scanner(new File(fileName));
			
                        while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				
                               
                               
                                
     String[] words = line.split("\\s+|[\\;\\,\\:\\!\\*\\'\\\"\\(\\)\\/\\-\\[\\]\\<\\>\\+\\$\\?\\.@&].*");				
    for(int i=0;i<words.length;i++){
    words[i] = words[i].replaceAll(":", "");
    words[i] = words[i].replaceAll(",", "");
    if(sto.get(words[i])==null){
        
        sto.put(words[i],1);
    }
    else{
        int newVal=Integer.valueOf(String.valueOf(sto.get(words[i])));
    newVal++;
    sto.put(words[i],newVal);
    }



				}
			}
			scanner.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();}
    
    
    for(Object key:sto.keySet())
   System.out.println(key+" "+sto.get(key));
    }}