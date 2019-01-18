package com.example.adisaktijrs.minicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView skor;
    private TextView angka1;
    private TextView angka2;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMulai;

//    private EditText num1;
//    private EditText num2;
//    private Button add;
//    private TextView result;
    Random rand = new Random();
    int skorAkhir = 0;

    public static int ang1;
    public static int ang2;
    public static int tambah;
    public static int digitAkhir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skor = (TextView) findViewById(R.id.hasil);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnMulai = (Button) findViewById(R.id.btnMulai);

        angka1 = (TextView) findViewById(R.id.angka1);
        angka2 = (TextView) findViewById(R.id.angka2);


        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnMulai.setVisibility(View.INVISIBLE);

                ang1 = rand.nextInt(10);
                ang2 = rand.nextInt(10);
                tambah = ang1 + ang2;
                digitAkhir = tambah % 10;

                angka1.setText(String.valueOf(ang1));
                angka2.setText(String.valueOf(ang2));

                //kruang tambah bbutton, btn0 belum didefinisikan


                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 1;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });


                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 2;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });


                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 3;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });


                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 4;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });


                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 5;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });

                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 6;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });

                btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 7;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });

                btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 8;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });

                btn9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 9;

                        if (digitAkhir == angBtn1) {
                            skorAkhir += 10;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));

                        } else {
                            skorAkhir = skorAkhir - 5;
                            skor.setText("Skor: " + String.valueOf(skorAkhir));
                        }

                        ang1 = rand.nextInt(10);
                        ang2 = rand.nextInt(10);
                        tambah = ang1 + ang2;
                        digitAkhir = tambah % 10;

                        angka1.setText(String.valueOf(ang1));
                        angka2.setText(String.valueOf(ang2));

                    }
                });


            }
        });

    }
}
