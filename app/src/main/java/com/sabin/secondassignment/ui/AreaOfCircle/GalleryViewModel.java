package com.sabin.secondassignment.ui.AreaOfCircle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Find Area of Circle");
    }

    public LiveData<String> getText() {
        return mText;
    }
}