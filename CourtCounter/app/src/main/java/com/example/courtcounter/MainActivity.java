package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantityA = 0;
    int quantityB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForA(0);
        displayForB(0);
    }


    public void threeA(View view) {
        quantityA += 3;
        displayForA(quantityA);
    }

    public void twoA(View view) {
        quantityA += 2;
        displayForA(quantityA);
    }

    public void oneA(View view) {
        quantityA += 1;
        displayForA(quantityA);
    }

    private void displayForA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.text_viewA);
        quantityTextView.setText("" + number);
    }

    public void threeB(View view) {
        quantityB += 3;
        displayForB(quantityB);
    }

    public void twoB(View view) {
        quantityB += 2;
        displayForB(quantityB);
    }

    public void oneB(View view) {
        quantityB += 1;
        displayForB(quantityB);
    }

    private void displayForB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.text_viewB);
        quantityTextView.setText("" + number);
    }

    public void reset(View view) {
        displayForB(0);
        displayForA(0);
    }

    /*public void submitOrder(View view) {
        String priceMessage="Total: $"+quantity+"\nThank you!";
        displayMessage(priceMessage);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }*/
}