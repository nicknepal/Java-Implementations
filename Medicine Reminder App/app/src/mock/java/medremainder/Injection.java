package com.niraj.medremainder;

import android.content.Context;
import androidx.annotation.NonNull;

import com.niraj.medremainder.data.source.MedicineRepository;
import com.niraj.medremainder.data.source.local.MedicinesLocalDataSource;



public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
