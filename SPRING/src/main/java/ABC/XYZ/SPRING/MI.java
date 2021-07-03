package ABC.XYZ.SPRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MI {
	
	@Autowired
	PROCESSOR i8 ;
	
	
	public PROCESSOR getI8() {
		return i8;
	}


	public void setI8(PROCESSOR i8) {
		this.i8 = i8;
	}


	public void config()
	{
		System.out.println("REDMI 5 , 4GB RAM , 32GB STORAGE");
		i8.process();
	}
}
