

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

/**
 * ������������ʵ�����º���
 * @author Lenovo
 *
 */
public class Question1 {

	/**
	 * a. ��дһ����ͺ�������������������֮�͡����磬 int addUp(Stream<Integer>numbers) ��
	 * @param numbers
	 * @return
	 */
	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (acc, element) -> acc + element);
	}
	
	/**
	 * ��дһ�������������������б���Ϊ����������һ���ַ����б����а��������ҵ������͹�����
	 * @param artists
	 * @return
	 */
	public static List<String> artistsInfo(List<Artist> artists) {
		return artists.stream()
					  .map(artist -> artist.getName() + " " + artist.getNationality())        // my answer
//					  .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))// standard answer
					  .collect(Collectors.toList());
	}
	
	/**
	 * ��дһ������������ר���б���Ϊ����������һ���������� 3 �׸�����ר����ɵ��б�
	 * @param albums
	 * @return
	 */
	public static List<Album> getAlbums(List<Album> albums) {
		return albums.stream()
					 .filter(album -> album.getTrackList().size() <= 3)
					 .collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		Artist a1 = new Artist("С��", "�й�");
		Artist a2 = new Artist("���", "�ձ�");
		Artist a3 = new Artist("С��", "����");
		List<Artist> list = Stream.of(a1, a2, a3).collect(Collectors.toList());
		System.out.println("origin: " + list.size());
		artistsInfo(list).forEach(System.out::println);
	}
}
