package kr.co.itcen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.itcen.dto.Wjdxo;
import kr.co.itcen.mapper.WjdxoMapper;

@Service
public class WjdxoService {

	@Autowired
	private WjdxoMapper wjdxoMapper;
	
	public int insertWjdxo(Wjdxo wjdxo) {
		return wjdxoMapper.insertWjdxo(wjdxo);
	}
	
	public List<Wjdxo> selectWjdxo() {
		return wjdxoMapper.selectWjdxo();
	}
}
