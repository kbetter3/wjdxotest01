package kr.co.itcen.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.itcen.dto.Wjdxo;

@Mapper
public interface WjdxoMapper {
	
	public int insertWjdxo(Wjdxo wjdxo);
	
	public List<Wjdxo> selectWjdxo();
}
