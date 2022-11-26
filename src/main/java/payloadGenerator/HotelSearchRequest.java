/**
 * 
 */
package payloadGenerator;

import java.util.ArrayList;
import java.util.List;

import base.DateUtility;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.ClassInfo;
import pojo.HotelSearchModel;

/**
 * @author Lenovo
 *
 */
public class HotelSearchRequest {
	static RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	public static RequestSpecification req;

	public static HotelSearchModel generateHotelSearchPayLoad(boolean nearme, String city, String checkin,
			String checkout, int adultsCount, String placeId) {

		ClassInfo classinfo = new ClassInfo();
		HotelSearchModel hotelSearchModel = new HotelSearchModel();
		classinfo.setAdultsCount(adultsCount);
		List<String> kidsAge = new ArrayList<String>();
		classinfo.setKidsAges(kidsAge);
		List<ClassInfo> roomInfo = new ArrayList<ClassInfo>();
		roomInfo.add(classinfo);
		hotelSearchModel.setNearme(nearme);
		hotelSearchModel.setCity(city);
		hotelSearchModel.setCheckIn(DateUtility.getDate(checkin));
		hotelSearchModel.setCheckOut(DateUtility.getDate(checkout));
		hotelSearchModel.setRoomsInfo(roomInfo);
		hotelSearchModel.setPlaceId(placeId);
		return hotelSearchModel;

	}

}
