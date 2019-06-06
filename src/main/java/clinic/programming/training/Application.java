package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words)
	{
	   String[] separateWords = StringUtils.split(words," ");
	   return (separateWords == null)?0:separateWords.length;
	
	}
    
	public void greet()
	{
	   List<String> greeti = new ArrayList<>();
	   greeti.add("Hello");
	   
	   for(String g : greeti)
	   {
	      System.out.println("Greeti " + g);
	   }
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	int cnt = app.countWords("I have four words");
	  System.out.println ("word Count " + cnt);
    }
}
