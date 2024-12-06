import java.util.ArrayList;
import java.util.List;

public class Directory extends FileComponent {
	private final String name;

	// FileComponent ArrayList로 생성
	private final List<FileComponent> entries = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	// FileComponent entry 인자로 추가 후 depth 증가
	public void addEntry(FileComponent entry) {
		entries.add(entry);
		entry.setDepth(depth + 1);
	}

	// FileComponent entry 제거
	public void removeEntry(FileComponent entry) {
		entries.remove(entry);
	}

	public String getName() {
		return name;
	}

	// FileComponent override 후 size 불러오기
	@Override
	public int getSize() {
		int size = 0;
		for (FileComponent entry : entries) {
			size += entry.getSize();
		}
		return size;
	}

	// FileComponent override 후 print
	@Override
	public void print() {
		for (int i = 0; i < depth; i++)
			System.out.print("\t");
		System.out.println("[Directory] " + name + ", Size: " + getSize());

		for (FileComponent entry : entries) {
			entry.print();
		}
	}
}