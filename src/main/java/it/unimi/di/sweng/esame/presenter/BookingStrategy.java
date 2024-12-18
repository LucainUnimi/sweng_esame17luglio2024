package it.unimi.di.sweng.esame.presenter;

import org.jetbrains.annotations.NotNull;

public class BookingStrategy implements Strategy {

    @NotNull public final static BookingStrategy INSTANCE = new BookingStrategy();

    @Override
    public String checkInput(String who, String where) {
        if (who.isBlank()) return "Empty customer name";
        if (where.isBlank()) return "Empty excursion name";
        return null;
    }
}
