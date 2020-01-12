package com.olair.calculator.panel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.olair.calculator.MainActivity;
import com.olair.calculator.R;
import com.olair.calculator.data.Element;
import com.olair.calculator.data.source.ElementsDataSource;
import com.olair.calculator.data.source.local.ElementsLocalDataSource;

import java.util.List;

/**
 * Create by oLair on 2020/1/11.
 */
public class PanelFragment extends Fragment {

    public static PanelFragment newInstance() {
        PanelFragment fragment = new PanelFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    private RecyclerView recyElementView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final List<Element> elements = new ElementsLocalDataSource().getElements();

        View view = inflater.inflate(R.layout.fragment_panel, container, false);
        recyElementView = view.findViewById(R.id.act_main_recy);
        recyElementView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        recyElementView.setAdapter(new RecyclerView.Adapter<ViewHolder>() {
            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                return new ViewHolder(inflater.inflate(R.layout.item_element_act_main, parent, false));
            }

            @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                holder.tvMain.setText(elements.get(position).getMainElement());
            }

            @Override
            public int getItemCount() {
                return elements.size();
            }
        });
        return view;
    }


    private class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvMain;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMain = itemView.findViewById(R.id.element_main);
        }
    }

}
