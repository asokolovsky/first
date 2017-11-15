package PatientPortal.APITesting;

import static io.restassured.RestAssured.*;
import org.junit.Test;
import junit.framework.TestCase;

public class AppTest 
extends TestCase
{
	@Test
	public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
	        
	    given().
	    when().
	        get("http://ergast.com/api/f1/2017/circuits.json").
	    then().
	        assertThat().
	        statusCode(100);
	}
}