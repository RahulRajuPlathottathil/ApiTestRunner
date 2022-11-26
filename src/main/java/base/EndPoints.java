package base;

import java.util.Hashtable;

public class EndPoints {

	private static Hashtable<String, Hashtable<String, String>> resourceMapper;
	private static Hashtable<String, String> divisionMapper_Flight;
	private static Hashtable<String, String> divisionMapper_Hotel;
	public static void endPointInitializer(){
		resourceMapper = new Hashtable<String, Hashtable<String, String>>();
		divisionMapper_Flight = new Hashtable<String, String>();
		divisionMapper_Hotel = new Hashtable<String, String>();
		divisionMapper_Flight.put("manifest", "_next/static/almosafer-favicon/manifest.json");
		divisionMapper_Hotel.put("hotel_search", "api/enigma/search/async");
		resourceMapper.put("flight", divisionMapper_Flight);
		resourceMapper.put("hotel", divisionMapper_Hotel);

	}

	public static Hashtable<String, Hashtable<String, String>> getEndpoint() {

		return resourceMapper;
	}
}
