package shenba.test.javaJson;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class MainMethod {
	public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
		App ob= new App();
		ob.setNo(1);
		ob.setName("Abarna");
		String a=JsonTest.convertJson(ob);
		System.out.println(a);
		Object ofApp=JsonTest.convertJava(a,App.class);
		System.out.println(ofApp);
    }
}
