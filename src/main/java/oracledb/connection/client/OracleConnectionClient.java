package oracledb.connection.client;

import oracledb.connection.dao.OracleDB_DAO;

public class OracleConnectionClient {

	public static void main(String[] args) throws Exception {

		OracleDB_DAO dao = new OracleDB_DAO();
		dao.readPropertiesFile();
		dao.openConnection();
		dao.getDBCurrentTime();
		dao.getFirstNameAndLastNameFromCustomers();
		dao.closeConnection();

	}
}