public class Method04{
	public static void main(String[] agrs){
		AA a = new AA();
		a.getChar(3,4);
	}
}


class AA{
	public void getChar(int row,int col){
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				System.out.print("#");
			}
			System.out.println();
		}
    }
}