package com.redfischer.simplecalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;


public class CalculatorMainActivity extends ActionBarActivity {


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
    protected Button mSin;
    protected Button mCos;
    protected Button mTan;
    protected Button mSin1;
    protected Button mCos1;
    protected Button mTan1;
    protected Button mSinh;
    protected Button mCosh;
    protected Button mTanh;
    protected Button mSinh1;
    protected Button mCosh1;
    protected Button mTanh1;
    protected Button mRand;
    protected Button mLog;
    protected Button mX;
    protected Button mLn;
    protected Button mXy;
    protected Button mInv;
    protected Button mx3;
    protected Button mEx;
    protected Button m10X;
    protected Button mLog2;
    protected Button mOB;
    protected Button mCB;

    private String arit;
    private String renew = "noreset";
    private String num;
    private String dash;
    private int checker = 0;
    private int dotter = 1;
    private double memory = 0;
    protected Button mE;
    protected Button mPie;
    private double mAE = 2.71828182846;
    private double mEpie = 3.14159265;
    private int radeg = 1;
    private int mMXY = 0;
    private int unlock = 0;
    private int ee = 0;
    private double answer = 0;
    private  int dect = 0;
    double ofg = 0;
    int oku = 0;

    //final Memory mmMemory = new Memory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);



        // Store UI state to the savedInstanceState.
        // This bundle will be passed to onCreate on next call.  EditText txtName = (EditText)findViewById(R.id.txtName);


        mRad = (Button) findViewById(R.id.buttonRad);
        mDeg = (Button) findViewById(R.id.buttonDeg);
        mbutton1 = (Button) findViewById(R.id.button1);
        mbutton2 = (Button) findViewById(R.id.button2);
        mbutton3 = (Button) findViewById(R.id.button3);
        mbutton4 = (Button) findViewById(R.id.button4);
        mbutton5 = (Button) findViewById(R.id.button5);
        mbutton6 = (Button) findViewById(R.id.button6);
        mbutton7 = (Button) findViewById(R.id.button7);
        mbutton8 = (Button) findViewById(R.id.button8);
        mbutton9 = (Button) findViewById(R.id.button9);
        mbutton0 = (Button) findViewById(R.id.button0);
        mTextView = (TextView) findViewById(R.id.simpletextView);
        mplus = (Button) findViewById(R.id.plusbutton);
        mMinus = (Button) findViewById(R.id.minusbutton);
        mdivide = (Button) findViewById(R.id.dividebutton);
        mtimes = (Button) findViewById(R.id.timesbutton);
        mequals = (Button) findViewById(R.id.equalsbutton);
        mCancel = (Button) findViewById(R.id.cancelbutton);
        mdot = (Button) findViewById(R.id.dotbutton);
        mpercent = (Button) findViewById(R.id.buttonpercent);
        mplusMinus = (Button) findViewById(R.id.buttonpm);
       
        mroot = (Button) findViewById(R.id.squarerootbutton);
        mMemoryplus = (Button) findViewById(R.id.buttonmp);

        mMemoryminus = (Button) findViewById(R.id.buttonmm);
        mMemoryclear = (Button) findViewById(R.id.buttonmc);
        mMemoryrecall = (Button) findViewById(R.id.buttonmr);
        mE = (Button) findViewById(R.id.buttonE);
        mPie = (Button) findViewById(R.id.buttonPie);
        mSin = (Button) findViewById(R.id.buttonSin);
        mCos = (Button) findViewById(R.id.buttonCos);
        mTan = (Button) findViewById(R.id.buttonTan);
        mSin1 = (Button) findViewById(R.id.buttonSin1);
        mCos1 = (Button) findViewById(R.id.buttonCos1);
        mTan1 = (Button) findViewById(R.id.buttonTan1);
        mSinh = (Button) findViewById(R.id.buttonSinh);
        mCosh = (Button) findViewById(R.id.buttonCosh);
        mTanh = (Button) findViewById(R.id.buttonTanh);
        mSinh1 = (Button) findViewById(R.id.buttonSinh1);
        mCosh1 = (Button) findViewById(R.id.buttonCosh1);
        mTanh1 = (Button) findViewById(R.id.buttonTanh1);
        mRand = (Button) findViewById(R.id.buttonRand);
        mLog = (Button) findViewById(R.id.buttonLog);
        mX =(Button) findViewById(R.id.buttonX);
        mLn =(Button) findViewById(R.id.buttonLn);
        mXy =(Button) findViewById(R.id.buttonXY);
        mInv =(Button) findViewById(R.id.buttonInv);
        mx3 =(Button) findViewById(R.id.buttonX3);
        mEx =(Button) findViewById(R.id.buttonEX);
        m10X =(Button) findViewById(R.id.button10x);
        mLog2 =(Button) findViewById(R.id.buttonLog2);
        mOB =(Button) findViewById(R.id.buttonOpenB);
        mCB =(Button) findViewById(R.id.buttonCloseB);



