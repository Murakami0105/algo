import java.util.Scanner;
public class GCD{
 //�ċA���g���ꍇ
 static int gcd(int x,int y){
	if(y == 0)
	 return x;
	else
	 return gcd(y, x%y);
 }

 //�ċA���g��Ȃ��ꍇ
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

	System.out.print("2�̐����̍ő���񐔂����߂܂�\n���������:");
	int x = stdIn.nextInt();
	System.out.print("���������:");
	int y = stdIn.nextInt();

	System.out.println("�ő����(�ċA�g�p�@): " + gcd(x,y));
	System.out.println("�ő����(�ċA���g�p): " + gcd2(x,y));
 }
}