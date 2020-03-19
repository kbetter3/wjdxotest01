package kr.co.itcen.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("wjdxo")
public class Wjdxo {
	private Long no;
	private String memo;
}
