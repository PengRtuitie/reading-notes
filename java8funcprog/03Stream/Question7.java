import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * ��һ���ַ����б��У��ҳ��������Сд��ĸ���ַ��������ڿ��б����� Optional<String> ����
 * @author Lenovo
 */
public class Question7 {

	public static Optional<String> getMostLowCase(List<String> list) {
		return list.stream()
				   .max(Comparator.comparing(
						str -> str.toString().chars().filter(Character::isLowerCase).count()));// my answer
	//					str -> Question6.getLowCades(str)));// my answer
	//					Question6::getLowCades));// standard answer
		
	}
}
