package com.mining.coal.dto;

import java.util.Objects;

public class Coords {
	
	public final int latitude;
    @Override
	public int hashCode() {
		return Objects.hash(latitude, longitude);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coords other = (Coords) obj;
		return latitude == other.latitude && longitude == other.longitude;
	}

	public final int longitude;

    public Coords(int lat, int lon) {
        latitude = lat;
        longitude = lon;
    }

}
