package pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
public class Icon {

private String src;
private String sizes;
private String type;

/**
* No args constructor for use in serialization
*
*/
public Icon() {
}

/**
*
* @param sizes
* @param src
* @param type
*/
public Icon(String src, String sizes, String type) {
super();
this.src = src;
this.sizes = sizes;
this.type = type;
}

public String getSrc() {
return src;
}

public void setSrc(String src) {
this.src = src;
}

public String getSizes() {
return sizes;
}

public void setSizes(String sizes) {
this.sizes = sizes;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

}