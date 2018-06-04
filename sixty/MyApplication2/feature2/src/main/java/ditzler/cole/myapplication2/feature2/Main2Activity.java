package ditzler.cole.myapplication2.feature2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import android.widget.ImageView;
import java.text.DecimalFormat;
import java.util.Random;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView t;
    private static final int BASE = 60;
    private static final String ANSWER_STRING = "%s %s %s is %s so %s,%s,%s,%s,%s,%s,%s,%s,%s";
    private static final String ANSWER_STRINGS = "%s %s %s is %s %s so %s,%s,%s,%s,%s,%s,%s,%s,%s";
    private static final String Warn_Warning = "%s";
    private static double a = 0;
    private static double b = 0;
    private static double c = 0;
    private static double d = 0;
    private static EditText inputBox1;
    private static EditText inputBox2;
    private static TextView answerView;
    private static TextView WarningBox;
    private static int resultingNumberOfSixtys;
    private static long resultingRemainderOfSixtys;
    private static int UltraDummy = 1;
    private static int F;
    private static int N;
    private static int G;
    private static int L;
    private static int Q;
    private static int J;
    private static int H;
    private static int S;
    private static int P;
    private static int M;
    private static int O;
    private static int Y;
    private static int p;
    private static int last;
    private static int dlast;
    private static int sH;
    private static int Sh;
    private static int resultingRemainderOfSixties;
    private static int resultingNumberOfSixties;
    private static int resultingNumberOfSixds;
    private static int RzDg;
    private static int gezultingNextDigit;
    private static int resultingNextzDigit;
    private static int RzoDg;
    private static long Blank;
    private static long rezultingNextDigit;
    private static int resultingNextDigit;
    private static long resultingNextsDigit;
    private static int x;
    private static int X;
    private static int u;
    private static int U;
    private static int e;
    private static int E;
    private static int xI = 0;
    private static int XI = 0;
    private static int uI = 0;
    private static int UI = 0;
    private static int eI = 0;
    private static int EI = 0;
    private static int pI = 0;
    private static int XX = 0;
    private static int YY = 0;
    private static int ZZ = 0;
    private static int VV = 0;
    private static int wI = 0;
    private static int WI = 0;
    private static Integer imagos[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59};
    private static Integer Emagos[] = {R.drawable.noerror, R.drawable.error,};
    private static int currImage = 0;
    private static int currentImage = 0;
    private static int ImCurr = 0;
    private static int CurI = 0;
    private static int IC = 0;
    private static int CI = 0;
    private static int OI;
    private static int FI;
    private static int NI;
    private static int GI;
    private static int LI;
    private static int QI;
    private static int JI;
    private static int HI;
    private static int SI;
    private static int PI;
    private static int MI;
    private static int YI;
    private static int sHI;
    private static int ShI;
    private static int ZZI;
    private static int QQI;
    private static int GGI;
    private static ImageView hImageViewPic;
    private static Button btnImageChanger;
    private static Button btnImageChangess;
    private  ImageView hIm;
    private ImageView yIm;
    private ImageView nIm;
    private ImageView qIm;
    private ImageView zIm;
    private ImageView fIm;
    private ImageView pIm;
    private ImageView Fim;
    private ImageView Yim;
    private ImageView Nim;
    private ImageView Gim;
    private ImageView Lim;
    private ImageView Qim;
    private ImageView Jim;
    private ImageView Him;
    private ImageView Sim;
    private ImageView Pim;
    private ImageView Mim;
    private ImageView Oim;
    private ImageView ShIm;
    private ImageView sHIm;
    private ImageView EIm;
    private ImageView eIm;
    private ImageView QQIm;
    private ImageView ZZIm;
    private ImageView Exim;
    private ImageView FFIm;
    private static int Blanco;
    private static int RI;
    private static final String dummy = "";
    final int mina = 0;
    final int maxa = 60;
    final int minb = 0;
    final int maxb = 60;
    private int randa = 0;
    private int randb = 0;
    private static int FF = 0;
    private static int GG = 0;
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initializeElements();
        enableGenerate();
        enableCountess();
        enableMultiply();
        enableDivide();
        enableAdd();
        enableSubtract();
        enableCount();
        Exim = (ImageView) findViewById(R.id.EA);
        Fim = (ImageView) findViewById(R.id.SV1);
        Nim = (ImageView) findViewById(R.id.SV2);
        Gim = (ImageView) findViewById(R.id.SV3);
        Lim = (ImageView) findViewById(R.id.SV4);
        Qim = (ImageView) findViewById(R.id.SV5);
        Oim = (ImageView) findViewById(R.id.VS1);
        ShIm = (ImageView) findViewById(R.id.L1);
        eIm = (ImageView) findViewById(R.id.E1);
        Jim = (ImageView) findViewById(R.id.SV6);
        Him = (ImageView) findViewById(R.id.SV7);
        Sim = (ImageView) findViewById(R.id.SV8);
        Pim = (ImageView) findViewById(R.id.SV9);
        Mim = (ImageView) findViewById(R.id.SV0);
        Yim = (ImageView) findViewById(R.id.VS2);
        sHIm = (ImageView) findViewById(R.id.L2);
        EIm = (ImageView) findViewById(R.id.E2);
        yIm = (ImageView) findViewById(R.id.imageView1);
        hIm = (ImageView) findViewById(R.id.imageView2);
        nIm = (ImageView) findViewById(R.id.imageView3);
        qIm = (ImageView) findViewById(R.id.imageView4);
        zIm = (ImageView) findViewById(R.id.imageView5);
        fIm = (ImageView) findViewById(R.id.imageView6);
        pIm = (ImageView) findViewById(R.id.imageView7);
        ZZIm = (ImageView) findViewById(R.id.imageView8);
        QQIm = (ImageView) findViewById(R.id.E4);
        FFIm = (ImageView) findViewById(R.id.E3);


        btnImageChanger = (Button) findViewById(R.id.btnImageChanger);
        btnImageChangess = (Button) findViewById(R.id.btn2);
    }
        public void setText1(EditText inputBox1,int randa) {
            inputBox1.setText(randa);
        }

        public void setText2(EditText inputBox2,int randb){
        inputBox2.setText(randb);
        }

    public void initializeElements() {
        inputBox1 = findViewById(R.id.int1);
        inputBox2 = findViewById(R.id.int2);
        answerView = findViewById(R.id.answer);
        WarningBox = findViewById(R.id.EX);


    }
    public void enableGenerate () {
        Random rand = new Random();
        randb = (int)  rand.nextInt(60);
        Random rando = new Random();
        randa = (int)  rando.nextInt(60);
    }
    private boolean Check1(EditText inputBox1) {
        return inputBox1.getText().toString().trim().length() == 0;
    }
        private boolean Check2(EditText inputBox2) {
            return inputBox2.getText().toString().trim().length() == 0;
    }

    public void enableMultiply() {

        findViewById(R.id.multiplyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check1(inputBox1);
                Check2(inputBox2);
                if ((a != 0) && !(a < 0));{
                    Random rando = new Random();
                    randa = (int)  rando.nextInt(60);
                }
                if (!(b == 0) && !(b < 0));{
                    Random rand = new Random();
                    randb = (int)  rand.nextInt(60);
                }

                getInputValues();
                final double product = a * b;
                final double suk = b;
                sixtyifz(suk);
                sixtyify(product);
                final double sua = a;
                sixtyifa(sua);

                getAnswer("X", product, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                UltraDummy = 1;
                Exim.setImageResource(Emagos[UltraDummy]);
                JI = J % imagos.length;
                Jim.setImageResource(imagos[JI]);
                FI = F % imagos.length;
                Fim.setImageResource(imagos[FI]);
                xI = x % imagos.length;
                yIm.setImageResource(imagos[xI]);
                        if (YY >= 1) {
                            wI = 1;
                        } else if (YY == 0) {
                            wI = 0;
                        }

                        if (XX >= 1) {
                            WI = 1;
                        } else if (XX == 0) {
                            WI = 0;
                        }

                        if (GG >= 1 || VV != 0) {
                        GGI = 1;
                        } else if (GG ==0) {
                        GGI = 0;
                }
                        QQIm.setImageResource(Emagos[GGI]);
                        eIm.setImageResource(Emagos[WI]);
                        EIm.setImageResource(Emagos[wI]);

                        if (N >= 1) {
                            NI = N % imagos.length;
                            Nim.setImageResource(imagos[NI]);
                        } else if (N == 0 && G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                            NI = N % imagos.length;
                            Nim.setImageResource(Emagos[NI]);
                        } else {
                            NI = N % imagos.length;
                            Nim.setImageResource(imagos[NI]);
                        }
                        if (G >= 1) {
                            GI = G % imagos.length;
                            Gim.setImageResource(imagos[GI]);
                        } else if (G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                            GI = G % imagos.length;
                            Gim.setImageResource(Emagos[GI]);
                        } else {
                            GI = G % imagos.length;
                            Gim.setImageResource(imagos[GI]);
                        }
                        if (L >= 1) {
                            LI = L % imagos.length;
                            Lim.setImageResource(imagos[LI]);
                        } else if (L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                            LI = L % imagos.length;
                            Lim.setImageResource(Emagos[LI]);
                        } else {
                            LI = L % imagos.length;
                            Lim.setImageResource(imagos[LI]);
                        }
                        if (Q >= 1) {
                            QI = Q % imagos.length;
                            Qim.setImageResource(imagos[QI]);
                        } else if (Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                            QI = Q % imagos.length;
                            Qim.setImageResource(Emagos[QI]);
                        } else {
                            QI = Q % imagos.length;
                            Qim.setImageResource(imagos[QI]);
                        }
                        if (O >= 1) {
                            OI = O % imagos.length;
                            Oim.setImageResource(imagos[OI]);
                        } else if (O == 0 && Sh == 0 && YY == 0) {
                            OI = O % imagos.length;
                            Oim.setImageResource(Emagos[OI]);
                        } else {
                            OI = O % imagos.length;
                            Oim.setImageResource(imagos[OI]);
                        }
                        if (Sh >= 1) {
                            ShI = Sh % imagos.length;
                            ShIm.setImageResource(imagos[ShI]);
                        } else if (Sh == 0 && YY == 0) {
                            ShI = Sh % imagos.length;
                            ShIm.setImageResource(Emagos[ShI]);
                        } else {
                            ShI = Sh % imagos.length;
                            ShIm.setImageResource(imagos[ShI]);
                        }
                        if (H >= 1) {
                            HI = H % imagos.length;
                            Him.setImageResource(imagos[HI]);
                        } else if (H == 0 && S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                            HI = H;
                            Him.setImageResource(Emagos[HI]);
                        } else {
                            HI = (H % imagos.length);
                            Him.setImageResource(imagos[HI]);
                        }
                        if (S >= 1) {
                            SI = S % imagos.length;
                            Sim.setImageResource(imagos[SI]);
                        } else if (S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                            SI = S;
                            Sim.setImageResource(Emagos[SI]);
                        } else {
                            SI = (S % imagos.length);
                            Sim.setImageResource(imagos[SI]);
                        }
                        if (P >= 1) {
                            PI = P % imagos.length;
                            Pim.setImageResource(imagos[PI]);
                        } else if (P == 0 && M == 0 && Y == 0 && sH == 0) {
                            PI = P;
                            Pim.setImageResource(Emagos[PI]);
                        } else {
                            PI = (P % imagos.length);
                            Pim.setImageResource(imagos[PI]);
                        }
                        if (M >= 1) {
                            MI = M % imagos.length;
                            Mim.setImageResource(imagos[MI]);
                        } else if (M == 0 && Y == 0 && sH == 0) {
                            MI = M;
                            Mim.setImageResource(Emagos[MI]);
                        } else {
                            MI = (M % imagos.length);
                            Mim.setImageResource(imagos[MI]);
                        }
                        if (Y >= 1) {
                            YI = Y % imagos.length;
                            Yim.setImageResource(imagos[YI]);
                        } else if (Y == 0 && sH == 0) {
                            YI = Y;
                            Yim.setImageResource(Emagos[YI]);
                        } else {
                            YI = (Y % imagos.length);
                            Yim.setImageResource(imagos[YI]);
                        }
                        if (sH >= 1) {
                            sHI = sH % imagos.length;
                            sHIm.setImageResource(imagos[sHI]);
                        } else if (sH == 0) {
                            sHI = sH;
                            sHIm.setImageResource(Emagos[sHI]);
                        } else {
                            sHI = (H % imagos.length);
                            sHIm.setImageResource(imagos[sHI]);
                        }
                    if (FF >= 1 || VV != 0) {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(imagos[QQI]);
                    } else if (last == 0 && FF == 0 && GG == 0 ) {
                    QQI = 0;
                        FFIm.setImageResource(Emagos[QQI]);
                    } else {
                        QQI = (FF % imagos.length);
                        FFIm.setImageResource(Emagos[QQI]);
                    }
                        if (p >= 1 || VV != 0) {
                            pI = (p % imagos.length);
                            pIm.setImageResource(imagos[pI]);
                        } else if (last == 0 && FF == 0 && GG == 0) {
                            pI = 0;
                            pIm.setImageResource(Emagos[pI]);
                        } else {
                            pI = (p % imagos.length);
                            pIm.setImageResource(imagos[pI]);
                        }
                        if (ZZ >= 1 || VV != 0) {
                            ZZI = (ZZ % imagos.length);
                            ZZIm.setImageResource(imagos[ZZI]);
                        } else if (ZZ == 0 && FF == 0 && last == 0 && GG == 0) {
                            ZZI = 0;
                            ZZIm.setImageResource(Emagos[ZZI]);
                        } else {
                            ZZI = (ZZ % imagos.length);
                            ZZIm.setImageResource(imagos[ZZI]);
                        }
                        if (E >= 1 || VV != 0) {
                            EI = (E % imagos.length);
                            fIm.setImageResource(imagos[EI]);
                        } else if (E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                            EI = 0;
                            fIm.setImageResource(Emagos[EI]);
                        } else {
                            EI = (E % imagos.length);
                            fIm.setImageResource(imagos[EI]);
                        }
                        if (e >= 1 || VV != 0) {
                            eI = (e % imagos.length);
                            zIm.setImageResource(imagos[eI]);
                        } else if (e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                            eI = 0;
                            zIm.setImageResource(Emagos[eI]);
                        } else {
                            eI = (e % imagos.length);
                            zIm.setImageResource(imagos[eI]);
                        }
                        if (U >= 1 || VV != 0) {
                            UI = (U % imagos.length);
                            qIm.setImageResource(imagos[UI]);
                        } else if (U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                            UI = 0;
                            qIm.setImageResource(Emagos[UI]);
                        } else {
                            UI = (U % imagos.length);
                            qIm.setImageResource(imagos[UI]);
                        }
                        if (u >= 1 || VV != 0) {
                            uI = (u % imagos.length);
                            nIm.setImageResource(imagos[uI]);
                        } else if (u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                            uI = 0;
                            nIm.setImageResource(Emagos[uI]);
                        } else {
                            uI = (u % imagos.length);
                            nIm.setImageResource(imagos[uI]);
                        }
                        if (X >= 1 || VV != 0) {
                            XI = (X % imagos.length);
                            hIm.setImageResource(imagos[XI]);
                        } else if (X == 0 && u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                            XI = 0;
                            hIm.setImageResource(Emagos[XI]);
                        } else {
                            XI = (X % imagos.length);
                            hIm.setImageResource(imagos[XI]);
                        }

                }


        });
    }

    public void enableDivide() {

        findViewById(R.id.divideButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final double sum = a / b;
                sixtyify(sum);
                final double suk = b;
                sixtyifz(suk);
                final double sua = a;
                sixtyifa(sua);
                getAnswer("/", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                UltraDummy = 1;
                Exim.setImageResource(Emagos[UltraDummy]);
                JI = J % imagos.length;
                Jim.setImageResource(imagos[JI]);
                FI = F % imagos.length;
                Fim.setImageResource(imagos[FI]);
                xI = x % imagos.length;
                yIm.setImageResource(imagos[xI]);
                if (YY >= 1) {
                    wI = 1;
                } else if (YY == 0) {
                    wI = 0;
                }

                if (XX >= 1) {
                    WI = 1;
                } else if (XX == 0) {
                    WI = 0;
                }

                if (GG >= 1 || VV != 0) {
                    GGI = 1;
                } else if (GG ==0) {
                    GGI = 0;
                }
                QQIm.setImageResource(Emagos[GGI]);
                eIm.setImageResource(Emagos[WI]);
                EIm.setImageResource(Emagos[wI]);

                if (N >= 1) {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                } else if (N == 0 && G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    NI = N % imagos.length;
                    Nim.setImageResource(Emagos[NI]);
                } else {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                }
                if (G >= 1) {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                } else if (G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    GI = G % imagos.length;
                    Gim.setImageResource(Emagos[GI]);
                } else {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                }
                if (L >= 1) {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                } else if (L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    LI = L % imagos.length;
                    Lim.setImageResource(Emagos[LI]);
                } else {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                }
                if (Q >= 1) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                } else if (Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(Emagos[QI]);
                } else {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                }
                if (O >= 1) {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                } else if (O == 0 && Sh == 0 && YY == 0) {
                    OI = O % imagos.length;
                    Oim.setImageResource(Emagos[OI]);
                } else {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                }
                if (Sh >= 1) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                } else if (Sh == 0 && YY == 0) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(Emagos[ShI]);
                } else {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                }
                if (H >= 1) {
                    HI = H % imagos.length;
                    Him.setImageResource(imagos[HI]);
                } else if (H == 0 && S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    HI = H;
                    Him.setImageResource(Emagos[HI]);
                } else {
                    HI = (H % imagos.length);
                    Him.setImageResource(imagos[HI]);
                }
                if (S >= 1) {
                    SI = S % imagos.length;
                    Sim.setImageResource(imagos[SI]);
                } else if (S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    SI = S;
                    Sim.setImageResource(Emagos[SI]);
                } else {
                    SI = (S % imagos.length);
                    Sim.setImageResource(imagos[SI]);
                }
                if (P >= 1) {
                    PI = P % imagos.length;
                    Pim.setImageResource(imagos[PI]);
                } else if (P == 0 && M == 0 && Y == 0 && sH == 0) {
                    PI = P;
                    Pim.setImageResource(Emagos[PI]);
                } else {
                    PI = (P % imagos.length);
                    Pim.setImageResource(imagos[PI]);
                }
                if (M >= 1) {
                    MI = M % imagos.length;
                    Mim.setImageResource(imagos[MI]);
                } else if (M == 0 && Y == 0 && sH == 0) {
                    MI = M;
                    Mim.setImageResource(Emagos[MI]);
                } else {
                    MI = (M % imagos.length);
                    Mim.setImageResource(imagos[MI]);
                }
                if (Y >= 1) {
                    YI = Y % imagos.length;
                    Yim.setImageResource(imagos[YI]);
                } else if (Y == 0 && sH == 0) {
                    YI = Y;
                    Yim.setImageResource(Emagos[YI]);
                } else {
                    YI = (Y % imagos.length);
                    Yim.setImageResource(imagos[YI]);
                }
                if (sH >= 1) {
                    sHI = sH % imagos.length;
                    sHIm.setImageResource(imagos[sHI]);
                } else if (sH == 0) {
                    sHI = sH;
                    sHIm.setImageResource(Emagos[sHI]);
                } else {
                    sHI = (H % imagos.length);
                    sHIm.setImageResource(imagos[sHI]);
                }
                if (FF >= 1 || VV != 0) {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(imagos[QQI]);
                } else if (last == 0 && FF == 0 && GG == 0 ) {
                    QQI = 0;
                    FFIm.setImageResource(Emagos[QQI]);
                } else {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(Emagos[QQI]);
                }
                if (p >= 1 || VV != 0) {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                } else if (last == 0 && FF == 0 && GG == 0) {
                    pI = 0;
                    pIm.setImageResource(Emagos[pI]);
                } else {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                }
                if (ZZ >= 1 || VV != 0) {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                } else if (ZZ == 0 && FF == 0 && last == 0 && GG == 0) {
                    ZZI = 0;
                    ZZIm.setImageResource(Emagos[ZZI]);
                } else {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                }
                if (E >= 1 || VV != 0) {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                } else if (E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    EI = 0;
                    fIm.setImageResource(Emagos[EI]);
                } else {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                }
                if (e >= 1 || VV != 0) {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                } else if (e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    eI = 0;
                    zIm.setImageResource(Emagos[eI]);
                } else {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                }
                if (U >= 1 || VV != 0) {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                } else if (U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    UI = 0;
                    qIm.setImageResource(Emagos[UI]);
                } else {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                }
                if (u >= 1 || VV != 0) {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                } else if (u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    uI = 0;
                    nIm.setImageResource(Emagos[uI]);
                } else {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                }
                if (X >= 1 || VV != 0) {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                } else if (X == 0 && u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    XI = 0;
                    hIm.setImageResource(Emagos[XI]);
                } else {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                }

            }
        });
    }

    public void enableAdd() {

        findViewById(R.id.addButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final double sum = a + b;
                sixtyify(sum);
                final double suk = b;
                sixtyifz(suk);
                final double sua = a;
                sixtyifa(sua);

                getAnswer("+", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                UltraDummy = 1;
                Exim.setImageResource(Emagos[UltraDummy]);
                JI = J % imagos.length;
                Jim.setImageResource(imagos[JI]);
                FI = F % imagos.length;
                Fim.setImageResource(imagos[FI]);
                xI = x % imagos.length;
                yIm.setImageResource(imagos[xI]);
                if (YY >= 1) {
                    wI = 1;
                } else if (YY == 0) {
                    wI = 0;
                }

                if (XX >= 1) {
                    WI = 1;
                } else if (XX == 0) {
                    WI = 0;
                }

                if (GG >= 1 || VV != 0) {
                    GGI = 1;
                } else if (GG ==0) {
                    GGI = 0;
                }
                QQIm.setImageResource(Emagos[GGI]);
                eIm.setImageResource(Emagos[WI]);
                EIm.setImageResource(Emagos[wI]);

                if (N >= 1) {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                } else if (N == 0 && G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    NI = N % imagos.length;
                    Nim.setImageResource(Emagos[NI]);
                } else {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                }
                if (G >= 1) {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                } else if (G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    GI = G % imagos.length;
                    Gim.setImageResource(Emagos[GI]);
                } else {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                }
                if (L >= 1) {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                } else if (L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    LI = L % imagos.length;
                    Lim.setImageResource(Emagos[LI]);
                } else {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                }
                if (Q >= 1) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                } else if (Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(Emagos[QI]);
                } else {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                }
                if (O >= 1) {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                } else if (O == 0 && Sh == 0 && YY == 0) {
                    OI = O % imagos.length;
                    Oim.setImageResource(Emagos[OI]);
                } else {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                }
                if (Sh >= 1) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                } else if (Sh == 0 && YY == 0) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(Emagos[ShI]);
                } else {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                }
                if (H >= 1) {
                    HI = H % imagos.length;
                    Him.setImageResource(imagos[HI]);
                } else if (H == 0 && S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    HI = H;
                    Him.setImageResource(Emagos[HI]);
                } else {
                    HI = (H % imagos.length);
                    Him.setImageResource(imagos[HI]);
                }
                if (S >= 1) {
                    SI = S % imagos.length;
                    Sim.setImageResource(imagos[SI]);
                } else if (S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    SI = S;
                    Sim.setImageResource(Emagos[SI]);
                } else {
                    SI = (S % imagos.length);
                    Sim.setImageResource(imagos[SI]);
                }
                if (P >= 1) {
                    PI = P % imagos.length;
                    Pim.setImageResource(imagos[PI]);
                } else if (P == 0 && M == 0 && Y == 0 && sH == 0) {
                    PI = P;
                    Pim.setImageResource(Emagos[PI]);
                } else {
                    PI = (P % imagos.length);
                    Pim.setImageResource(imagos[PI]);
                }
                if (M >= 1) {
                    MI = M % imagos.length;
                    Mim.setImageResource(imagos[MI]);
                } else if (M == 0 && Y == 0 && sH == 0) {
                    MI = M;
                    Mim.setImageResource(Emagos[MI]);
                } else {
                    MI = (M % imagos.length);
                    Mim.setImageResource(imagos[MI]);
                }
                if (Y >= 1) {
                    YI = Y % imagos.length;
                    Yim.setImageResource(imagos[YI]);
                } else if (Y == 0 && sH == 0) {
                    YI = Y;
                    Yim.setImageResource(Emagos[YI]);
                } else {
                    YI = (Y % imagos.length);
                    Yim.setImageResource(imagos[YI]);
                }
                if (sH >= 1) {
                    sHI = sH % imagos.length;
                    sHIm.setImageResource(imagos[sHI]);
                } else if (sH == 0) {
                    sHI = sH;
                    sHIm.setImageResource(Emagos[sHI]);
                } else {
                    sHI = (H % imagos.length);
                    sHIm.setImageResource(imagos[sHI]);
                }
                if (FF >= 1 || VV != 0) {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(imagos[QQI]);
                } else if (last == 0 && FF == 0 && GG == 0 ) {
                    QQI = 0;
                    FFIm.setImageResource(Emagos[QQI]);
                } else {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(Emagos[QQI]);
                }
                if (p >= 1 || VV != 0) {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                } else if (last == 0 && FF == 0 && GG == 0) {
                    pI = 0;
                    pIm.setImageResource(Emagos[pI]);
                } else {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                }
                if (ZZ >= 1 || VV != 0) {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                } else if (ZZ == 0 && FF == 0 && last == 0 && GG == 0) {
                    ZZI = 0;
                    ZZIm.setImageResource(Emagos[ZZI]);
                } else {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                }
                if (E >= 1 || VV != 0) {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                } else if (E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    EI = 0;
                    fIm.setImageResource(Emagos[EI]);
                } else {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                }
                if (e >= 1 || VV != 0) {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                } else if (e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    eI = 0;
                    zIm.setImageResource(Emagos[eI]);
                } else {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                }
                if (U >= 1 || VV != 0) {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                } else if (U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    UI = 0;
                    qIm.setImageResource(Emagos[UI]);
                } else {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                }
                if (u >= 1 || VV != 0) {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                } else if (u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    uI = 0;
                    nIm.setImageResource(Emagos[uI]);
                } else {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                }
                if (X >= 1 || VV != 0) {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                } else if (X == 0 && u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    XI = 0;
                    hIm.setImageResource(Emagos[XI]);
                } else {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                }

            }
        });
    }

    public void enableSubtract() {

        findViewById(R.id.subtractButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final double sum = Math.abs(a - b);
                sixtyify(sum);
                final double suk = b;
                sixtyifz(suk);
                final double sua = a;
                sixtyifa(sua);
                getAnswer("-", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                UltraDummy = 1;
                Exim.setImageResource(Emagos[UltraDummy]);
                JI = J % imagos.length;
                Jim.setImageResource(imagos[JI]);
                FI = F % imagos.length;
                Fim.setImageResource(imagos[FI]);
                xI = x % imagos.length;
                yIm.setImageResource(imagos[xI]);
                if (YY >= 1) {
                    wI = 1;
                } else if (YY == 0) {
                    wI = 0;
                }

                if (XX >= 1) {
                    WI = 1;
                } else if (XX == 0) {
                    WI = 0;
                }

                if (GG >= 1 || VV != 0) {
                    GGI = 1;
                } else if (GG ==0) {
                    GGI = 0;
                }
                QQIm.setImageResource(Emagos[GGI]);
                eIm.setImageResource(Emagos[WI]);
                EIm.setImageResource(Emagos[wI]);

                if (N >= 1) {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                } else if (N == 0 && G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    NI = N % imagos.length;
                    Nim.setImageResource(Emagos[NI]);
                } else {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                }
                if (G >= 1) {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                } else if (G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    GI = G % imagos.length;
                    Gim.setImageResource(Emagos[GI]);
                } else {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                }
                if (L >= 1) {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                } else if (L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    LI = L % imagos.length;
                    Lim.setImageResource(Emagos[LI]);
                } else {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                }
                if (Q >= 1) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                } else if (Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(Emagos[QI]);
                } else {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                }
                if (O >= 1) {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                } else if (O == 0 && Sh == 0 && YY == 0) {
                    OI = O % imagos.length;
                    Oim.setImageResource(Emagos[OI]);
                } else {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                }
                if (Sh >= 1) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                } else if (Sh == 0 && YY == 0) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(Emagos[ShI]);
                } else {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                }
                if (H >= 1) {
                    HI = H % imagos.length;
                    Him.setImageResource(imagos[HI]);
                } else if (H == 0 && S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    HI = H;
                    Him.setImageResource(Emagos[HI]);
                } else {
                    HI = (H % imagos.length);
                    Him.setImageResource(imagos[HI]);
                }
                if (S >= 1) {
                    SI = S % imagos.length;
                    Sim.setImageResource(imagos[SI]);
                } else if (S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    SI = S;
                    Sim.setImageResource(Emagos[SI]);
                } else {
                    SI = (S % imagos.length);
                    Sim.setImageResource(imagos[SI]);
                }
                if (P >= 1) {
                    PI = P % imagos.length;
                    Pim.setImageResource(imagos[PI]);
                } else if (P == 0 && M == 0 && Y == 0 && sH == 0) {
                    PI = P;
                    Pim.setImageResource(Emagos[PI]);
                } else {
                    PI = (P % imagos.length);
                    Pim.setImageResource(imagos[PI]);
                }
                if (M >= 1) {
                    MI = M % imagos.length;
                    Mim.setImageResource(imagos[MI]);
                } else if (M == 0 && Y == 0 && sH == 0) {
                    MI = M;
                    Mim.setImageResource(Emagos[MI]);
                } else {
                    MI = (M % imagos.length);
                    Mim.setImageResource(imagos[MI]);
                }
                if (Y >= 1) {
                    YI = Y % imagos.length;
                    Yim.setImageResource(imagos[YI]);
                } else if (Y == 0 && sH == 0) {
                    YI = Y;
                    Yim.setImageResource(Emagos[YI]);
                } else {
                    YI = (Y % imagos.length);
                    Yim.setImageResource(imagos[YI]);
                }
                if (sH >= 1) {
                    sHI = sH % imagos.length;
                    sHIm.setImageResource(imagos[sHI]);
                } else if (sH == 0) {
                    sHI = sH;
                    sHIm.setImageResource(Emagos[sHI]);
                } else {
                    sHI = (H % imagos.length);
                    sHIm.setImageResource(imagos[sHI]);
                }
                if (FF >= 1 || VV != 0) {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(imagos[QQI]);
                } else if (last == 0 && FF == 0 && GG == 0 ) {
                    QQI = 0;
                    FFIm.setImageResource(Emagos[QQI]);
                } else {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(Emagos[QQI]);
                }
                if (p >= 1 || VV != 0) {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                } else if (last == 0 && FF == 0 && GG == 0) {
                    pI = 0;
                    pIm.setImageResource(Emagos[pI]);
                } else {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                }
                if (ZZ >= 1 || VV != 0) {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                } else if (ZZ == 0 && FF == 0 && last == 0 && GG == 0) {
                    ZZI = 0;
                    ZZIm.setImageResource(Emagos[ZZI]);
                } else {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                }
                if (E >= 1 || VV != 0) {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                } else if (E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    EI = 0;
                    fIm.setImageResource(Emagos[EI]);
                } else {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                }
                if (e >= 1 || VV != 0) {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                } else if (e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    eI = 0;
                    zIm.setImageResource(Emagos[eI]);
                } else {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                }
                if (U >= 1 || VV != 0) {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                } else if (U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    UI = 0;
                    qIm.setImageResource(Emagos[UI]);
                } else {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                }
                if (u >= 1 || VV != 0) {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                } else if (u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    uI = 0;
                    nIm.setImageResource(Emagos[uI]);
                } else {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                }
                if (X >= 1 || VV != 0) {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                } else if (X == 0 && u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    XI = 0;
                    hIm.setImageResource(Emagos[XI]);
                } else {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                }
            }
        });
    }

    public void enableCount() {

        findViewById(R.id.btnImageChanger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final double sum = a % b;
                final double suk = b;
                sixtyifz(suk);
                sixtyify(sum);
                final double sua = a;
                sixtyifa(sua);
                getAnswer("mod", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                UltraDummy = 1;
                Exim.setImageResource(Emagos[UltraDummy]);
                JI = J % imagos.length;
                Jim.setImageResource(imagos[JI]);
                FI = F % imagos.length;
                Fim.setImageResource(imagos[FI]);
                xI = x % imagos.length;
                yIm.setImageResource(imagos[xI]);
                if (YY >= 1) {
                    wI = 1;
                } else if (YY == 0) {
                    wI = 0;
                }

                if (XX >= 1) {
                    WI = 1;
                } else if (XX == 0) {
                    WI = 0;
                }

                if (GG >= 1 || VV != 0) {
                    GGI = 1;
                } else if (GG ==0) {
                    GGI = 0;
                }
                QQIm.setImageResource(Emagos[GGI]);
                eIm.setImageResource(Emagos[WI]);
                EIm.setImageResource(Emagos[wI]);

                if (N >= 1) {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                } else if (N == 0 && G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    NI = N % imagos.length;
                    Nim.setImageResource(Emagos[NI]);
                } else {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                }
                if (G >= 1) {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                } else if (G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    GI = G % imagos.length;
                    Gim.setImageResource(Emagos[GI]);
                } else {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                }
                if (L >= 1) {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                } else if (L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    LI = L % imagos.length;
                    Lim.setImageResource(Emagos[LI]);
                } else {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                }
                if (Q >= 1) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                } else if (Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(Emagos[QI]);
                } else {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                }
                if (O >= 1) {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                } else if (O == 0 && Sh == 0 && YY == 0) {
                    OI = O % imagos.length;
                    Oim.setImageResource(Emagos[OI]);
                } else {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                }
                if (Sh >= 1) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                } else if (Sh == 0 && YY == 0) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(Emagos[ShI]);
                } else {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                }
                if (H >= 1) {
                    HI = H % imagos.length;
                    Him.setImageResource(imagos[HI]);
                } else if (H == 0 && S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    HI = H;
                    Him.setImageResource(Emagos[HI]);
                } else {
                    HI = (H % imagos.length);
                    Him.setImageResource(imagos[HI]);
                }
                if (S >= 1) {
                    SI = S % imagos.length;
                    Sim.setImageResource(imagos[SI]);
                } else if (S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    SI = S;
                    Sim.setImageResource(Emagos[SI]);
                } else {
                    SI = (S % imagos.length);
                    Sim.setImageResource(imagos[SI]);
                }
                if (P >= 1) {
                    PI = P % imagos.length;
                    Pim.setImageResource(imagos[PI]);
                } else if (P == 0 && M == 0 && Y == 0 && sH == 0) {
                    PI = P;
                    Pim.setImageResource(Emagos[PI]);
                } else {
                    PI = (P % imagos.length);
                    Pim.setImageResource(imagos[PI]);
                }
                if (M >= 1) {
                    MI = M % imagos.length;
                    Mim.setImageResource(imagos[MI]);
                } else if (M == 0 && Y == 0 && sH == 0) {
                    MI = M;
                    Mim.setImageResource(Emagos[MI]);
                } else {
                    MI = (M % imagos.length);
                    Mim.setImageResource(imagos[MI]);
                }
                if (Y >= 1) {
                    YI = Y % imagos.length;
                    Yim.setImageResource(imagos[YI]);
                } else if (Y == 0 && sH == 0) {
                    YI = Y;
                    Yim.setImageResource(Emagos[YI]);
                } else {
                    YI = (Y % imagos.length);
                    Yim.setImageResource(imagos[YI]);
                }
                if (sH >= 1) {
                    sHI = sH % imagos.length;
                    sHIm.setImageResource(imagos[sHI]);
                } else if (sH == 0) {
                    sHI = sH;
                    sHIm.setImageResource(Emagos[sHI]);
                } else {
                    sHI = (H % imagos.length);
                    sHIm.setImageResource(imagos[sHI]);
                }
                if (FF >= 1 || VV != 0) {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(imagos[QQI]);
                } else if (last == 0 && FF == 0 && GG == 0 ) {
                    QQI = 0;
                    FFIm.setImageResource(Emagos[QQI]);
                } else {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(Emagos[QQI]);
                }
                if (p >= 1 || VV != 0) {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                } else if (last == 0 && FF == 0 && GG == 0) {
                    pI = 0;
                    pIm.setImageResource(Emagos[pI]);
                } else {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                }
                if (ZZ >= 1 || VV != 0) {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                } else if (ZZ == 0 && FF == 0 && last == 0 && GG == 0) {
                    ZZI = 0;
                    ZZIm.setImageResource(Emagos[ZZI]);
                } else {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                }
                if (E >= 1 || VV != 0) {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                } else if (E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    EI = 0;
                    fIm.setImageResource(Emagos[EI]);
                } else {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                }
                if (e >= 1 || VV != 0) {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                } else if (e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    eI = 0;
                    zIm.setImageResource(Emagos[eI]);
                } else {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                }
                if (U >= 1 || VV != 0) {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                } else if (U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    UI = 0;
                    qIm.setImageResource(Emagos[UI]);
                } else {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                }
                if (u >= 1 || VV != 0) {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                } else if (u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    uI = 0;
                    nIm.setImageResource(Emagos[uI]);
                } else {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                }
                if (X >= 1 || VV != 0) {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                } else if (X == 0 && u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    XI = 0;
                    hIm.setImageResource(Emagos[XI]);
                } else {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                }
            }
        });
    }

    public void enableCountess() {

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInputValues();
                final double sum = ((a / b) * 100);
                final double suk = b;
                sixtyifz(suk);
                sixtyify(sum);
                final double sua = a;
                sixtyifa(sua);
                getAnswers("out of", sum, "%", dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                UltraDummy = 1;
                Exim.setImageResource(Emagos[UltraDummy]);
                JI = J % imagos.length;
                Jim.setImageResource(imagos[JI]);
                FI = F % imagos.length;
                Fim.setImageResource(imagos[FI]);
                xI = x % imagos.length;
                yIm.setImageResource(imagos[xI]);
                if (YY >= 1) {
                    wI = 1;
                } else if (YY == 0) {
                    wI = 0;
                }

                if (XX >= 1) {
                    WI = 1;
                } else if (XX == 0) {
                    WI = 0;
                }

                if (GG >= 1 || VV != 0) {
                    GGI = 1;
                } else if (GG ==0) {
                    GGI = 0;
                }
                QQIm.setImageResource(Emagos[GGI]);
                eIm.setImageResource(Emagos[WI]);
                EIm.setImageResource(Emagos[wI]);

                if (N >= 1) {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                } else if (N == 0 && G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    NI = N % imagos.length;
                    Nim.setImageResource(Emagos[NI]);
                } else {
                    NI = N % imagos.length;
                    Nim.setImageResource(imagos[NI]);
                }
                if (G >= 1) {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                } else if (G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    GI = G % imagos.length;
                    Gim.setImageResource(Emagos[GI]);
                } else {
                    GI = G % imagos.length;
                    Gim.setImageResource(imagos[GI]);
                }
                if (L >= 1) {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                } else if (L == 0 && Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    LI = L % imagos.length;
                    Lim.setImageResource(Emagos[LI]);
                } else {
                    LI = L % imagos.length;
                    Lim.setImageResource(imagos[LI]);
                }
                if (Q >= 1) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                } else if (Q == 0 && O == 0 && Sh == 0 && YY == 0) {
                    QI = Q % imagos.length;
                    Qim.setImageResource(Emagos[QI]);
                } else {
                    QI = Q % imagos.length;
                    Qim.setImageResource(imagos[QI]);
                }
                if (O >= 1) {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                } else if (O == 0 && Sh == 0 && YY == 0) {
                    OI = O % imagos.length;
                    Oim.setImageResource(Emagos[OI]);
                } else {
                    OI = O % imagos.length;
                    Oim.setImageResource(imagos[OI]);
                }
                if (Sh >= 1) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                } else if (Sh == 0 && YY == 0) {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(Emagos[ShI]);
                } else {
                    ShI = Sh % imagos.length;
                    ShIm.setImageResource(imagos[ShI]);
                }
                if (H >= 1) {
                    HI = H % imagos.length;
                    Him.setImageResource(imagos[HI]);
                } else if (H == 0 && S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    HI = H;
                    Him.setImageResource(Emagos[HI]);
                } else {
                    HI = (H % imagos.length);
                    Him.setImageResource(imagos[HI]);
                }
                if (S >= 1) {
                    SI = S % imagos.length;
                    Sim.setImageResource(imagos[SI]);
                } else if (S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0) {
                    SI = S;
                    Sim.setImageResource(Emagos[SI]);
                } else {
                    SI = (S % imagos.length);
                    Sim.setImageResource(imagos[SI]);
                }
                if (P >= 1) {
                    PI = P % imagos.length;
                    Pim.setImageResource(imagos[PI]);
                } else if (P == 0 && M == 0 && Y == 0 && sH == 0) {
                    PI = P;
                    Pim.setImageResource(Emagos[PI]);
                } else {
                    PI = (P % imagos.length);
                    Pim.setImageResource(imagos[PI]);
                }
                if (M >= 1) {
                    MI = M % imagos.length;
                    Mim.setImageResource(imagos[MI]);
                } else if (M == 0 && Y == 0 && sH == 0) {
                    MI = M;
                    Mim.setImageResource(Emagos[MI]);
                } else {
                    MI = (M % imagos.length);
                    Mim.setImageResource(imagos[MI]);
                }
                if (Y >= 1) {
                    YI = Y % imagos.length;
                    Yim.setImageResource(imagos[YI]);
                } else if (Y == 0 && sH == 0) {
                    YI = Y;
                    Yim.setImageResource(Emagos[YI]);
                } else {
                    YI = (Y % imagos.length);
                    Yim.setImageResource(imagos[YI]);
                }
                if (sH >= 1) {
                    sHI = sH % imagos.length;
                    sHIm.setImageResource(imagos[sHI]);
                } else if (sH == 0) {
                    sHI = sH;
                    sHIm.setImageResource(Emagos[sHI]);
                } else {
                    sHI = (H % imagos.length);
                    sHIm.setImageResource(imagos[sHI]);
                }
                if (FF >= 1 || VV != 0) {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(imagos[QQI]);
                } else if (last == 0 && FF == 0 && GG == 0 ) {
                    QQI = 0;
                    FFIm.setImageResource(Emagos[QQI]);
                } else {
                    QQI = (FF % imagos.length);
                    FFIm.setImageResource(Emagos[QQI]);
                }
                if (p >= 1 || VV != 0) {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                } else if (last == 0 && FF == 0 && GG == 0) {
                    pI = 0;
                    pIm.setImageResource(Emagos[pI]);
                } else {
                    pI = (p % imagos.length);
                    pIm.setImageResource(imagos[pI]);
                }
                if (ZZ >= 1 || VV != 0) {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                } else if (ZZ == 0 && FF == 0 && last == 0 && GG == 0) {
                    ZZI = 0;
                    ZZIm.setImageResource(Emagos[ZZI]);
                } else {
                    ZZI = (ZZ % imagos.length);
                    ZZIm.setImageResource(imagos[ZZI]);
                }
                if (E >= 1 || VV != 0) {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                } else if (E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    EI = 0;
                    fIm.setImageResource(Emagos[EI]);
                } else {
                    EI = (E % imagos.length);
                    fIm.setImageResource(imagos[EI]);
                }
                if (e >= 1 || VV != 0) {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                } else if (e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    eI = 0;
                    zIm.setImageResource(Emagos[eI]);
                } else {
                    eI = (e % imagos.length);
                    zIm.setImageResource(imagos[eI]);
                }
                if (U >= 1 || VV != 0) {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                } else if (U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    UI = 0;
                    qIm.setImageResource(Emagos[UI]);
                } else {
                    UI = (U % imagos.length);
                    qIm.setImageResource(imagos[UI]);
                }
                if (u >= 1 || VV != 0) {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                } else if (u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    uI = 0;
                    nIm.setImageResource(Emagos[uI]);
                } else {
                    uI = (u % imagos.length);
                    nIm.setImageResource(imagos[uI]);
                }
                if (X >= 1 || VV != 0) {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                } else if (X == 0 && u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
                    XI = 0;
                    hIm.setImageResource(Emagos[XI]);
                } else {
                    XI = (X % imagos.length);
                    hIm.setImageResource(imagos[XI]);
                }
            }
        });
    }

    public static void caution(final String warning) {


    final String TrueDummy = String.format(Warn_Warning, warning);
     Log.d("Danger",warning);
     WarningBox.setText(warning);

}
    public static void getAnswer(final String sign,
                          final double product,
                          final long dlast,
                          final long last,
                          final long p,
                          final long Blank,
                          final long RzoDg,
                          final long resultingNextDigit,
                          final long resultingNextsDigit,
                          final long numOfSixtys,
                          final long remOfSixtys) {

        final String answer = String.format(ANSWER_STRING, c, sign, d, product, dlast, last, p, Blank, RzoDg, resultingNextsDigit, resultingNextDigit, numOfSixtys, remOfSixtys);
        Log.d("Base60", answer);
        answerView.setText(answer);

    }

    public void getInputValues() {
        b = Long.parseLong(String.valueOf(inputBox1.getText()));
        a = Long.parseLong(String.valueOf(inputBox2.getText()));
        Check1(inputBox1);
        Check2(inputBox2);
        c = a;
        d = b;
    }

    public static void sixtyify(double decimalToBeConverted) {
        resultingNumberOfSixties = (int) Math.floor(decimalToBeConverted / BASE);
        resultingNumberOfSixtys = (int) Math.floor((decimalToBeConverted / BASE) % BASE);
        resultingNumberOfSixds = (int) Math.floor(decimalToBeConverted / BASE);
        resultingRemainderOfSixtys = (long) Math.floor(decimalToBeConverted % BASE);
        resultingRemainderOfSixties = (int) Math.floor(decimalToBeConverted % BASE);
        RzoDg = (int) Math.floor((decimalToBeConverted / 12960000) % BASE);
        RzDg = (int) Math.floor(((decimalToBeConverted % 216000) / 3600) % BASE);
        Blank = (long) Math.floor((decimalToBeConverted / 777600000) % BASE);
        Blanco = (int) Math.floor(decimalToBeConverted / 777600000) % BASE;
        resultingNextDigit = (int) Math.floor(RzDg);
        rezultingNextDigit = (long) Math.floor(decimalToBeConverted / BASE);
        resultingNextsDigit = (long) Math.floor((decimalToBeConverted / 216000) % BASE);
        gezultingNextDigit = (int) Math.floor(decimalToBeConverted / 3600) % BASE;
        resultingNextzDigit = (int) Math.floor((decimalToBeConverted / 216000) % BASE);
        //resultingNextDigit = 30;
        x = (int) Math.floor(decimalToBeConverted % BASE);
        X = (int)  (Math.floor(decimalToBeConverted / BASE) % BASE);
        u = (int)  (Math.floor((decimalToBeConverted / 60) /60 ) % BASE);
        U = (int)  (Math.floor(decimalToBeConverted / 216000)% BASE);
        e = (int)  (Math.floor(decimalToBeConverted / 12960000) % BASE);
        E = (int) (Math.floor(decimalToBeConverted / 777600000) % BASE);
        p = (int) (Math.floor(((decimalToBeConverted / 777600000) / 60 ) % BASE));
        ZZ = (int) (((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) % BASE));
        last = (int) ((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) % BASE);
        FF = (int) ((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) % BASE));
        GG = (int) (((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) /60) % BASE));
        VV = (int) ((((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) /60) /60)));
        dlast = (int) ((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) % BASE));
    }



    public static void getAnswers(final String sign,
                          final double product,
                           final String dummy,
                           final long dlast,
                           final long last,
                           final long p,
                          final long Blank,
                          final long RzoDg,
                          final long resultingNextDigit,
                          final long resultingNextsDigit,
                          final long numOfSixtys,
                          final long remOfSixtys) {

        final String answers = String.format(ANSWER_STRINGS, c, sign, d, product, dummy, dlast, last, p, Blank, RzoDg, resultingNextsDigit, resultingNextDigit, numOfSixtys, remOfSixtys);
        Log.d("%60", answers);
        answerView.setText(answers);

    }
    public static void sixtyifa(double W) {

        J = (int) (Math.floor(W % BASE)% BASE);
        H = (int)  (Math.floor(W / BASE)% BASE);
        S = (int)  (Math.floor(W / 3600)% BASE);
        P = (int)  (Math.floor(W / 216000)% BASE);
        M = (int)  (Math.floor(W / 12960000)% BASE);
        Y = (int) (Math.floor(W / 777600000)% BASE);
        sH = (int) (Math.floor((W / 777600000) / 60 ) % BASE);
        YY = (int) ((Math.floor((W / 777600000) / 60 ) /60) % BASE);


    }

    public static void sixtyifz(double K) {

        F = (int) (Math.floor(K % BASE));
        N = (int)  (Math.floor(K / BASE)% BASE);
        G = (int)  (Math.floor(K / 3600)% BASE);
        L = (int)  (Math.floor(K / 216000)% BASE);
        Q = (int)  (Math.floor(K / 12960000)% BASE);
        O = (int)  (Math.floor(K / 777600000)% BASE);
        Sh = (int) (Math.floor((K / 777600000) / 60 ) % BASE);
        XX = (int) ((Math.floor((K / 777600000) / 60 ) /60) % BASE);
    }

   // public static void sixtyifx(double decimalToBeConverted) {
    //    resultingNumberOfSixties = (int) Math.floor(decimalToBeConverted / BASE);
   //     resultingNumberOfSixtys = (int) Math.floor((decimalToBeConverted / BASE) % BASE);
  //      resultingNumberOfSixds = (int) Math.floor(decimalToBeConverted / BASE);
  //      resultingRemainderOfSixtys = (long) decimalToBeConverted % BASE;
   //     resultingRemainderOfSixties = (int) decimalToBeConverted % BASE;
  //      RzoDg = (int) Math.floor(decimalToBeConverted / 12960000) % BASE;
   //     RzDg = (int) Math.floor(((decimalToBeConverted % 216000) / 3600) % BASE);
  //      Blank = (long) Math.floor(decimalToBeConverted / 777600000) % BASE;
  //      Blanco = (int) Math.floor(decimalToBeConverted / 777600000) % BASE;
  //      resultingNextDigit = (int) Math.floor(RzDg);
  //      rezultingNextDigit = (long) Math.floor(resultingNumberOfSixds / BASE);
  //      resultingNextsDigit = (long) Math.floor((decimalToBeConverted / 216000) % BASE);
  //      gezultingNextDigit = (int) Math.floor(resultingNumberOfSixds / BASE);
  //      resultingNextzDigit = (int) Math.floor((decimalToBeConverted / 216000) % BASE);
   //     //resultingNextDigit = 30;
  //  }
}