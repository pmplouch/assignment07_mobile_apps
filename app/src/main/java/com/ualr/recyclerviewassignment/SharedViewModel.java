package com.ualr.recyclerviewassignment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<Inbox> selected = new MutableLiveData<Inbox>();
    public void select(Inbox item){
        selected.setValue(item);
    }
    public LiveData<Inbox> getSelected(){
        return selected;
    }
}
