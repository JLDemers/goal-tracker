package com.taskchamp.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.taskchamp.web.domain.Task;

@Component("tasksDao")
public class TaskDAO {

	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Task> getAllTasks() {

		return jdbc.query("select * from tasks", new RowMapper<Task>() {

			public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
				Task task = new Task();

				task.setId(rs.getInt("id"));
				task.setTaskId(rs.getString("task_id"));
				task.setTitle(rs.getString("title"));
				task.setDetails(rs.getString("details"));
				task.setTaskComplete(rs.getBoolean("task_complete"));

				return task;
			}

		});
	}
	
//	public boolean update(Task task) {
//		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(task);
//		
//		return jdbc.update("update tasks set name=:name, text=:text, email=:email where id=:id", params) == 1;
//	}
//	
//	public boolean create(Task task) {
//		
//		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(task);
//		
//		return jdbc.update("insert into tasks (name, text, email) values (:name, :text, :email)", params) == 1;
//	}
//	
//	@Transactional
//	public int[] create(List<Task> tasks) {
//		
//		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(tasks.toArray());
//		
//		return jdbc.batchUpdate("insert into tasks (id, name, text, email) values (:id, :name, :text, :email)", params);
//	}
//	
//	public boolean delete(int id) {
//		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
//		
//		return jdbc.update("delete from tasks where id=:id", params) == 1;
//	}
//
//	public Task gettask(int id) {
//
//		MapSqlParameterSource params = new MapSqlParameterSource();
//		params.addValue("id", id);
//
//		return jdbc.queryForObject("select * from tasks where id=:id", params,
//				new RowMapper<Task>() {
//
//					public Task mapRow(ResultSet rs, int rowNum)
//							throws SQLException {
//						Task task = new Task();
//
//						task.setId(rs.getInt("id"));
//						task.setName(rs.getString("name"));
//						task.setText(rs.getString("text"));
//						task.setEmail(rs.getString("email"));
//
//						return task;
//					}
//
//				});
//	}
	
}
