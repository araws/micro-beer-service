package pl.antygravity.microbeerservice.web.mappers;

import org.mapstruct.Mapper;
import pl.antygravity.microbeerservice.domain.Beer;
import pl.antygravity.microbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
