package dev.mouhieddine.msscdrinksservice.web.controller;

import dev.mouhieddine.msscdrinksservice.web.model.DrinkDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author : Mouhieddine.dev
 * @since : 2/1/2021, Monday
 **/
@RestController
@RequestMapping(DrinkController.BASE_URL)
public class DrinkController {
  public static final String BASE_URL = "/api/v1/drink";

  @GetMapping({"/{id}"})
  public ResponseEntity<DrinkDto> getDrinkById(@PathVariable("id") UUID id) {
    // todo: impl
    return new ResponseEntity<>(DrinkDto.builder().build(), HttpStatus.OK);
  }

  @PutMapping({"/{id}"})
  public ResponseEntity<DrinkDto> updateDrinkById(@PathVariable("id") UUID id, @RequestBody DrinkDto drinkDto) {
    // todo: impl
    return new ResponseEntity<>(DrinkDto.builder().build(), HttpStatus.NO_CONTENT);
  }

  @PostMapping
  public ResponseEntity<DrinkDto> saveDrink(@RequestBody DrinkDto drinkDto) {
    // todo: impl
    return new ResponseEntity<>(DrinkDto.builder().build(), HttpStatus.CREATED);
  }

  @DeleteMapping({"/{id}"})
  @ResponseStatus(HttpStatus.OK)
  public void deleteDrinkById(@PathVariable("id") UUID id) {
  }
}