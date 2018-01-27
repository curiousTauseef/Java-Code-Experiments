package oracledb.connection.dao;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class OracleDB_DAO implements OracleDB_DAO_Interface {

	public static String SAMPLE_SELECT_QUERY = "SELECT * FROM CUSTOMERS WHERE FirstName = 'Eliott' AND LastName = 'Brown'";

	private static String driverClass = "oracle.jdbc.driver.OracleDriver";
	private Connection connection;
	private static String dbUrl;
	private static String userName;
	private static String password;

	static String resourceName = "dbconnection.properties";

	/**
	 * Read the properties Initialise the DAO
	 *
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */

	public void readPropertiesFile() throws IOException, ClassNotFoundException {

		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties props = new Properties();
		InputStream resourceStream = loader.getResourceAsStream(resourceName);
		{
			props.load(resourceStream);
		}

		// Return the properties
		dbUrl = props.getProperty("dburl");
		userName = props.getProperty("dbuser");
		password = props.getProperty("dbpassword");

		// Load the
		Class.forName(driverClass);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see oracledb.connection.dao.OracleDB_DAO_Interface1#openConnection()
	 */
	@Override
	public void openConnection() throws SQLException {

		// get the connection to the database
		System.out.println("Establishing the Connection to the Database");
		try {
			connection = DriverManager.getConnection(dbUrl, userName, password);
			System.out.println(connection);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see oracledb.connection.dao.OracleDB_DAO_Interface1#closeConnection()
	 */
	@Override
	public void closeConnection() throws SQLException {
		if (connection != null) {
			// close the connection
			connection.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see oracledb.connection.dao.OracleDB_DAO_Interface1#
	 * getFirstNameAndLastNameFromCustomers()
	 */
	@Override
	@SuppressWarnings("resource")
	public ResultSet getFirstNameAndLastNameFromCustomers() throws SQLException, IOException {
		// create the prepared stmt
		Statement stmt = connection.createStatement();
		// assign the query to a variable
		String sql = SAMPLE_SELECT_QUERY;
		// execute the query
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("This print the ResultSet for getPlanByMSISD " + rs);
		@SuppressWarnings("unused")
		PrintWriter csvWriter = new PrintWriter(new File("sample.csv"));

		stmt.close(); // close statement
		return rs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see oracledb.connection.dao.OracleDB_DAO_Interface1#getDBCurrentTime()
	 */
	@Override
	public String getDBCurrentTime() throws SQLException, IOException {
		String dateTime = null;
		// create the prepared stmt
		Statement stmt = connection.createStatement();
		ResultSet rst = stmt.executeQuery("select SYSDATE from dual");
		while (rst.next()) {
			dateTime = rst.getString(1);
		}
		// close the resultset
		System.out.println("This prints the dateTime from the DB " + dateTime);
		rst.close();
		return dateTime;

	}
}
