package br.com.fernandoleite.frugalmind.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import br.com.fernandoleite.frugalmind.R;

public class NewTransactionActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "NewTransactionActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_transaction);

        //region bindViews
        Button newTransactionButton = findViewById(R.id.newTransactionBtn);
        newTransactionButton.setOnClickListener(this);
        //endregion

        populateSpinnersForUser();
    }

    private void populateSpinnersForUser() {
        //Transaction Types Spinner

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.newTransactionBtn:

                break;
        }
    }

}
