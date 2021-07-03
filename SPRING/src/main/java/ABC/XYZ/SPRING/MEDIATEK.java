package ABC.XYZ.SPRING;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MEDIATEK implements PROCESSOR{

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("MEDIATEK PROCESSOR");
	}

}
