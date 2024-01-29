import java.util.ArrayList;

/**
 * @author Anood
 * @author Marwa
 * 
 * constructor
 *
 */
// anood + marwaa
public class SharedData 
{
	private  ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array2 array of integer
	 * @param b intger num
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		 array = new ArrayList<Integer>();
		 array=array2;
		//this.array = array;
		this.b = b;
	}
	

	/**
	 * @return the the first third that return two numbers sum =5
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
