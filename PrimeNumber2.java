public class PrimeNumber2 {

 //main
 public static void main(String[] args) {
	final int range = 1000; // 検査対象の最大数
	boolean[] search = new boolean[range+1];	//探索リスト
	int[] prime = new int[500];	//素数リスト
	int ptr = 0;	//素数の個数
	
	//0～最大値までのフラグを一旦全て立てる
	for(int i=0; i<=range; i++)
	 search[i] = true;
	
	//素数でない数値である0と1のフラグを消す
	search[0] = false;	
	search[1] = false;

	//2～最大値までの走査
	//見た数が素数だったとき，その数の倍数をふるい落とす
	for(int i=2; i<=range; i++){
	 if(search[i]){
		for(int j=i*2; j<=range; j+=i)
		 search[j] = false;
	 }
	}

	//フラグの立ってる数を素数リストへ
	for(int i=0; i<=range; i++){
	 if(search[i])
		prime[ptr++] = i;
	}

	//一覧表示
	for(int i=0; i<ptr; i++)
	 System.out.println(prime[i]);
 }
}
