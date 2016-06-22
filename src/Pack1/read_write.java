package Pack1;
import java.io.*;
import java.util.*;

class scanFile {
	String ten[]=new String[100];
	int tuoi[]=new int[100];
	int luong[]=new int[100];
	int sum_line=0;
	
	void read() throws IOException{
		String line[]=new String[100];
		FileInputStream f=new FileInputStream("E:/java/eclipse/WorkSpaceEclipse/2206/input.txt");
		Scanner input=new Scanner(f,"UTF-8");
		
		while(input.hasNextLine()){  //trong khi chua het file
			line[sum_line]=input.nextLine();
			if(line[sum_line].trim()!=""){ //if line != empty
				String cat_chuoi[]=line[sum_line].split(" ");
				ten[sum_line]=cat_chuoi[0];
				tuoi[sum_line]=Integer.parseInt(cat_chuoi[1]); 
				luong[sum_line]=Integer.parseInt(cat_chuoi[2]);
			}
			sum_line++;
		}
		input.close();
	}
	
	public void write() throws IOException{
		FileOutputStream f=new FileOutputStream("E:/java/eclipse/WorkSpaceEclipse/2206/output.txt");
		PrintWriter output=new PrintWriter(f);
		int i=0;
		while(i<sum_line){
			output.println(ten[i]);
			output.println(tuoi[i]);
			output.println(luong[i]);
			i++;
		}
		output.close();
	}
}

public class read_write {
	public static void main(String[] args) throws IOException{
		scanFile a=new scanFile();
		a.read();
		a.write();
		System.out.println("Done!");
	}
}
