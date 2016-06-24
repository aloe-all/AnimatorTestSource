package com.crg.animatortest;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView mTextView;
    private Button mButton;
    private ObjectAnimator objectAnimator;
    private AnimatorSet mAnimatorSet;
    private  Animator animator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv);
        mButton = (Button) findViewById(R.id.bt);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mAnimatorSet.start();
                animator.start();
            }
        });

//        ValueAnimator valueAnimator = ValueAnimator.ofInt(1, 3);
//        valueAnimator.setDuration(300);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                int currentValue = (int) animation.getAnimatedValue();
//
//                Log.d(TAG, ">>>>>>>>>>currentValue: " + currentValue);
//            }
//        });
//        valueAnimator.setStartDelay(3000);
//        valueAnimator.setRepeatCount(1);
//        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
//        valueAnimator.start();

//        float currentTanslationX = mTextView.getTranslationX();
//        objectAnimator = ObjectAnimator.ofFloat(mTextView, "scaleX", 1f, 4f, 0f, 1f);
//
//        mAnimatorSet = new AnimatorSet();
//        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(mTextView, "alpha", 1f, 0f, 1f);
//        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(mTextView, "rotation", 0f, 360f);
//        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(mTextView, "translationY", currentTanslationX, -1000f, currentTanslationX);
//        mAnimatorSet.play(objectAnimator3).with(objectAnimator2).before(objectAnimator1).after(objectAnimator);
//        mAnimatorSet.setDuration(5000);
//        mAnimatorSet.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//
//        mAnimatorSet.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                super.onAnimationStart(animation);
//            }
//        });

        animator = AnimatorInflater.loadAnimator(this, R.animator.anim_file);
        animator.setTarget(mTextView);

    }
}
