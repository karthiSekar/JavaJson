package shenba.test.javaJson;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
public class JsonTest {
 static ObjectMapper mapper;
static{
	mapper=new ObjectMapper();
}
public static  String convertJson(Object object) throws JsonGenerationException, JsonMappingException, IOException{
	String jsonRes=mapper.writeValueAsString(object);
	return jsonRes;
}
public static Object convertJava(String jsonString,Class cls) throws JsonParseException, JsonMappingException, IOException{
Object toRetrun=mapper.readValue(jsonString, cls);
return toRetrun;

}
}
