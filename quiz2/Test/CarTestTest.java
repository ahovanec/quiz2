package Test;
import  quiz2.quiz2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quiz2.quiz2;

class CarTestTest {


	@Test
	void testEquals() {
		quiz2 c= new quiz2(35000, 0, 60, .1);
		if((743.65==c.MonthlyPayment())&&(c.TotalInterest()==9618.79)){
			
		}
		else{
		fail("Not yet implemented");
		}
	}


}
