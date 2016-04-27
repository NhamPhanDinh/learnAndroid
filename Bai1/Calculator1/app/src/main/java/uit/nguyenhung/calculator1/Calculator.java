package uit.nguyenhung.calculator1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity implements View.OnClickListener {

    private Button mMcButton, mAdditionButton, mSubtractButton, mMrButton, mCButton, mNegativeButton, mDivisionButton, mMultiplicationButton, mMAddButton, mMSubButton;
    private Button mOneButton, mTwoButton, mThreeButton, mFourButton, mFiveButton, mSixButton, mSevenButton, mEightButton, mNiceButton;
    private TextView mScreenTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        findViewById();
    }

    void findViewById() {

        mScreenTextView = (TextView) findViewById(R.id.screen_textview);

        mMcButton = (Button) this.findViewById(R.id.mc_button);
        mAdditionButton = (Button) this.findViewById(R.id.addition_button);
        mSubtractButton = (Button) this.findViewById(R.id.subtract_button);
        mMrButton = (Button) this.findViewById(R.id.mr_button);
        mCButton = (Button) this.findViewById(R.id.c_button);
        mNegativeButton = (Button) this.findViewById(R.id.negative_button);
        mDivisionButton = (Button) this.findViewById(R.id.division_button);
        mMultiplicationButton = (Button) this.findViewById(R.id.multiplication_button);
        mMAddButton = (Button) this.findViewById(R.id.m_add_button);
        mMSubButton = (Button) this.findViewById(R.id.m_sub_button);

        mOneButton = (Button) this.findViewById(R.id.one_button);
        mTwoButton = (Button) this.findViewById(R.id.two_button);
        mThreeButton = (Button) this.findViewById(R.id.three_button);
        mFourButton = (Button) this.findViewById(R.id.four_button);
        mFiveButton = (Button) this.findViewById(R.id.five_button);
        mSixButton = (Button) this.findViewById(R.id.six_button);
        mSevenButton = (Button) this.findViewById(R.id.seven_button);
        mEightButton = (Button) this.findViewById(R.id.eight_button);
        mNiceButton = (Button) this.findViewById(R.id.nice_button);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mc_button:
                break;
            case R.id.addition_button:
                break;
            case R.id.subtract_button:
                break;
            case R.id.mr_button:
                break;
            case R.id.c_button:
                break;
            case R.id.negative_button:
                break;
            case R.id.division_button:
                break;
            case R.id.multiplication_button:
                break;
            case R.id.m_add_button:
                break;
            case R.id.m_sub_button:
                break;
            case R.id.one_button:
                break;
            case R.id.two_button:
                break;
            case R.id.three_button:
                break;
            case R.id.four_button:
                break;
            case R.id.five_button:
                break;
            case R.id.six_button:
                break;
            case R.id.seven_button:
                break;
            case R.id.eight_button:
                break;
            case R.id.nice_button:
                break;
        }
    }
}
