package springframework.msscbrewery.services.v2;

import org.springframework.stereotype.Service;
import springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
    return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {

        return null;
    }

    @Override
    public void deleteById(UUID beerId) {

    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }
}
