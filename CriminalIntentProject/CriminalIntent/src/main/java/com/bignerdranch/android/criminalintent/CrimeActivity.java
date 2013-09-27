package com.bignerdranch.android.criminalintent;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected CrimeFragment createFragment() {
        return new CrimeFragment();
    }
}
