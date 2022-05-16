import java.util.Scanner;
public class Method03{
	public static void main(String[] agrs){
		AA Aa = new AA();
//		Scanner mySca = new Scanner(System.in);
//		int n = mySca.nextInt();
//		if(Aa.isodd(n)){
//			System.out.println("是偶数");
//		}else{
//			System.out.println("是奇数");
//		}
		Aa.getChar(3,4);

	}
}

class AA{
//	public boolean isodd(int x){
//		if(x % 2 == 0){
//			return true;
//		}else{
//			return false;
//		}
//        return (x % 2 == 0? true : false);
//          return x % 2 == 0;
//	}

	public void getChar(int row,int col){
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}