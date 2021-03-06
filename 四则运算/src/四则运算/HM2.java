package 四则运算;

import java.util.Scanner;
public class HM2{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 0;
		int a, b;
		int sum = 0;
		System.out.println("输入要做的题目的数量:");
		n = scanner.nextInt();
		int[] op = new int[n];
		int[] s = new int[n];
		int[] result = new int[n];
		String[] questions = new String[n];
		for (int i = 0; i < n; i++) {
			op[i] = (int) (Math.random() * 4); // 运算符
			a = (int) (Math.random() * 89) + 10; // 数a
			b = (int) (Math.random() * 89) + 10; // 数b
			System.out.println(a + getOp(op[i]) + b + "=?");
			System.out.println("输入答案:");
			s[i] = scanner.nextInt(); // 输入的答案
			result[i] = jisuan(a, b, op[i]); // 正确答案
			if (s[i] == result[i]) {
				sum++;
			}
			questions[i] = a + getOp(op[i]) + b + "=" + result[i];
		}
		// 最后的输出
		System.out.println("你答对了" + sum + "道题，答错了" + (n - sum) + "道题");
		for (int i = 0; i < n; i++) {
			System.out.print(questions[i]);
			if (s[i] == result[i]) {
				System.out.println(",你的回答是" + s[i] + "，正确");
			} else {
				System.out.println(",你的回答是" + s[i] + "，错误");
			}
		}
	}

	// 获取运算符
	private static String getOp(int index) {
		String string = "";
		switch (index) {
		case 0:
			string = "+";
			break;
		case 1:
			string = "-";
			break;
		case 2:
			string = "*";
			break;
		case 3:
			string = "/";
			break;
		}
		return string;
	}

	// 计算答案
	private static int jisuan(int a, int b, int index) {
		int sum = 0;
		switch (index) {
		case 0:
			sum = a + b;
			break;
		case 1:
			sum = a - b;
			break;
		case 2:
			sum = a * b;
			break;
		case 3:
			sum = a / b;
			break;
		}
		return sum;
	}
}