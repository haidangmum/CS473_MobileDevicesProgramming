package com.example.nguyenhaidang.dinnerdecider;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<String> foods;
    private List<String> defaultFoods;
    ImageView foodImage;
    Button addBtn;
    Button decideBtn;
    EditText foodName;
    TextView selectedFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foods = new ArrayList<String>(){
            {
                add("american");
                add("chinese");
                add("hamberger");
                add("mexican");
                add("pizza");
            }
        };

        defaultFoods = Arrays.asList("american", "chinese", "hamberger", "mexican", "pizza");
        foodImage = findViewById(R.id.imageView);
        addBtn = findViewById(R.id.addButton);
        decideBtn = findViewById(R.id.decideButton);
        foodName = findViewById(R.id.newFood);
        selectedFood = findViewById(R.id.selectedFood);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newFood = foodName.getText().toString();
                if (newFood.equals(""))
                    return;
                foods.add(newFood);
                foodName.setText("");
            }
        });

        decideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                String randomElement = foods.get(rand.nextInt(foods.size()));
                if (defaultFoods.contains(randomElement)){
                    String uri = "@drawable/" + randomElement;
                    int imageResource = getResources().getIdentifier(uri,null, getPackageName());

                    Drawable res = getResources().getDrawable(imageResource);
                    foodImage.setImageDrawable(res);
                }else{
                    foodImage.setImageResource(R.drawable.default_food);
                }

                selectedFood.setText(randomElement);
            }
        });
    }
}
