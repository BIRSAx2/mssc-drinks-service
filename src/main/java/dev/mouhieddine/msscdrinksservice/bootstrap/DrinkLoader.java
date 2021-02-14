package dev.mouhieddine.msscdrinksservice.bootstrap;

import dev.mouhieddine.msscdrinksservice.domain.Drink;
import dev.mouhieddine.msscdrinksservice.repositories.DrinkRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author : Mouhieddine.dev
 * @since : 2/14/2021, Sunday
 **/
@Component
@Slf4j
public class DrinkLoader implements CommandLineRunner {
  private final DrinkRepository drinkRepository;

  public DrinkLoader(DrinkRepository drinkRepository) {
    this.drinkRepository = drinkRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    if (drinkRepository.count() == 0) loadDrinks();
  }

  private void loadDrinks() {
    log.debug("Loading drinks");
    drinkRepository.save(
            Drink.builder()
                    .name("Lemon Soda")
                    .type("Soda")
                    .upc(49000078725L)
                    .quantityOnHand(12)
                    .quantityToBrew(200)
                    .price(BigDecimal.valueOf(2.5))
                    .build()
    );
    drinkRepository.save(
            Drink.builder()
                    .name("Orange Soda")
                    .type("Soda")
                    .upc(31423424234L)
                    .quantityOnHand(12)
                    .quantityToBrew(200)
                    .price(BigDecimal.valueOf(2.5))
                    .build()
    );
    drinkRepository.save(
            Drink.builder()
                    .name("Coca Cola")
                    .type("Cola")
                    .upc(2483209840932L)
                    .quantityOnHand(12)
                    .quantityToBrew(200)
                    .price(BigDecimal.valueOf(2.5))
                    .build()
    );
  }
}
