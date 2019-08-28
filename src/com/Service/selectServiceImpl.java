package com.Service;

import java.sql.SQLException;
import java.util.List;

import com.Dao.DaoImpl;
import com.entity.Bean;

public class selectServiceImpl {
		
	DaoImpl Dao=new DaoImpl();

	public List<Bean> SelectDao() {
		return Dao.SelectDao();

	}



	public int insert(Bean tempadmin) throws SQLException {
		return Dao.insert(tempadmin);
	}

}
