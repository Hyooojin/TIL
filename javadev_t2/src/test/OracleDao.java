package test;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("OracleDB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("OracleDB에서 입력");
	}

	@Override
	public void update() {
		System.out.println("OracleDB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("OracleDB에서 삭제");
	}

}
