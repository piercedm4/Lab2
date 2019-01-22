import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "piercedm4", "1369443456258");

	    /* Set an assignment title */
	    bridges.setTitle("Dylan Pierce");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    for (int i = 0; i < arr.getSize(); i++) {
	    	int square = i * i;
	    	arr.getElement(i).setValue (square);
	    	arr.getElement(i).setLabel(String.valueOf(square));
	    }
	    
	    /* Populate the array with integers */

	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
