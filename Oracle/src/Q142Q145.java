
public class Q142Q145 {
	public static void change(int[] arr) {
		for (int pos = 0; pos < arr.length; pos++) {
			arr[pos] = arr[pos] + 1;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		change(arr);
		for (int x : arr) {
			System.out.println(x);
		}
		int[] arr1 = { arr[0], arr[1], arr[2] };
		change(arr1);
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		// Q146 correct A

		int a = -10;
		int b = 17;
		int c = ++a;
		int d = b--;
		c++;
		d--;
		System.out.println(c + "," + d);
		// correct answer is B, not D.

		int n[];
		n = new int[2];
		n[0] = 10;
		n[1] = 20;

		n = new int[4];
		n[2] = 30;
		n[3] = 40;
		for (int i : n) {
			System.out.println(i);
		}
		// Q152 correct B

		// Q142 correct answer is B, not C

		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = str1;

		System.out.println(str1 == str2);
		// Q161 A, not B

		int row = 10;
		for (; row > 0;) {
			int col = row;
			while (col >= 0) {
				System.out.println(col);
				col -= 2;
			}
			row = row / col;
		}
		// Q162 corrent is A(10,8,6,4,2,0), not B

	}

}
