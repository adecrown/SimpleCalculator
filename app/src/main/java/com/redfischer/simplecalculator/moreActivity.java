package com.redfischer.simplecalculator;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class moreActivity extends ActionBarActivity {


    protected Button mRad;
    protected Button mDeg;
    protected Button mbutton1;
    protected Button mbutton2;
    protected Button mbutton3;
    protected Button mbutton4;
    protected Button mbutton5;
    protected Button mbutton6;
    protected Button mbutton7;
    protected Button mbutton8;
    protected Button mbutton9;
    protected Button mbutton0;
    private TextView mTextView;
    protected Button mplus;
    protected Button mMinus;
    protected Button mdivide;
    protected Button mtimes;
    protected Button mpercent;
    protected Button mequals;
    protected Button mplusMinus;
    private ArrayList<String> numbers = new ArrayList<>();
    protected Button mCancel;
    protected Button mdot;
    protected Button mport;
    protected Button mroot;
    protected Button mMemoryplus;
    protected Button mMemoryminus;
    protected Button mMemoryclear;
    protected Button mMemoryrecall;
    private String arit;
    private String renew = "noreset";
    private String num;
    private String dash;
    private int checker = 0;
    private int dotter = 1;
    private double mMemory = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);


      /*  mRad = (Button) findViewById(R.id.buttonRad);
        mDeg = (Button) findViewById(R.id.buttonDeg);
        mbutton1 = (Button)findViewById(R.id.button1);
        mbutton2 = (Button)findViewById(R.id.button2);
        mbutton3 = (Button)findViewById(R.id.button3);
        mbutton4 = (Button)findViewById(R.id.button4);
        mbutton5 = (Button)findViewById(R.id.button5);
        mbutton6 = (Button)findViewById(R.id.button6);
        mbutton7 = (Button)findViewById(R.id.button7);
        mbutton8 = (Button)findViewById(R.id.button8);
        mbutton9 = (Button)findViewById(R.id.button9);
        mbutton0 = (Button)findViewById(R.id.button0);

        mplus = (Button)findViewById(R.id.plusbutton);
        mMinus = (Button)findViewById(R.id.minusbutton);
        mdivide = (Button)findViewById(R.id.dividebutton);
        mtimes = (Button)findViewById(R.id.timesbutton);
        mequals = (Button) findViewById(R.id.equalsbutton);
        mCancel = (Button) findViewById(R.id.cancelbutton);
        mTextView = (TextView)findViewById(R.id.simpletextView);
        mdot = (Button)findViewById(R.id.dotbutton);
        mpercent=(Button)findViewById(R.id.buttonpercent);
        mplusMinus = (Button) findViewById(R.id.buttonpm);
        mport = (Button) findViewById(R.id.pButton);
        mroot = (Button) findViewById(R.id.squarerootbutton);
        mMemoryplus = (Button) findViewById(R.id.buttonmp);
        final Memory mmMemory = new Memory();
        mMemoryminus = (Button) findViewById(R.id.buttonmm);
        mMemoryclear = (Button) findViewById(R.id.buttonmc);
        mMemoryrecall = (Button) findViewById(R.id.buttonmr);

        Intent intent = getIntent();

        System.out.println(intent.getStringExtra(CalculatorMainActivity.moreActivity));
        mTextView.setText(intent.getStringExtra(CalculatorMainActivity.moreActivity));
        String nower = intent.getStringExtra(CalculatorMainActivity.note);

        double check  = Double.valueOf(nower);
        mmMemory.setDataMemory(check);


        mRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mRad.setBackgroundColor(Color.RED);
                mDeg.setBackgroundColor(Color.GRAY);


            }
        });


        mDeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDeg.setBackgroundColor(Color.RED);
                mRad.setBackgroundColor(Color.GRAY);


            }
        });

        //button one
        mbutton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String ok = mTextView.getText().toString();

                System.out.println(numbers.size());
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset"))
                {

                    mTextView.setText("1");
                    System.out.println(mTextView.getText());
                }

                else
                {

                    mTextView.append("1");

                }
                renew = "noreset";
            }
        });


        //button two
        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("2");

                }

                else
                {
                    mTextView.append("2");

                }
                renew = "noreset";
            }
        });

        //button 3
        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("3");

                }

                else
                {
                    mTextView.append("3");

                }
                renew = "noreset";
            }
        });

        //button 4
        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("4");

                }

                else
                {
                    mTextView.append("4");

                }
                renew = "noreset";
            }
        });

        //button 5
        mbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("5");

                }

                else
                {
                    mTextView.append("5");

                }
                renew = "noreset";
            }
        });

        //button 6
        mbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("6");

                }

                else
                {
                    mTextView.append("6");

                }
                renew = "noreset";
            }
        });

        //button 7
        mbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("7");

                }

                else
                {
                    mTextView.append("7");

                }
                renew = "noreset";
            }
        });

        //button 8
        mbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("8");

                }

                else
                {
                    mTextView.append("8");

                }
                renew = "noreset";
            }
        });

        //button 9
        mbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("9");

                }

                else
                {
                    mTextView.append("9");

                }
                renew = "noreset";
            }
        });

        //button 0
        mbutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ok = mTextView.getText().toString();
                if(numbers.size()==0 && ok.equals("0") || numbers.size()==1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("0");

                }

                else
                {
                    mTextView.append("0");

                }
                renew = "noreset";

            }
        });

        //plus one
        mplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int num = Integer.valueOf(mTextView.getText().toString());

                num = mTextView.getText().toString();

                numbers.add(num);


                mTextView.setText("0");
                arit="+";
                checker = 0;
                // System.out.println(numbers.size());



            }
        });

        //minus button
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int num = Integer.valueOf(mTextView.getText().toString());

                num = mTextView.getText().toString();
                numbers.add(num);



                mTextView.setText("0");
                //System.out.println(numbers.size());

                arit="-";
                checker = 0;



            }
        });

        mdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int num = Integer.valueOf(mTextView.getText().toString());

                num = mTextView.getText().toString();
                numbers.add(num);



                mTextView.setText("0");
                //System.out.println(numbers.size());

                arit="/";
                checker = 0;



            }
        });

        mtimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // int num = Integer.valueOf(mTextView.getText().toString());

                num = mTextView.getText().toString();
                numbers.add(num);



                mTextView.setText("0");
                //System.out.println(numbers.size());

                arit="*";
                checker = 0;



            }
        });

        //dot button
        mdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num = mTextView.getText().toString();
                if(!num.contains(".") && dotter ==1)
                {
                    mTextView.append(".");

                }
                else if(dotter == 0 )
                {
                    mTextView.setText("0.");
                }
                dotter = 1;


            }
        });
        //equals button
        mequals.setOnClickListener(new View.OnClickListener() {


            double cal5;
            @Override
            public void onClick(View v) {
                double answer;
                //int num = Integer.valueOf(mTextView.getText().toString());
                String num = mTextView.getText().toString();
                double cal ;
                double cal2;

                numbers.add(num);


                if(numbers.size() == 0 || numbers.size()==1)
                {

                    double num1 = Double.valueOf(mTextView.getText().toString());
                    answer = num1 ;
                    switch (arit) {
                        case "+":
                            answer = num1 + cal5;


                            break;
                        case "-":
                            answer = num1 - cal5;
                            break;
                        case "/":
                            answer = num1 / cal5;
                            break;
                        case "*":
                            answer = num1 * cal5;
                            break;
                        default:
                            answer = 0;
                            break;
                    }
                }
                else
                {

                    cal = Double.valueOf(numbers.get(0));

                    cal2 = Double.valueOf(numbers.get(1));
                    cal5  =  Double.valueOf(numbers.get(1));

                    switch (arit) {
                        case "+":
                            answer = cal + cal2;


                            break;
                        case "-":
                            answer = cal - cal2;
                            break;
                        case "/":
                            answer = cal / cal2;
                            break;
                        case "*":
                            answer = cal * cal2;
                            break;
                        default:
                            answer = 0;
                            break;
                    }

                }


                String ok = String.valueOf(answer).replaceFirst("\\.0+$", "");



                mTextView.setText(ok);
                numbers.clear();
                renew = "reset";
                checker = 0;
                dotter = 0;


            }
        });

        //cancel
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                numbers.clear();
                mTextView.setText("0");
                checker =0;


            }
        });

        //percent
        mpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double answer;
                String num = mTextView.getText().toString();

                numbers.add(num);

                double cal = 0;
                try {
                    cal = Double.valueOf(numbers.get(0));
                } catch (NumberFormatException e) {
                    //  e.printStackTrace();
                }

                answer = cal/100;

                String ok = Double.valueOf(answer).toString();



                mTextView.setText(ok);

                numbers.clear();
                renew = "reset";



            }
        });


        //plus or minus
        mplusMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {

                String ok = mTextView.getText().toString();


                if(!ok.equals("0"))

                {

                    if (!ok.contains("-") )
                    {

                        mTextView.setText("-" + mTextView.getText());


                    } else
                    {
                        String newer = String.valueOf(mTextView.getText()).replace("-", "");
                        mTextView.setText(newer);



                    }


                }

            }

        });




        mroot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double ok = Double.valueOf(mTextView.getText().toString());

                String answer = String.valueOf(Math.sqrt(ok));

                mTextView.setText(answer);


            }

        });


        mMemoryplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double ok = Double.valueOf(mTextView.getText().toString());

                //mMemory = mMemory + ok;

                double finder = mmMemory.getDataMemory() + ok;
                mmMemory.setDataMemory(finder);



            }

        });

        mMemoryminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double ok = Double.valueOf(mTextView.getText().toString());

                //  mMemory = mMemory - ok;


                double finder = mmMemory.getDataMemory() - ok;
                mmMemory.setDataMemory(finder);



            }

        });


        mMemoryclear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

              //  mMemory = 0;
                mmMemory.setDataMemory(0);

            }

        });


        mMemoryrecall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // String ok = String.valueOf(mMemory).replaceFirst("\\.0+$", "");

                //mTextView.setText(ok);

                String finder =String.valueOf(mmMemory.getDataMemory()).replaceFirst("\\.0+$", "");
                mTextView.setText(finder);

            }

        });*/

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_more, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
