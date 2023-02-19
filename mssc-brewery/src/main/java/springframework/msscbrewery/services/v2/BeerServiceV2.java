package springframework.msscbrewery.services.v2;

import springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void deleteById(UUID beerId);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);
}