        //mport.setText("\u232B");


        //mTextView.setText(mmMemory.getTextBox());


        //button one
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ok = mTextView.getText().toString();


                //System.out.println(numbers.size());
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {

                    mTextView.setText("1");

                } else {

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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("2");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("3");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("4");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("5");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("6");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("7");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("8");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("9");

                } else {
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
                if (numbers.size() == 0 && ok.equals("0") || numbers.size() == 1 && ok.equals("0") || renew.equals("reset")) {
                    mTextView.setText("0");

                } else {
                    mTextView.append("0");

                }
                renew = "noreset";

            }
        });

        //plus one
        mplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                //int num = Integer.valueOf(mTextView.getText().toString());
                num = mTextView.getText().toString();
                numbers.add(num);

                if(dect == 0)
                {
                    mTextView.setText("0");
                    dect = 1;
                    arit = "+";
                }
                else
                {
                    numbers.add(mTextView.getText().toString());

                        double ofg1 = Double.valueOf(numbers.get(0));


                        double ofg2 = Double.valueOf(numbers.get(1));

                    if(oku  ==0) {
                        ofg = ofg1 + ofg2;
                        oku = 1;

                    }
                    else if(oku  ==1 && !arit.equals("+"))
                    {
                        double oki = Double.valueOf(mTextView.getText().toString());

                        switch (arit)
                        {

                            case "-":
                                ofg = ofg - oki;
                                break;
                            case "/":
                                ofg = ofg / oki;
                                break;
                            case "*":
                                ofg = ofg * oki;
                                break;
                            default:
                                answer = 0;
                                break;
                        }
                        arit = "+";

                    }
                    else
                    {
                       double oki = Double.valueOf(mTextView.getText().toString());
                        ofg = oki + ofg;
                    }




                    // = ofg1  +  ofg2;



                    mTextView.setText(String.valueOf(ofg).replaceFirst("\\.0+$", ""));
                    renew = "reset";

                }




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

                if(dect == 0)
                {
                    mTextView.setText("0");
                    dect = 1;
                    arit = "-";
                }
                else
                {
                    numbers.add(mTextView.getText().toString());

                    double ofg1 = Double.valueOf(numbers.get(0));


                    double ofg2 = Double.valueOf(numbers.get(1));

                    if(oku  ==0) {
                        ofg = ofg1 - ofg2;
                        oku = 1;

                    }
                    else if(oku  ==1 && !arit.equals("-"))
                    {
                        double oki = Double.valueOf(mTextView.getText().toString());

                        switch (arit)
                        {

                            case "+":
                                ofg = ofg + oki;
                                break;
                            case "/":
                                ofg = ofg / oki;
                                break;
                            case "*":
                                ofg = ofg * oki;
                                break;
                            default:
                                answer = 0;
                                break;
                        }
                        arit = "-";

                    }
                    else
                    {
                        double oki = Double.valueOf(mTextView.getText().toString());
                        ofg = ofg - oki;
                    }




                    // = ofg1  +  ofg2;



                    mTextView.setText(String.valueOf(ofg).replaceFirst("\\.0+$", ""));
                    renew = "reset";

                }


                checker = 0;


            }
        });

        mdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int num = Integer.valueOf(mTextView.getText().toString());

                num = mTextView.getText().toString();
                numbers.add(num);

                if(dect == 0)
                {
                    mTextView.setText("0");
                    dect = 1;
                    arit = "/";
                }
                else
                {
                    numbers.add(mTextView.getText().toString());

                    double ofg1 = Double.valueOf(numbers.get(0));


                    double ofg2 = Double.valueOf(numbers.get(1));

                    if(oku  ==0) {
                        ofg = ofg1 / ofg2;
                        oku = 1;

                    }
                    else if(oku  ==1 && !arit.equals("/"))
                    {
                        double oki = Double.valueOf(mTextView.getText().toString());

                        switch (arit)
                        {

                            case "+":
                                ofg = ofg + oki;
                                break;
                            case "-":
                                ofg = ofg - oki;
                                break;
                            case "*":
                                ofg = ofg * oki;
                                break;
                            default:
                                answer = 0;
                                break;
                        }
                        arit = "/";

                    }
                    else
                    {
                        double oki = Double.valueOf(mTextView.getText().toString());
                        ofg = ofg /oki;
                    }




                    // = ofg1  +  ofg2;



                    mTextView.setText(String.valueOf(ofg).replaceFirst("\\.0+$", ""));
                    renew = "reset";

                }



                //System.out.println(numbers.size());


                checker = 0;


            }
        });

        mtimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // int num = Integer.valueOf(mTextView.getText().toString());

                num = mTextView.getText().toString();
                numbers.add(num);

                if(dect == 0)
                {
                    mTextView.setText("0");
                    dect = 1;
                    arit = "*";
                }
                else
                {
                    numbers.add(mTextView.getText().toString());

                    double ofg1 = Double.valueOf(numbers.get(0));


                    double ofg2 = Double.valueOf(numbers.get(1));

                    if(oku  ==0) {
                        ofg = ofg1 * ofg2;
                        oku = 1;

                    }
                    else if(oku  ==1 && !arit.equals("*"))
                    {
                        double oki = Double.valueOf(mTextView.getText().toString());

                        switch (arit)
                        {

                            case "+":
                                ofg = ofg + oki;
                                break;
                            case "-":
                                ofg = ofg - oki;
                                break;
                            case "/":
                                ofg = ofg / oki;
                                break;
                            default:
                                answer = 0;
                                break;
                        }
                        arit = "*";

                    }
                    else
                    {
                        double oki = Double.valueOf(mTextView.getText().toString());
                        ofg = oki * ofg;
                    }




                    // = ofg1  +  ofg2;



                    mTextView.setText(String.valueOf(ofg).replaceFirst("\\.0+$", ""));
                    renew = "reset";

                }




                //System.out.println(numbers.size());


                checker = 0;


            }
        });

        //dot button
        mdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num = mTextView.getText().toString();
                if (!num.contains(".") && dotter == 1) {
                    mTextView.append(".");

                } else if (dotter == 0) {
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

                //int num = Integer.valueOf(mTextView.getText().toString());
                String num = mTextView.getText().toString();

                double cal;
                double cal2;

                numbers.add(num);


                answer = 0;


               if(num.contains("e"))
               {
                 double ef = Double.valueOf(numbers.get(0));


                   answer = ef * mAE;
               }

               else if(num.contains("π")) {


                   double ef = Double.valueOf(numbers.get(0));
                   answer = ef * mEpie;


               }

               else if(num.equals("0"))
               {



                   answer = 0;




               }


               else if(ee == 1)
               {


                   double ef = Double.valueOf(numbers.get(0));
                   double ef2 = Double.valueOf(numbers.get(1));

                   answer = ef * Math.pow(10,ef2);

                   ee =0;

               }

               else if(mMXY==1)
               {


                   double ef = Double.valueOf(numbers.get(0));
                   double ef2 = Double.valueOf(mTextView.getText().toString());

                   answer = Math.pow(ef,ef2);

                     mMXY = 0;


               }
               else if(numbers.size() > 2)
               {
                   double oki = Double.valueOf(mTextView.getText().toString());

                   switch (arit)
                   {
                       case "+":
                           answer = ofg + oki;


                           break;
                       case "-":
                           answer = ofg - oki;
                           break;
                       case "/":
                           answer = ofg / oki;
                           break;
                       case "*":
                           answer = ofg * oki;
                           break;
                       default:
                           answer = 0;
                           break;
                   }
               }

               else if (numbers.size() == 0 || numbers.size() == 1)
                {
                    double num1 = Double.valueOf(mTextView.getText().toString());
                    answer = num1;

                    if(arit == null)
                    {
                        answer = num1;
                    }
                    else
                    {


                        switch (arit)
                        {
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
                }
                else {

                    cal = Double.valueOf(numbers.get(0));

                    cal2 = Double.valueOf(numbers.get(1));
                    cal5 = Double.valueOf(numbers.get(1));


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
                dect = 0;
                ofg =0;
                oku=0;


            }
        });

        //cancel
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                numbers.clear();
                mTextView.setText("0");
                checker = 0;
                dect = 0;
                ofg =0;
                oku=0;


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

                answer = cal / 100;

                String ok = Double.valueOf(answer).toString();


                mTextView.setText(ok);

                numbers.clear();
                renew = "reset";


            }
        });


        //plus or minus
        mplusMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String ok = mTextView.getText().toString();


                if (!ok.equals("0"))

                {

                    if (!ok.contains("-")) {

                        mTextView.setText("-" + mTextView.getText());


                    } else {
                        String newer = String.valueOf(mTextView.getText()).replace("-", "");
                        mTextView.setText(newer);


                    }


                }

            }

        });


  /*      mport.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent mIntent = new Intent(CalculatorMainActivity.this,moreActivity.class);
                String getMe = String.valueOf(mTextView.getText());
                mIntent.putExtra(moreActivity, getMe);
                String getMe2 = String.valueOf(mmMemory.getDataMemory());

                mIntent.putExtra(note,getMe2);
                startActivity(mIntent);



            }

        });*/

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

                memory = memory + ok;



            }

        });

        mMemoryminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double ok = Double.valueOf(mTextView.getText().toString());

                //  mMemory = mMemory - ok;


                memory = memory - ok;

            }

        });


        mMemoryclear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //  mMemory = 0;

                memory = 0;
            }

        });


        mMemoryrecall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String ok = String.valueOf(memory).replaceFirst("\\.0+$", "");

                mTextView.setText(ok);




            }

        });


        boolean landscape = getResources().getBoolean(R.bool.isLandscape);
        if (landscape) {


              mx3.setText("X\u00B3");
            mSin1.setText("sin\u02C9\u00B9");
            mSinh1.setText("sinh\u02C9\u00B9");
            mCos1.setText("cos\u02C9\u00B9");
            mCosh1.setText("cosh\u02C9\u00B9");
            mTan1.setText("tan\u02C9\u00B9");
            mTanh1.setText("tanh\u02C9\u00B9");
            mLog.setText("Log\u2081\u2080");
            mLog2.setText("Log\u2082");

            mx3.setVisibility(View.GONE);
            mEx.setVisibility(View.GONE);
            m10X.setVisibility(View.GONE);
            mLog2.setVisibility(View.GONE);
            mSin1.setVisibility(View.GONE);
            mCos1.setVisibility(View.GONE);
            mTan1.setVisibility(View.GONE);
            mSinh1.setVisibility(View.GONE);
            mCosh1.setVisibility(View.GONE);
            mTanh1.setVisibility(View.GONE);

            if(radeg == 1)
            {
                mDeg.setBackgroundColor(Color.RED);
            }

            mRad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mRad.setBackgroundColor(Color.RED);
                    mDeg.setBackgroundColor(Color.DKGRAY);
                    radeg = 0;


                }
            });


            mDeg.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    mDeg.setBackgroundColor(Color.RED);
                    mRad.setBackgroundColor(Color.DKGRAY);

                    radeg = 1;

                }
            });



            mE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    String ok = mTextView.getText().toString();

                    if (ok.equals("0")) {
                        String me = String.valueOf(mAE);

                        mTextView.setText(me);
                    } else {


                        numbers.add(ok);

                        if (!ok.contains("e") && !ok.equals("0")) {
                            mTextView.append("e");

                        } else if (ok.contains("0")) {
                            mTextView.setText("e");

                        }
                        renew = "noreset";

                    }
                }
            });


            mPie.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {


                    String ok = mTextView.getText().toString();




                    if (ok.equals("0"))
                    {
                        String pie = String.valueOf(mEpie);
                        mTextView.setText(pie);
                    }
                    else
                    {
                        numbers.add(ok);

                        if (!ok.contains("π") && !ok.equals("0"))
                        {
                            mTextView.append("π");

                        } else if (ok.contains("0"))
                        {
                            mTextView.setText("π");

                        }
                        renew = "noreset";

                    }

                }


            });


            mSin.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    if(radeg == 1) {
                        double newer = Math.toRadians(ok);
                        answer2 = String.valueOf(Math.sin(newer)).replaceFirst("\\.0+$", "");
                    }
                    else
                    {
                        answer2 = String.valueOf(Math.sin(ok)).replaceFirst("\\.0+$", "");
                    }

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }


            });

            mCos.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    if(radeg == 1) {
                        double newer = Math.toRadians(ok);
                        answer2 = String.valueOf(Math.cos(newer)).replaceFirst("\\.0+$", "");
                    }
                    else
                    {
                        answer2 = String.valueOf(Math.cos(ok)).replaceFirst("\\.0+$", "");
                    }

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });



            mTan.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    if(radeg == 1) {
                       double newer = Math.toRadians(ok);

                        answer2 =String.valueOf(Math.tan(newer)).replaceFirst("\\.0+$", "");
                       // answer2 = String.valueOf(Math.tan(newer)).replaceFirst("\\.0+$", "");
                    }
                    else
                    {

                        answer2 = String.valueOf(Math.tan(ok)).replaceFirst("\\.0+$", "");
                    }

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });


            mSin1.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    if(radeg == 1) {
                        double newer = Math.toRadians(ok);
                        answer2 = String.valueOf(Math.toDegrees(Math.asin(newer * 180 / Math.PI))).replaceFirst("\\.0+$", "");
                    }
                    else
                    {
                        answer2 = String.valueOf(Math.asin(ok * 180 / Math.PI)).replaceFirst("\\.0+$", "");
                    }

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }


            });

            mCos1.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    if(radeg == 1) {
                        double newer = Math.toRadians(ok);
                        answer2 = String.valueOf(Math.toDegrees(Math.acos(newer * 180 / Math.PI))).replaceFirst("\\.0+$", "");
                    }
                    else
                    {
                        answer2 = String.valueOf(Math.acos(ok)).replaceFirst("\\.0+$", "");
                    }

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });



            //Inverse Tan
            mTan1.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    if(radeg == 1) {
                        double newer = Math.toRadians(ok);

                        answer2 = String.valueOf(Math.toDegrees(Math.atan(newer * 180 / Math.PI))).replaceFirst("\\.0+$", "");
                        // answer2 = String.valueOf(Math.tan(newer)).replaceFirst("\\.0+$", "");
                    }
                    else
                    {

                        answer2 = String.valueOf(Math.atan(ok)).replaceFirst("\\.0+$", "");
                    }

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });


            mSinh.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());


                        answer2 = String.valueOf(Math.sinh(ok)).replaceFirst("\\.0+$", "");

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }


            });

            mCosh.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());

                        answer2 = String.valueOf(Math.cosh(ok)).replaceFirst("\\.0+$", "");

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });



            mTanh.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());

                    answer2 = String.valueOf(Math.tanh(ok)).replaceFirst("\\.0+$", "");

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });


            mSinh1.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());


                    answer2 = String.valueOf(Math.log(ok + Math.sqrt(ok * ok + 1.0))).replaceFirst("\\.0+$", "");

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }


            });

            mCosh1.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());

                    answer2 = String.valueOf(Math.log(ok + Math.sqrt(ok * ok - 1.0))).replaceFirst("\\.0+$", "");

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });



            mTanh1.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());

                    answer2 = String.valueOf(0.5 * Math.log( (ok + 1.0) / (ok - 1.0) )).replaceFirst("\\.0+$", "");

                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });


            mRand.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    Random rand = new Random();


                        double randomNum = rand.nextDouble();

                        //System.out.println(randomNum);
                    answer2 = String.valueOf(randomNum);


                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });


            mLog.setOnClickListener(new View.OnClickListener()
            {
                String answer2;
                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());

                        answer2 = String.valueOf(Math.log10(ok)).replaceFirst("\\.0+$", "");


                    mTextView.setText(answer2);
                    numbers.clear();
                    renew = "reset";

                }

            });


            mX.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    double fact = 1;
                    for (double i = 1; i <= ok; i++) {

                        fact *= i;

                    }
                    String answer = String.valueOf(fact).replaceFirst("\\.0+$", "");
                    mTextView.setText(answer);
                    numbers.clear();
                    renew = "reset";


                }

            });

            mEx.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    double fact = Math.pow(mAE,ok);


                    String answer = String.valueOf(fact).replaceFirst("\\.0+$", "");
                    mTextView.setText(answer);
                    numbers.clear();
                    renew = "reset";


                }

            });

            m10X.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    double fact = Math.pow(10,ok);


                    String answer = String.valueOf(fact).replaceFirst("\\.0+$", "");
                    mTextView.setText(answer);
                    numbers.clear();
                    renew = "reset";


                }

            });

            mx3.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    double fact = Math.pow(ok,3);


                    String answer = String.valueOf(fact).replaceFirst("\\.0+$", "");
                    mTextView.setText(answer);
                    numbers.clear();
                    renew = "reset";


                }

            });

            mLog2.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());
                    
                    double fact = Math.log(ok) / Math.log(2);


                    String answer = String.valueOf(fact).replaceFirst("\\.0+$", "");
                    mTextView.setText(answer);
                    numbers.clear();
                    renew = "reset";


                }

            });

            mLn.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    double ok = Double.valueOf(mTextView.getText().toString());

                    String answer = String.valueOf(Math.log(ok)).replaceFirst("\\.0+$", "");
                    mTextView.setText(answer);
                    numbers.clear();
                    renew = "reset";


                }

            });



            mXy.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                   String ok = mTextView.getText().toString();

                    numbers.add(ok);
                    mTextView.setText("0");
                    mMXY = 1;

                }

            });

            mOB.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    String ok = mTextView.getText().toString();
                    numbers.add(ok);
                    mTextView.setText("0");
                    ee = 1;


                }

            });
            mCB.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    String ok = mTextView.getText().toString();

                    double answer = 1/Double.valueOf(ok);

                    mTextView.setText(String.valueOf(answer));

                }

            });


            mInv.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    if(unlock == 0)
                    {
                        mXy.setVisibility(View.GONE);
                        mLog.setVisibility(View.GONE);
                        mE.setVisibility(View.GONE);
                        mX.setVisibility(View.GONE);
                        mSin.setVisibility(View.GONE);
                        mCos.setVisibility(View.GONE);
                        mTan.setVisibility(View.GONE);
                        mSinh.setVisibility(View.GONE);
                        mCosh.setVisibility(View.GONE);
                        mTanh.setVisibility(View.GONE);


                        mx3.setVisibility(View.VISIBLE);
                        mEx.setVisibility(View.VISIBLE);
                        m10X.setVisibility(View.VISIBLE);
                        mLog2.setVisibility(View.VISIBLE);
                        mSin1.setVisibility(View.VISIBLE);
                        mCos1.setVisibility(View.VISIBLE);
                        mTan1.setVisibility(View.VISIBLE);
                        mSinh1.setVisibility(View.VISIBLE);
                        mCosh1.setVisibility(View.VISIBLE);
                        mTanh1.setVisibility(View.VISIBLE);
                        mInv.setBackgroundColor(Color.RED);


                        unlock =1;
                    }
                    else
                    {
                        mXy.setVisibility(View.VISIBLE);
                        mLog.setVisibility(View.VISIBLE);
                        mE.setVisibility(View.VISIBLE);
                        mX.setVisibility(View.VISIBLE);
                        mSin.setVisibility(View.VISIBLE);
                        mCos.setVisibility(View.VISIBLE);
                        mTan.setVisibility(View.VISIBLE);
                        mSinh.setVisibility(View.VISIBLE);
                        mCosh.setVisibility(View.VISIBLE);
                        mTanh.setVisibility(View.VISIBLE);


                        mx3.setVisibility(View.GONE);
                        mEx.setVisibility(View.GONE);
                        m10X.setVisibility(View.GONE);
                        mLog2.setVisibility(View.GONE);
                        mSin1.setVisibility(View.GONE);
                        mCos1.setVisibility(View.GONE);
                        mTan1.setVisibility(View.GONE);
                        mSinh1.setVisibility(View.GONE);
                        mCosh1.setVisibility(View.GONE);
                        mTanh1.setVisibility(View.GONE);
                        mInv.setBackgroundColor(Color.DKGRAY);

                        unlock = 0;
                    }


                }

            });

        }


        // Restore UI state from the savedInstanceState.
        if (savedInstanceState != null)
        {
            String strValue = savedInstanceState.getString("name");
            if (strValue != null)
            {
                mTextView.setText(strValue);
            }

            strValue = savedInstanceState.getString("memo");
            if (strValue != null)
            {
                memory = Double.valueOf(strValue);
            }

            strValue = savedInstanceState.getString("mlist");
            if (strValue != null)
            {
                numbers.add(strValue);
            }

            strValue = savedInstanceState.getString("marit");
            if (strValue != null)
            {
                arit = strValue;
            }

        }
    }


    public void onSaveInstanceState(Bundle savedInstanceState) {

        String textm = mTextView.getText().toString();
        String mMemory = String.valueOf(memory);
        String arit2 = arit;

        ArrayList<String> numberds = new ArrayList<>();

        if(numbers.size() >= 1)
        {
            numberds.add(numbers.get(0));
            String omarion = numberds.get(0);
            savedInstanceState.putString("mlist", omarion);
        }


        savedInstanceState.putString("name", textm);
        savedInstanceState.putString("memo", mMemory);
        savedInstanceState.putString("marit", arit2);

        super.onSaveInstanceState(savedInstanceState);

    }



}






