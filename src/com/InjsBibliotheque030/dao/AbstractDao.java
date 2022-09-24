package com.InjsBibliotheque030.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public abstract class AbstractDao {

	Connection connexion;
	Statement statement;
	String dbUrl;
	String dbUser;
	String dbPassword;
	String filename="database.properties";
	
	public AbstractDao() {
		System.out.println("========= On a été appellé par 'super'");
		try {
			if(this.connexion==null)
				getConnection();
			System.out.println("AbstractDao ==== cnx Ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void getConnection() throws ClassNotFoundException, SQLException {
		
		//this.connexion=getoracleConnection();	
		this.connexion = getmysqlConnection();
	}

	private Connection getmysqlConnection() throws ClassNotFoundException, SQLException{
		loadDBConf();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connexion=DriverManager.getConnection(this.getDbUrl(), this.getDbUser(), this.getDbPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getmysqlConnection sortie--------------------");
		return connexion;
	}
	private Connection getoracleConnection() throws ClassNotFoundException, SQLException {
		loadDBConf();
		System.out.println("OK11");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connexion=DriverManager.getConnection(this.getDbUrl(), this.getDbUser(), this.getDbPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getoracleConnection sortie--------------------");
		return connexion;
	}

	public ResultSet doExecuteReadQuery(String sqlString) throws SQLException{
		//String requete="select * from AAINJS_PERSON";		
		System.out.println(this.connexion);
		Statement stmt=this.connexion.createStatement();
		ResultSet resultat=stmt.executeQuery(sqlString);
		int nbColumn=resultat.getMetaData().getColumnCount();
		while(resultat.next()) {
			for(int i=1; i<=nbColumn; i++) {
				System.out.println(resultat.getString(i));
			}
			
		}
		return resultat;
	}
	public boolean doExecuteInsertQuery(String sqlString){
		System.out.println("[doExecuteInsertQuery]----- entree methode");
		//String requete="select * from AAINJS_PERSON";	
		boolean ret=true;
		try {
			
			Statement stmt=this.connexion.createStatement();
			ResultSet resultat=stmt.executeQuery(sqlString);
			stmt.executeQuery("commit");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret=false;
		}
		System.out.println("booeal="+ret);
		return ret;
	}
	/**
	 * 
	 * @param filename
	 * @return
	 */
	public Properties loadDBConf() {
		Properties props=null;
		try {			
			props=new Properties();
			props.load(new FileInputStream(filename));
			this.dbUrl=props.getProperty("db.url");
			this.dbUser= props.getProperty("db.user");
			this.dbPassword= props.getProperty("db.password");
		}catch(IOException ex) {
			
		}
		return props;
	}

	public Connection getConnexion() {
		return connexion;
	}

	public void setConnexion(Connection connexion) {
		this.connexion = connexion;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	public static void main(String[] args) throws Exception {
		DaoItem dao=new DaoItem();
		dao.getConnection();
		//dao.doExecuteQuery();
	}


}
