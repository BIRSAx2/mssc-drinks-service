package dev.mouhieddine.msscdrinksservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author : Mouhieddine.dev
 * @since : 2/14/2021, Sunday
 **/

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Drink {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
  private UUID id;

  @Version
  private Long version;

  @CreationTimestamp
  @Column(updatable = false)
  private Timestamp createdDate;

  @UpdateTimestamp
  private Timestamp lastModifiedDate;

  private String name;
  private String type;

  @Column(unique = true)
  private Long upc;
  private BigDecimal price;
  private Integer quantityOnHand;
  private Integer quantityToBrew;
}
