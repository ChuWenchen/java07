public class Method{
	public static void main(String[] agrs){
		person p1 = new person();
		p1.sum1();
		p1.sum2(5);
		int sum = p1.sum3(10,20);
		System.out.println(sum);


	}
}


class person{
	int age;
	String name;
	public void speak(){
		System.out.println("abcdiofbxciuvh");
	}
	
	public void sum1(){
	int sum = 0;
	for(int i = 1; i<=100; i++){
		sum += i;
	}
	System.out.println("计算结果为：" + sum);
}

	public void sum2(int n){
		int sum = 0;
		for(int i = 0; i<=n; i++){
	        sum+=i;
	    }  
	    System.out.println("sum2 = " + sum);
	}

	public int sum3(int x,int y){
		return x+y;
		
	}
}

