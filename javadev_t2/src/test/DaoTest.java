package test;

public class DaoTest {
	public static void dbTest(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbTest(new OracleDao());
		dbTest(new MySQLDao());
	}
}