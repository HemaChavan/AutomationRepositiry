package excelfilemanipulation;

import java.io.IOException;

public class UserReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Xls_Reader x1 = new Xls_Reader("D:\\Techbodhi\\test_excel.xls");
		int rows = x1.getrowcount("Sheet1");
		int cols = x1.getColumncount("Sheet1");
		
		System.out.println("Rows="+rows);
		System.out.println("Cols="+cols);
		
		System.out.println(x1.getCellData("Sheet1", 1, 1));
		
		/*for(int r=1 ; r<= rows ;r++)
		{
			for(int c =1 ;c<= cols ;c++)
			{
				System.out.println(x1.getCellData("Sheet1", r, c));
			}
				
		}*/
	//	x1.setCellData("Sheet1", "Username", 5, "techbodhi");

	}

}
