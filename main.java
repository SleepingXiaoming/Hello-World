public class main{
	public int temp = 0;

	public void test(){
		temp++;
		System.out.println(temp);
	}
	public static void main(String[] args) {
		main m = new main();
		main.test();
	}
}