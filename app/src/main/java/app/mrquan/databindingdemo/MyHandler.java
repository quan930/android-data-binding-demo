package app.mrquan.databindingdemo;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import app.mrquan.databindingdemo.pojo.Book;

public class MyHandler {
    public void onClick(View view){
        Toast.makeText(view.getContext(),"点击事件",Toast.LENGTH_SHORT).show();
    }
    public void onClickTwo(View view, Book book){
        book.price.set(book.price.get()+1);
        Toast.makeText(view.getContext(),"点击事件"+book,Toast.LENGTH_SHORT).show();
    }
    public void addBook(View view, ObservableList<Book> books,BookAdapter bookAdapter){
        books.add(new Book("core JAVA",200));
        bookAdapter.notifyDataSetChanged();
    }
    public void add(View view, ObservableList<Book> books){
        for (Book book : books) {
            book.price.set(book.price.get()+1);
        }
    }
}