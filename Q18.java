
public class Q18 {

	public static void main(String[] args) {
		char[][] tictactoe= new char[3,3]; //3 x 3 boyutlu dizi tan�mlan�rken new char[3][3] �eklinde yaz�lmal�d�r.
		tictactoe[1][3]='X';	// bizi 3 boyutludur. 3 indisi bulunmamaktad�r
		tictactoe[2][2]='X';
		tictactoe[3][1]='X';	// bizi 3 boyutludur. 3 indisi bulunmamaktad�r
		System.out.println(tictactoe.length+ "in a row");
	}

}
