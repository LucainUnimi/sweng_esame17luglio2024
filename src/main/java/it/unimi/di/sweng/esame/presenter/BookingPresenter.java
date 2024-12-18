package it.unimi.di.sweng.esame.presenter;

import it.unimi.di.sweng.esame.view.InputView;
import org.jetbrains.annotations.NotNull;

public class BookingPresenter implements InputPresenter {

    @NotNull InputView view;

    public BookingPresenter(@NotNull InputView inputBooking) {
        this.view = inputBooking;
    }

    @Override
    public void action(@NotNull String who, @NotNull String where) {

    }
}
