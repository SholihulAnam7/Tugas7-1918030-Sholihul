package com.example.tugas7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Kaos> Kaos;
    public CustomListAdapter(Activity activity, List<Kaos> Kaos) {
        this.activity = activity;
        this.Kaos = Kaos;
    }
    @Override
    public int getCount() {
        return Kaos.size();
    }
    @Override
    public Object getItem(int location) {
        return Kaos.get(location);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.custom_list, null);
        TextView nama = (TextView)
                convertView.findViewById(R.id.text_nama);
        TextView kelas = (TextView)
                convertView.findViewById(R.id.text_jenis);
        ImageView imageView = (ImageView)
                convertView.findViewById(R.id.iconid);
        Kaos k = Kaos.get(position);
        nama.setText("Nama Bahan : "+ k.get_nama());
        kelas.setText("Jenis Bahan : "+ k.get_jenis());
        return convertView;
    }
}

