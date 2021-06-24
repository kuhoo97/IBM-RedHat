package org.example.demo.model1;

public class CD1 {

	
	private Integer cdId;
	private String cdName;
	public CD1() {
		super();
	}
	public CD1(Integer cdId, String cdName) {
		super();
		this.cdId = cdId;
		this.cdName = cdName;
	}
	public Integer getCdId() {
		return cdId;
	}
	public void setCdId(Integer cdId) {
		this.cdId = cdId;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	@Override
	public String toString() {
		return "CD [cdId=" + cdId + ", cdName=" + cdName + "]";
	}
	
	
}
