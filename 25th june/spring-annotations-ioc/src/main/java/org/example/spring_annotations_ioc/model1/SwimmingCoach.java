package org.example.spring_annotations_ioc.model1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class SwimmingCoach implements Coach {
	
	private FortuneService sadFortuneService;
	@Value("${swim.team}")
	private String team;
	

	@Override
	public String getDailyworkOut() {
		// TODO Auto-generated method stub
		return "practice back swimming today"+" "+team;
	}

	@Autowired
	public SwimmingCoach(FortuneService sadFortuneService) {
		super();
		this.sadFortuneService = sadFortuneService;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return sadFortuneService.getDailyFortune();
	}

}
