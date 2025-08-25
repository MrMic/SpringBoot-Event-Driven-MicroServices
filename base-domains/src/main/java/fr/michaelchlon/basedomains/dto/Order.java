package fr.michaelchlon.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
  private String OrderId;
  private String Name;
  private int qty;
  private double price;
}
