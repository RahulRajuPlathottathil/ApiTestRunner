package pojo;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
public class FlightManifest {

		private String name;
		@JsonProperty("short_name")
		private String shortName;
		private String description;
		private String dir;
		private String lang;
		private String display;
		private String orientation;
		@JsonProperty("start_url")
		private String startUrl;
		@JsonProperty("background_color")
		private String backgroundColor;
		@JsonProperty("theme_color")
		private String themeColor;
		private List<Icon> icons ;
		@JsonProperty("gcm_sender_id")
		private String gcmSenderId;

		/**
		* No args constructor for use in serialization
		*
		*/
		public FlightManifest() {
		}

		/**
		*
		* @param startUrl
		* @param orientation
		* @param backgroundColor
		* @param themeColor
		* @param display
		* @param name
		* @param description
		* @param gcmSenderId
		* @param shortName
		* @param dir
		* @param lang
		* @param icons
		*/
		public FlightManifest(String name, String shortName, String description, String dir, String lang, String display, String orientation, String startUrl, String backgroundColor, String themeColor, List<Icon> icons, String gcmSenderId) {
		super();
		this.name = name;
		this.shortName = shortName;
		this.description = description;
		this.dir = dir;
		this.lang = lang;
		this.display = display;
		this.orientation = orientation;
		this.startUrl = startUrl;
		this.backgroundColor = backgroundColor;
		this.themeColor = themeColor;
		this.icons = (ArrayList<Icon>) icons;
		this.gcmSenderId = gcmSenderId;
		}

		public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}

		public String getShortName() {
		return shortName;
		}

		public void setShortName(String shortName) {
		this.shortName = shortName;
		}

		public String getDescription() {
		return description;
		}

		public void setDescription(String description) {
		this.description = description;
		}

		public String getDir() {
		return dir;
		}

		public void setDir(String dir) {
		this.dir = dir;
		}

		public String getLang() {
		return lang;
		}

		public void setLang(String lang) {
		this.lang = lang;
		}

		public String getDisplay() {
		return display;
		}

		public void setDisplay(String display) {
		this.display = display;
		}

		public String getOrientation() {
		return orientation;
		}

		public void setOrientation(String orientation) {
		this.orientation = orientation;
		}

		public String getStartUrl() {
		return startUrl;
		}

		public void setStartUrl(String startUrl) {
		this.startUrl = startUrl;
		}

		public String getBackgroundColor() {
		return backgroundColor;
		}

		public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		}

		public String getThemeColor() {
		return themeColor;
		}

		public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
		}

		public List<Icon> getIcons() {
		return icons;
		}

		public void setIcons(List<Icon> icons) {
		this.icons = (ArrayList<Icon>) icons;
		}

		public String getGcmSenderId() {
		return gcmSenderId;
		}

		public void setGcmSenderId(String gcmSenderId) {
		this.gcmSenderId = gcmSenderId;
		}

		}
