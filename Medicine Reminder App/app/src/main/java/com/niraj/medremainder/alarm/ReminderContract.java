package com.niraj.medremainder.alarm;

import com.niraj.medremainder.BasePresenter;
import com.niraj.medremainder.BaseView;
import com.niraj.medremainder.data.source.History;
import com.niraj.medremainder.data.source.MedicineAlarm;



public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
