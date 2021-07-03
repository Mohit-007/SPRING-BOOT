package ABC.XYZ.SPRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CAR implements VEHICLE
{
	@Autowired
	private TYRE tyre ;
	
	
	public TYRE getTyre() {
		return tyre;
	}


	public void setTyre(TYRE tyre) {
		this.tyre = tyre;
	}


	public void drive()
	{
		System.out.println("it is driving");
		System.out.println("it has " + tyre);
	}
}
