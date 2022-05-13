package com.example.witssocial.Profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import com.example.witssocial.R;

public class ProfileFragment extends Fragment {
    TextView profilename,biography,fullName;
    ImageView profilepic,picture;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        profilepic = view.findViewById(R.id.image_profile);
        profilename = view.findViewById(R.id.username);
        biography = view.findViewById(R.id.bio);
        fullName = view.findViewById(R.id.fullname);
        picture = view.findViewById(R.id.imageView4);

        //Do something from here


        return view;
    }
}