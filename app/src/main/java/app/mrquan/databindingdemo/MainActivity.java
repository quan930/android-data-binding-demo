package app.mrquan.databindingdemo;

import android.arch.lifecycle.AndroidViewModel;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import app.mrquan.databindingdemo.databinding.ActivityMainBinding;
import app.mrquan.databindingdemo.pojo.Book;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
//        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());


        ObservableArrayList<Book> books = new ObservableArrayList<>();
        books.add(new Book("Thinking in JAVA",100));
        books.add(new Book("Thinking in JAVA",100));
        books.add(new Book("Thinking in JAVA",100));
        books.add(new Book("Thinking in JAVA",100));
        books.add(new Book("Thinking in JAVA",100));
//        //设置xml中声明的引用对象
//        binding.setBook(new Book("Thinking in JAVA",100));
        binding.setHandler(new MyHandler());
        binding.setBooks(books);
        binding.setBookAdapter(new BookAdapter(getApplicationContext(),R.layout.book_item,books));
    }
}
