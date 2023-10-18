package dat3.car.dto;

import dat3.car.entity.Reservation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ReservationResponse {
  int id;
  int carId;
  String brand;
  String model;
  LocalDate reservationDate;
  double pricePrDay;

  public ReservationResponse(Reservation reservation) {
    this.id = reservation.getId();
    this.carId = reservation.getCar().getId();
    this.brand = reservation.getCar().getBrand();
    this.model = reservation.getCar().getModel();
    this.reservationDate = reservation.getRentalDate();
    this.pricePrDay = reservation.getCar().getPricePrDay();
  }


}
