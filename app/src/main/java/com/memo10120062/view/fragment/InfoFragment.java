package com.memo10120062.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.memo10120062.R;
import com.memo10120062.adapter.InfoFragmentAdapter;
import com.memo10120062.view.activity.MainActivity;
import java.util.ArrayList;
import java.util.List;

/**
 * 10120062
 * Ahmad Sanosi
 * IF-2
 */
public class InfoFragment extends Fragment {
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_info, container, false);

        viewPager = root.findViewById(R.id.view_pager_info);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();
//        mainActivity.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        List<Fragment> list = new ArrayList<>();
        list.add(new InfoFragment1());

        pagerAdapter = new InfoFragmentAdapter(requireActivity().getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
    }
}

