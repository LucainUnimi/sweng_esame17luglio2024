package it.unimi.di.sweng.esame.presenter;

import it.unimi.di.sweng.esame.view.InputView;
import org.jetbrains.annotations.NotNull;

public class BookingPresenter implements InputPresenter {

    @NotNull InputView view;

    public BookingPresenter(@NotNull InputView inputBooking) {
        this.view = inputBooking;
        view.addHandlers(this);
    }

    @Override
    public void action(@NotNull String who, @NotNull String where) {
        if (who.isBlank()) view.showError("Empty customer name");
        if (where.isBlank()) view.showError("Empty excursion name");
    }
}
