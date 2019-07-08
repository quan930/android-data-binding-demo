package app.mrquan.databindingdemo.pojo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import app.mrquan.databindingdemo.BR;


public class Book {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt price = new ObservableInt();

    public Book(String name, Integer price) {
        this.name.set(name);
        this.price.set(price);
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    /**
     * Constructor
     * getter setter
     * ...
     */
}
