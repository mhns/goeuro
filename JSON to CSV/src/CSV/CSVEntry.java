package CSV;

public class CSVEntry {
	
	String city;
	String type;
	String lat;
	String lon;
	
	public CSVEntry() {
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}
	
	public void print(){
		System.out.println("-----------------------");
		System.out.println("City name: "+ this.getCity());
		System.out.println("Type. "+this.getType());
		System.out.println("Lat: "+this.getLat());
		System.out.println("Lon: "+ this.getLon());
		System.out.println(System.clearProperty("line.separator"));
	}

}
