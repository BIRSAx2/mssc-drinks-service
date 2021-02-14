package dev.mouhieddine.msscdrinksservice.repositories;

import dev.mouhieddine.msscdrinksservice.domain.Drink;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * @author : Mouhieddine.dev
 * @since : 2/14/2021, Sunday
 **/
// no need to annotate as Repository because PagingAndSortingRepository is already annotated with @Repository
public interface DrinkRepository extends PagingAndSortingRepository<Drink, UUID> {
}
