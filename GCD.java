import java.util.Scanner;
public class GCD{
 //再帰を使う場合
 static int gcd(int x,int y){
	if(y == 0)
	 return x;
	else
	 return gcd(y, x%y);
 }

 //再帰を使わない場合
 static int gcd2(int x, int y){
	int z;
	while((z=x%y)!=0){
	 x = y;
	 y = z;
	}
	return y;
 }

 public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	System.out.print("2つの整数の最大公約数を求めます\n整数を入力:");
	int x = stdIn.nextInt();
	System.out.print("整数を入力:");
	int y = stdIn.nextInt();

	System.out.println("最大公約数(再帰使用　): " + gcd(x,y));
	System.out.println("最大公約数(再帰未使用): " + gcd2(x,y));
 }
}