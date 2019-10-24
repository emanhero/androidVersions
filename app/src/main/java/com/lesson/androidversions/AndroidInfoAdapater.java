package com.lesson.androidversions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class AndroidInfoAdapater extends ArrayAdapter<AndroidInfo>
{
    Context mContext;
    int mResource;
    public AndroidInfoAdapater(Context context, int resource, List<AndroidInfo> objects)
    {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        int image = getItem(position).getLogo();
        String androidName = getItem(position).getName();
        String androidVersion = getItem(position).getVersion();
        String apiLevel = getItem(position).getLevel();
        String releaseDate = getItem(position).getDate();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);
        TextView tvAndroidName = convertView.findViewById(R.id.tvAndroidName);
        TextView tvAndroidVersion = convertView.findViewById(R.id.tvAndroidVersion);
        TextView tvApiLevel = convertView.findViewById(R.id.tvApiLevel);
        TextView tvReleaseDate = convertView.findViewById(R.id.tvReleaseData);
        ImageView ivLogo = convertView.findViewById(R.id.ivLogo);
        tvAndroidName.setText(androidName);
        tvAndroidVersion.setText(androidVersion);
        tvApiLevel.setText(apiLevel);
        tvReleaseDate.setText(releaseDate);
        ivLogo.setImageResource(image);
        return convertView;
        //     return super.getView(position, convertView, parent);
    }
}
