public class Method02{
	public static void main(String[] agrs){
		int[][] map = {{1,2,3},{4,5,6},{7,8,9}};
		Arr s = new Arr();
		s.arr(map);

	}
}

class Arr{
	public void arr(int[][] x){
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				System.out.print(x[i][j] + "  ");
			}
			System.out.println();
		}
	}

}