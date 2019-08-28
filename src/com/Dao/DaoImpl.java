package com.Dao;


import java.sql.SQLException;
import java.util.List;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.Util.C3P0Util;
import com.entity.Bean;


public class DaoImpl {
		//String name, String phone, String email,String pass
		
	@Test 
	public List<Bean> SelectDao() {
		try {
			QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
			return qr.query("select * from admin", new BeanListHandler<Bean>(Bean.class));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public int insert(Bean tempadmin) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		int update = qr.update("INSERT INTO admin VALUES(?,?)",tempadmin.getName(),tempadmin.getPass());
		return update;
		
	}

}
