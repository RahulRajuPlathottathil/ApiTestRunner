package base;

public class ResponseContext {
	
	private static World WorldContext;
	public static World getWorldVariables() {
	if(WorldContext==null) 
		WorldContext = new World();
	return WorldContext;
	}

}
