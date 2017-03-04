package ServantSimulator;
import java.io.*;
import java.util.*;

public class Race {

	public Race() {
		//generate a random race
		//Run the file with white as default, add in other race name files later
		race = "white";
		nameGetter();
	}
	public Race(String race){
		this.race = race;
		nameGetter();
	}
	private void nameGetter(){
		try{
			List<String> fileLines = new ArrayList<String>();
			//Get the race file and import the data to the fileLinies list
			Scanner inFile = new Scanner(new FileReader("src/ServantSimulator/Custom/Races/" + race));
			String trash = inFile.nextLine();
			while(inFile.hasNextLine()){
		        fileLines.add(inFile.nextLine());
		        //Here you can manipulate the string the way you want
		    }
			inFile.close();
			System.out.println(fileLines.get(0));
			
			
		}catch (FileNotFoundException e){
			System.out.println("File " + race +" not found");
		}
	}
	
	
	private String name, hairColor, eyeColor, skinColor, race;
	
	
}
