package org.example.spring_annotations_ioc.model1;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return  "today is your bad day";
	
	}

}
