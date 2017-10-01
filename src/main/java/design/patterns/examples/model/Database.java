package design.patterns.examples.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    /*
    * We initialise the instance of the DB
    * Here we only have one and only one instance of the DB
     */
    private static final Database instance = new Database();

    private Connection con;

    private Database() {

    }

    /*
    * Here we are getting the one and only one instance of the Db
    * as per the singleton pattern
     */
    public static Database getInstance() {
        return Database.instance;
    }

	/*
     * additional methods added to the singleton class.
	 */

    public void connect() throws Exception {
        if (this.con != null)
            return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

        String url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);

        this.con = DriverManager.getConnection(url, "user", "letmein");
    }

    public void disconnect() {
        if (this.con != null) {
            try {
                this.con.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }

        this.con = null;
    }

}
