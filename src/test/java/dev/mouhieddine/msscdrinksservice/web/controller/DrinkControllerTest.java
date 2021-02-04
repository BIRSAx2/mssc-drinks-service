package dev.mouhieddine.msscdrinksservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.mouhieddine.msscdrinksservice.web.model.DrinkDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author : Mouhieddine.dev
 * @since : 2/4/2021, Thursday
 **/

@WebMvcTest(DrinkController.class)
class DrinkControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Autowired
  ObjectMapper objectMapper;

  @BeforeEach
  void setUp() {
  }

  @Test
  void getDrinkById() throws Exception {
    mockMvc.perform(get(DrinkController.BASE_URL + "/" + UUID.randomUUID().toString())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
  }

  @Test
  void updateDrinkById() throws Exception {
    DrinkDto drinkDto = DrinkDto.builder().build();
    String drinkDtoJson = objectMapper.writeValueAsString(drinkDto);

    mockMvc.perform(put(DrinkController.BASE_URL + "/" + UUID.randomUUID().toString())
            .contentType(MediaType.APPLICATION_JSON)
            .content(drinkDtoJson))
            .andExpect(status().isNoContent());
  }

  @Test
  void createDrink() throws Exception {
    DrinkDto drinkDto = DrinkDto.builder().build();
    String drinkDtoJson = objectMapper.writeValueAsString(drinkDto);

    mockMvc.perform(post(DrinkController.BASE_URL)
            .contentType(MediaType.APPLICATION_JSON)
            .content(drinkDtoJson))
            .andExpect(status().isCreated());

  }

  @Test
  void deleteDrinkById() throws Exception {
    mockMvc.perform(delete(DrinkController.BASE_URL + "/" + UUID.randomUUID().toString())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
  }
}