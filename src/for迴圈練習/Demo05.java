package for迴圈練習;

public class Demo05 {

	public static void main(String[] args) {
		// 利用迴圈輸出下列圖形
		//    *
		//   * *
		//  * * *
		// * * * *
		//* * * * *

		String t = "*";
		for (int r = 5; r > 0; r--) {

			for (int c = 0; c < r - 1; c++) {
				System.out.print(" ");
			}
			System.out.println(t);
			t += " *";
		}
	}

}
