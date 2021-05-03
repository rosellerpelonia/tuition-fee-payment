package com.example.onlinetuitionfeepayment.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.onlinetuitionfeepayment.HomeActivity;
import com.example.onlinetuitionfeepayment.MainActivity;
import com.example.onlinetuitionfeepayment.R;

public class AdminCategoryActivity extends AppCompatActivity {

    //local variables
    private ImageView poloMen, blouseWomen, slacksMen, skirtWomen;
    private ImageView joggingPants, peShirt, formalWomen, deptShirt;
    private ImageView seminarPayment, fieldTripPayment, bookBuy, tuitionPayment;
    private Button LogoutBtn, CheckOrdersBtn, maintainProductButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        //calls the activity Admin CategoryActivity.xml file layout


        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button)findViewById(R.id.check_orders_btn);
        maintainProductButton = (Button)findViewById(R.id.maintain_btn);



        maintainProductButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);

            }
        });

        //LOGOUT ADMIN ACCOUNT
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        //BUTTON CLICK TO ADMIN NEW ORDERS ACTIVITY
        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);

            }
        });


        poloMen = (ImageView) findViewById(R.id.polo_standard_men);
        blouseWomen = (ImageView) findViewById(R.id.blouse_women);
        slacksMen = (ImageView) findViewById(R.id.slacks_men);
        skirtWomen = (ImageView) findViewById(R.id.skirt_women);

        joggingPants = (ImageView) findViewById(R.id.pe_jogging_pants);
        peShirt = (ImageView) findViewById(R.id.pe_shirt);
        formalWomen = (ImageView) findViewById(R.id.formal_dress_women);
        deptShirt = (ImageView) findViewById(R.id.dept_shirt_men);

        seminarPayment = (ImageView) findViewById(R.id.seminars);
        fieldTripPayment = (ImageView) findViewById(R.id.field_Trips);
        bookBuy = (ImageView) findViewById(R.id.book);
        tuitionPayment = (ImageView) findViewById(R.id.tuition_fee);

        //Admin click the image product and send the activity to AdminAddNewProductActivity
        poloMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Polo Men");
                startActivity(intent);
            }
        });
        blouseWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Blouse Women");
                startActivity(intent);
            }
        });
        slacksMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Slacks Men");
                startActivity(intent);
            }
        });
        skirtWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Skirt Women");
                startActivity(intent);
            }
        });
        joggingPants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Jogging Pants");
                startActivity(intent);
            }
        });
        peShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pe Shirt");
                startActivity(intent);
            }
        });
        formalWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Formal Women");
                startActivity(intent);
            }
        });
        deptShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Formal Men");
                startActivity(intent);
            }
        });
        seminarPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Seminar");
                startActivity(intent);
            }
        });
        fieldTripPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Field Trips");
                startActivity(intent);
            }
        });
        bookBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Books");
                startActivity(intent);
            }
        });
        tuitionPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tuition");
                startActivity(intent);
            }
        });

    }
}