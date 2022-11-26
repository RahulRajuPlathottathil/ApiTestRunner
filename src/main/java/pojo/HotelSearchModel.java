/**
 * 
 */
package pojo;

import java.util.List;

/**
 * @author Lenovo
 *
 */
public class HotelSearchModel {
	
	private boolean nearme;
	private String city;
	private String checkIn;
	private String checkOut;
	private List<ClassInfo> roomsInfo;
	private String placeId;
	/**
	 * @return the nearme
	 */
	public boolean getNearme() {
		return nearme;
	}
	/**
	 * @param nearme the nearme to set
	 */
	public void setNearme(boolean nearme) {
		this.nearme = nearme;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the checkIn
	 */
	public String getCheckIn() {
		return checkIn;
	}
	/**
	 * @param checkIn the checkIn to set
	 */
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	/**
	 * @return the checkOut
	 */
	public String getCheckOut() {
		return checkOut;
	}
	/**
	 * @param checkOut the checkOut to set
	 */
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	/**
	 * @return the roomsInfo
	 */
	public List<ClassInfo> getRoomsInfo() {
		return roomsInfo;
	}
	/**
	 * @param roomsInfo the roomsInfo to set
	 */
	public void setRoomsInfo(List<ClassInfo> roomsInfo) {
		this.roomsInfo = roomsInfo;
	}
	/**
	 * @return the placeId
	 */
	public String getPlaceId() {
		return placeId;
	}
	/**
	 * @param placeId the placeId to set
	 */
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	

}
