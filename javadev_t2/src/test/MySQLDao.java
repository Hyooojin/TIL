package test;

public class MySQLDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySQLDB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySQLDB에서 입력");
	}

	@Override
	public void update() {
		System.out.println("MySQLDB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySQLDB에서 삭제");
	}

}
