
public class Q18 {

	public static void main(String[] args) {
		char[][] tictactoe= new char[3,3]; //3 x 3 boyutlu dizi tanımlanırken new char[3][3] şeklinde yazılmalıdır.
		tictactoe[1][3]='X';	// bizi 3 boyutludur. 3 indisi bulunmamaktadır
		tictactoe[2][2]='X';
		tictactoe[3][1]='X';	// bizi 3 boyutludur. 3 indisi bulunmamaktadır
		System.out.println(tictactoe.length+ "in a row");
	}

}
