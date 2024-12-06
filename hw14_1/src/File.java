class File extends FileComponent {
	private final String name;
	private final int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	// FileComponent override 후 size 불러오기
	@Override
	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	@Override
	public void print() {
		for (int i = 0; i < depth; i++)
			System.out.print("\t");
		System.out.println("[File] " + name + ", Size: " + size);
	}
}
