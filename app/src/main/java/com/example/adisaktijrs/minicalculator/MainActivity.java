package com.example.adisaktijrs.minicalculator;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView skor;
    private TextView waktuCountDown;
    private CountDownTimer mCountDownTimer;
    private TextView angka1;
    private TextView angka2;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMulai;

    Random rand = new Random();
    int skorAkhir = 0;
    long countDownPeriod;
    boolean btnKlik = false;

    public static int ang1;
    public static int ang2;
    public static int tambah;
    public static int digitAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skor = (TextView) findViewById(R.id.hasil);
        btn0 = (Button) findViewById(R.id.btn0);
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
        waktuCountDown = findViewById(R.id.waktu);

        angka1 = (TextView) findViewById(R.id.angka1);
        angka2 = (TextView) findViewById(R.id.angka2);

        addAlertInfo();

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnKlik = true;
                btnMulai.setVisibility(View.INVISIBLE);

                ang1 = rand.nextInt(10);
                ang2 = rand.nextInt(10);
                tambah = ang1 + ang2;
                digitAkhir = tambah % 10;
                skorAkhir = 0;
                skor.setText("Skor: " + String.valueOf(skorAkhir));

                angka1.setText(String.valueOf(ang1));
                angka2.setText(String.valueOf(ang2));

                //kruang tambah button, btn0 belum didefinisika
                countDownPeriod = 10000;
                addCountDownTimer();

                btn0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 0;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                });

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 1;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 2;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 3;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });


                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 4;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });


                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 5;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });

                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 6;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });

                btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 7;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });

                btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 8;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });

                btn9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int angBtn1 = 9;

                        if(btnKlik == true) {
                            //
                            if (digitAkhir == angBtn1) {
                                skorAkhir += 10;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                newCounter();
                            } else {
                                skorAkhir -= 5;
                                skor.setText("Skor: " + String.valueOf(skorAkhir));
                                decCounter();
                            }

                            ang1 = rand.nextInt(10);
                            ang2 = rand.nextInt(10);
                            tambah = ang1 + ang2;
                            digitAkhir = tambah % 10;

                            angka1.setText(String.valueOf(ang1));
                            angka2.setText(String.valueOf(ang2));
                        } else {
                            //
                            Toast toast = Toast.makeText(MainActivity.this, "Klik Mulai dahulu", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //action_settings
        switch (item.getItemId()) {
            case R.id.action_settings:
                addAlertInfo();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addCountDownTimer() {
        countDownPeriod += 500;
        mCountDownTimer = new CountDownTimer(countDownPeriod,100) {
            @Override
            public void onTick(long l) {
                updateCount();
                countDownPeriod = l;
            }

            @Override
            public void onFinish() {
                infoSkor(skorAkhir);
                btnMulai.setVisibility(View.VISIBLE);
                btnKlik = false;
            }
        }.start();
    }


    private void decCountDownTimer() {
        countDownPeriod -= 1000;
        mCountDownTimer = new CountDownTimer(countDownPeriod, 100) {
            @Override
            public void onTick(long l) {
                updateCount();
                countDownPeriod = l;
            }

            @Override
            public void onFinish() {
                infoSkor(skorAkhir);
                btnMulai.setVisibility(View.VISIBLE);
                btnKlik = false;
            }
        }.start();
    }

    private void updateCount() {
        int minutes = (int) (countDownPeriod / 1000) / 60;
        int seconds = (int) (countDownPeriod / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d", minutes, seconds);
        System.out.println(timeLeftFormatted);

        waktuCountDown.setText(timeLeftFormatted);

    }

    private void newCounter() {
        mCountDownTimer.cancel();
        addCountDownTimer();
    }

    private void decCounter() {
        mCountDownTimer.cancel();
        decCountDownTimer();
    }

    public void addAlertInfo() {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog_info, null);
        Button mTutup = (Button) mView.findViewById(R.id.btnTutup);

        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();
        mTutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
    }

    public void infoSkor(int skor) {
        AlertDialog.Builder nBuilder = new AlertDialog.Builder(MainActivity.this);
        View nView = getLayoutInflater().inflate(R.layout.skor, null);
        Button nTutup = (Button) nView.findViewById(R.id.btn_tutup);
        TextView nTeks = (TextView) nView.findViewById(R.id.text_Jumlah);
        TextView ket = (TextView) nView.findViewById(R.id.teks_ket);

        nTeks.setText(String.valueOf(skor));
        ket.setText(ketSkor(skor));

        nBuilder.setView(nView);
        final AlertDialog dialog = nBuilder.create();
        dialog.show();
        nTutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    dialog.cancel();

            }
        });
        //angka1.setText(String.valueOf(ang1));

    }

    public String ketSkor(int skor) {
        if (skor <= 50) {
            return "Kemampuan anda setara dengan siswa SD. Teruskan belajar dan berlatih!";
        } else if (skor <= 100 ) {
            return "Kemampuan anda setara dengan siswa SMP. Cukup baik, belajar lagi";
        } else if (skor <= 150 ) {
            return "Kemampuan anda setara dengan siswa SMA. Lumayan";
        } else if (skor <= 200 ) {
            return "Kemampuan anda setara dengan Sarjana umum";
        } else if (skor <= 250 ) {
            return "Kemampuan anda setara dengan Sarjana Komputer";
        } else if (skor <= 300 ) {
            return "Kemampuan anda setara dengan lulusan Magister";
        } else if (skor <= 350 ) {
                return "Kemampuan anda setara dengan seorang Doktor";
        } else {
            return "Suhu Tingkat 1, setara mahasiswa S1 MARS University";
        }
    }


}
