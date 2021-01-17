package com.kodilla.good.patterns.challenges.rentalservice;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
