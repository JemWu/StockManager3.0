package com.jem.personal.stockmanager.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.jem.personal.stockmanager.base.BaseViewModel;

/**
 * @author Jem
 */
public class LoginViewModel extends BaseViewModel{
    public ObservableField<String> mAccount = new ObservableField<>();
    public ObservableField<String> mPassword = new ObservableField<>();
    private Context mContext = null;

    public LoginViewModel(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onItemClick() {
        Toast.makeText(mContext,"dianji le",Toast.LENGTH_SHORT).show();
        Log.d("jem", "onItemClick: ");
    }

}
