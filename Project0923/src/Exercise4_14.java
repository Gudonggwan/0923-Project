
public class Exercise4_14 {
	public static void main(String[] args)
	{
		int answer = (int)(Math.random()*101);
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� :");
			input = s.nextInt();
			if(answer == input)
			{
				System.out.println("������ϴ�");
				System.out.println("�õ�Ø��" +count);
				break;
			}
			else if(answer < input)
			{
				System.out.println("�� �������� �Է��ϼ���");
			
			}
			else
			{
				System.out.println("�� ū���� �Է��ϼ���");
				
			}
			
		} while(true);
	}
}
			