package com.hyooo.dev.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TextToSpeechDAOImpl implements TextToSpeechDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertTextToSpeech(TextToSpeechVO vo) throws Exception {
		Object[] args = new Object[] { vo.getStatement(), vo.getLang() };

		jdbcTemplate.update("insert into tbl_text2speech(statement, lang)values(?, ?)", args);
	}

	@Override
	public List<TextToSpeechVO> getTextToSpeechList() throws Exception {
		RowMapper<TextToSpeechVO> rowMapper = new RowMapper<TextToSpeechVO>() {

			@Override
			public TextToSpeechVO mapRow(ResultSet rs, int rownum) throws SQLException {
				TextToSpeechVO vo = new TextToSpeechVO();
				vo.setNo(rs.getInt("no"));
				vo.setStatement(rs.getString("statement"));
				vo.setLang(rs.getString("lang"));
				return vo;
			}

		};
		return jdbcTemplate.query(" select no, statement, lang from tbl_text2speech" + " order by no desc", rowMapper);

	}

	@Override
	public void deleteTextToSpeech(int no) throws Exception {
		jdbcTemplate.update("delete from tbl_text2speech where no=?", no);
		
	}

}
