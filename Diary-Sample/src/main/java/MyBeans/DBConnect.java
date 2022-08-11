package MyBeans;

import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;

public class DBConnect {
	Connection dbconn = null;

	String dburl = new String();
	String dbuser = new String();
	String dbpass = new String();


	public DBConnect() {
		//�����Ǵ� �ٲ��ּ���
		dburl = "jdbc:mysql://localhost:3306/jpsdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
		//�����̸� ����
		dbuser = "root";
		//�н����� ����
		dbpass = "admin";
	}


	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}

		try {
			dbconn = DriverManager.getConnection(dburl, dbuser, dbpass);
		} catch (SQLException e) {
		}

		return dbconn;
	}


	public void close() {
		try {
			if(!dbconn.isClosed()) {
				dbconn.close();
			}
		} catch (SQLException e) {
		}
	}

}