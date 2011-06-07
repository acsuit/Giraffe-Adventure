import java.util.Arrays;


public class LevelReader {
	/** This class takes a string as an argument, and then uses 
	 * that string to create a group of arrays based on 
	 * positions on the screen or on the overall level. An '#' character
	 * indicates a break between each object, and a '%' indicates
	 * a break between each specifier of those objects (x-coord, 
	 * y-coord, and object type). Will be used in conjunction with
	 * the timer class. As of now, this just illustrates how it 
	 * reads it.
	 */
	String level;
	public LevelReader(){
	}
	public void read(String level){
		String[] newlevel = level.split("#");
		for (int i = 0; i < newlevel.length; i++){
			String obj = newlevel[i];
			String[] newobj = obj.split("%");
			System.out.println(Arrays.toString(newobj));
		}	
	}
}
