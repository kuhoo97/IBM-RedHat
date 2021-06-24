package org.example.demo.model1;

public class SpecialeditionCD extends CD1 implements MyInterface {

	private String specialFeature;
	
	private FortuneService fortuneService;
	

	public SpecialeditionCD() {
		super();
	}


	public SpecialeditionCD(Integer cdId, String cdName, String specialFeature) {
		super(cdId, cdName);
		this.specialFeature = specialFeature;
	}

//*******************************
	//setter injection

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

	//******************************
	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}

	


	@Override
	public String getCdDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is SpecialEditionCD");
		return "SpecialeditionCD [specialFeature=" + specialFeature + ", getCdId()=" + getCdId() + ", getCdName()="
		+ getCdName() + "]";
	}

//******************************************
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	//***************************
}
