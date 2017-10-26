package basic.exam4;

public class ArrayTest4 {
	public static void main(String[] args) {
		//int              [열] 
		//int          [행][열]
		//int      [표][행][열]
		//int[더미][표][행][열]
		int[][][] score =
		{
			{
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
			},
			{
				{100,100, 90, 80},
				{100, 90, 80, 70},
				{ 90, 80, 70, 60}
			}
		};
		
		for(int tab=0; tab < score.length; tab++) {
			System.out.println( (tab+1) + "학기 성적표");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for(int row=0; row < score[tab].length; row++) {
				int sum = 0;
				for(int col=0; col < score[tab][row].length; col++) {
					System.out.print(score[tab][row][col] + "\t");
					sum += score[tab][row][col];
				}
				System.out.println(sum + "\t" + sum/score[tab][row].length);
			}
			System.out.println();
		}
		
	}
}
