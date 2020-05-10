import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		String[] os=new String[] {"Mac", "linux", "windows"};
		Arrays.sort(os);
		System.out.println(Arrays.binarySearch(os,"Mac"));	// 0. indiste bulunmaktadýr.
	}

}
