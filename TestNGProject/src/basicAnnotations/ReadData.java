//create an excel sheet and paste it in folder Testdata (enter the values and copy the location and paste here); 
//copy paste the file of xls_reader and use the functions from here

package basicAnnotations;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		Xls_Reader xl = new Xls_Reader("C:\\Users\\Hemz\\eclipse-workspace\\TestNGProject\\src\\Testdata\\test_excel.xls");
		int rows = xl.getrowcount("Sheet1");
		int col = xl.getColumncount("Sheet1");
		
		System.out.println(rows);
		System.out.println(col);

	//	String val = xl.getCellData("Sheet1", 2, 2);
		//System.out.println(val);
		
		for(int r=2 ; r<= rows ;r++)
		{
			for(int c =1 ;c<= col ;c++)
			{
				String val = xl.getCellData("Sheet1", r, c);
				System.out.println(val);
			}
				
		}
		
		
	}

}
