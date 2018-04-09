package com.exercise.udacity.createjavalibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainActivityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainActivityFragment extends Fragment {

    private static final String FROM_JOKE_SMITH = "jokeSmith";
    private static final String FROM_JOKE_WIZARD = "jokeWizard";

    private String mJokeSmith;
    private String mJokeWizard;

    public MainActivityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param fromJokeSmith Parameter 1.
     * @return A new instance of fragment MainActivityFragment.
     */
    public static MainActivityFragment newInstance(String fromJokeSmith, String fromJokeWizard) {
        MainActivityFragment fragment = new MainActivityFragment();
        Bundle args = new Bundle();
        args.putString(FROM_JOKE_WIZARD, fromJokeSmith);
        args.putString(FROM_JOKE_SMITH, fromJokeWizard);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mJokeSmith = getArguments().getString(FROM_JOKE_SMITH);
            mJokeWizard = getArguments().getString(FROM_JOKE_WIZARD);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView tvJokeSmith = getActivity().findViewById(R.id.tv_joke_smith);
        tvJokeSmith.setText(mJokeSmith);

        TextView tvJokeWizard = getActivity().findViewById(R.id.tv_joke_wizard);
        tvJokeWizard.setText(mJokeWizard);
    }
}
