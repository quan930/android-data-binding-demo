package app.mrquan.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.mrquan.databindingdemo.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);
        ObservableArrayMap<String, String> book = new ObservableArrayMap<>();
        book.put("name", "Think in JAVA");
        binding.setBook(book);
    }
}
