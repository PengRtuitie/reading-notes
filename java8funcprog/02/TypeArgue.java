import java.awt.Button;
import java.util.function.Predicate;

/**
 * ������
 * �����ж�
 * @author Lenovo
 *
 */
public class TypeArgue {

	// a.����
	static Runnable r = () -> System.out.println("haha");
	
	// b.����
	static Button button = new Button();
	
	// c.�����ԣ�The method check(Predicate<Integer>) is ambiguous for the type TypeArgue
	static interface IntPred { boolean test(Integer value); }
	static boolean check(Predicate<Integer> predicate) { return predicate.test(1); }
	static boolean check(IntPred predicate) { return predicate.test(1); }
	
	public static void main(String[] args) {
		new Thread(r).start();
		
		button.addActionListener(
				event -> System.out.println(event));
		
//		check((v) -> v > 0);
	}
}
