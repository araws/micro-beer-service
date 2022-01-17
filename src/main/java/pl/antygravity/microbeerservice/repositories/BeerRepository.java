package pl.antygravity.microbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.antygravity.microbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
