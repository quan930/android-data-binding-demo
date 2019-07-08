package app.mrquan.databindingdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import app.mrquan.databindingdemo.databinding.BookItemBinding;
import app.mrquan.databindingdemo.pojo.Book;

public class BookAdapter extends ArrayAdapter<Book> {
    private LayoutInflater layoutInflater;
    public BookAdapter( Context context, int resource, List<Book> objects) {
        super(context, resource, objects);
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        BookItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.book_item, parent, false);
        binding.setBook(getItem(position));
        binding.setHandler(new MyHandler());
        return binding.getRoot();
    }
}
