
/**
 *  ����һ���ַ�����Сд��ĸ�ĸ�������ʾ������ String ����� chars ��������
 * @author Lenovo
 *
 */
public class Question6 {

	public static int getLowCades(String str) {
		return (int) str.chars()
//				  	 	.filter(ch -> Character.isLowerCase(ch))// my answer
						.filter(Character::isLowerCase)// standard answer
				  	 	.count();
	}
	
	public static void main(String[] args) {
		System.out.println(getLowCades("afsdfAFSDF"));
	}
}
