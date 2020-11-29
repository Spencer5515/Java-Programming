
public class CastingNumerics {

	public static void main(String[] args) {
		//////////////////// DATATYPE SIZES ////////////////////
		char cVal = 'a';				// 2 bytes
		int iVal = 888; 				// 4 bytes
		short sVal = 55; 				// 2 bytes
		long lVal = 23555; 				// 8 bytes
		
		float fVal = 3.5f;				// 4 bytes
		float fVal2 = (float)128.16;	// same as fVal 
		double dVal = 4.576;			// 8 bytes
		////////////////////////////////////////////////////////
		
		iVal = (int)lVal; // casts <long> lVal to <int> iVal
		System.out.println(iVal); 
		
		dVal = iVal; // casts <int> iVal to floating-point <double> dVal 
		System.out.println(dVal);
		
		iVal = (int)fVal; // casts floating-point <float> fVal to <int> iVal
		System.out.println(iVal); // removes everything after '.' in float
		
	} // main
}
