package oracledb.connection.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface OracleDB_DAO_Interface {

	/**
	 * Open the Dao Connection
	 *
	 * @param
	 * @throws SQLException
	 * @throws IOException
	 */
	void openConnection() throws SQLException;

	/**
	 * Close the connection
	 *
	 * @throws SQLException
	 */
	void closeConnection() throws SQLException;

	/**
	 * Get the resultset from the the select query
	 *
	 * @throws SQLException
	 * @throws IOException
	 */
	ResultSet getFirstNameAndLastNameFromCustomers() throws SQLException, IOException;

	/**
	 * Get the Current Time via DB Query
	 *
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 */
	String getDBCurrentTime() throws SQLException, IOException;

}
