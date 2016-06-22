package Pack1;

public class testSplit {
	public static void main(String[] args){
		String chuoi="toi ten la nguyen thanh tung";
		String cat_chuoi[];
		cat_chuoi=chuoi.split(" ");
		for(String s:cat_chuoi){
			System.out.println(s);
		}
	}
}
