package br.com.frd.web;

import br.com.frd.api.PlaceResponse;
import br.com.frd.domain.Place;

public class PlaceMapper {

	public static PlaceResponse fromPlaceToResponse(Place place) {
		return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
	}

}
