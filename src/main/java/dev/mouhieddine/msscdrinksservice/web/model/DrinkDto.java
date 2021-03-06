package dev.mouhieddine.msscdrinksservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author : Mouhieddine.dev
 * @since : 2/1/2021, Monday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkDto {

  private UUID id;
  private Integer version;
  private OffsetDateTime createdDate;
  private OffsetDateTime lastModifiedDate;

  private String name;
  private DrinkType type;
  private Long upc;
  private BigDecimal price;
  private Integer quantityOnHand;
}
