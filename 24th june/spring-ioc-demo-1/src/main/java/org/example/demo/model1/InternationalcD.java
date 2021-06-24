package org.example.demo.model1;

public class InternationalcD extends CD1 implements MyInterface{

	private String language;
//*******************************
	private FortuneService fortuneService;
//********************************
	public InternationalcD() {
		super();
	}
/*
	public InternationalcD(Integer cdId, String cdName, String language) {
		super(cdId, cdName);
		this.language = language;
	}

*/
	//********* constructor injection******
	public InternationalcD(FortuneService fortuneService) {
	
		this.fortuneService = fortuneService;
	}
	
//**********************************


	public String getLanguage() {
		return language;
	}

	
	
	public void setLanguage(String language) {
		this.language = language;
	}

	
	

	@Override
	public String getCdDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is InternationalCD");
		return  "InternationalcD [language=" + language + ", getCdId()=" + getCdId() + ", getCdName()=" + getCdName()
		+ "]";
	}
//******************************
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	//**********************
}
