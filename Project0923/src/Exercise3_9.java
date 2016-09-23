
public class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'Z';
		boolean b = ((int)ch >= 48 && (int)ch <= 57)
				|| ((int)ch >= 65 && (int)ch<= 90)
				|| ((int)ch >= 97 && (int)ch <= 122);
				//0 : 48 ~ 57 a : 97 ~ 122 65~90
		
		System.out.println(b);

	}

}
