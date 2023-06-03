package SOPStatement;

import java.io.PrintStream;

public class SopStatementdef {
	//SOP Statement explanation
	//Here user defined class "SopStatmentdef" contains variable "s" which is a string datatype. to find out length of a
	// string we can use length() method of String class followed by SopStatementdef.s.length()
	
	//Same way , Predefined class "System" contains static variable called "out" which is a PrintStream datatype,
	//to print a statement or argument, we can use prinltn() method of PrintStream class followed by
	//System.out.println()

	static String s = "Welcome";
	
	
	public static void main(String[] args) {
		int len = SopStatementdef.s.length();
		System.out.println(len);

	}

}
