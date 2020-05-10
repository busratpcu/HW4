
public class Q28 {
	public class sudoku{
		 static int[][] game = new int[6][6];
	}

	public static void main(String[] args) {
		game[3][3]=6;
		Object[] obj=game;
		obj[3]="X";
		System.out.println(game[3][3]);
		
	}

}
