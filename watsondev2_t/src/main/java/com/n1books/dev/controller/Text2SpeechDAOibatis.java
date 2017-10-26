package com.n1books.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

@Repository("ibatis")
public class Text2SpeechDAOibatis implements Text2SpeechDAO {

	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	@Override
	public void insertText2Speech(Text2SpeechVO vo) throws Exception {
		sqlMapClientTemplate.insert("tts.insertText2Speech", vo);
	}

	@Override
	public List<Text2SpeechVO> getText2SpeechList() throws Exception {
		return sqlMapClientTemplate.queryForList("tts.getText2SpeechList");
	}

	@Override
	public int deleteText2Speech(int no) throws Exception {
		return sqlMapClientTemplate.delete("tts.deleteText2Speech", no);
	}
}
