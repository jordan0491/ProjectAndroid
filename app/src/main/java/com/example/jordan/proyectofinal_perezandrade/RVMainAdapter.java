package com.example.jordan.proyectofinal_perezandrade;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jordan on 29/06/2017.
 */

public class RVMainAdapter extends RecyclerView.Adapter<RVMainAdapter.RVMainAdapterViewHolder> {
    private List<Persona> mLstPersona = new ArrayList<>();

    public void add(Persona persona){
        mLstPersona.add(persona);
        notifyItemInserted(mLstPersona.size()-1);
    }

    @Override
    public RVMainAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_persona,parent,false);
        RVMainAdapterViewHolder rvMainAdapterViewHolder = new RVMainAdapterViewHolder(view);
        return rvMainAdapterViewHolder;
    }

    @Override
    public void onBindViewHolder(RVMainAdapterViewHolder holder, int position) {
        Persona persona = mLstPersona.get(position);
        holder.itemView.setTag(persona);
        holder.tvMainItemNombre.setText(persona.getNombre());
        holder.tvMainItemApellido.setText(persona.getApellido());
        holder.tvMainItemDireccion.setText(persona.getDireccion());
        holder.tvMainItemEdad.setText(String.valueOf(persona.getEdad()));
        holder.tvMainItemDocumento.setText(persona.getDocumento());
        holder.tvMainItemNroDocumento.setText(String.valueOf(persona.getNumDocumento()));
    }

    @Override
    public int getItemCount() {
        return mLstPersona.size();
    }

    static class RVMainAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView tvMainItemNombre, tvMainItemApellido, tvMainItemDireccion, tvMainItemEdad, tvMainItemDocumento,
                tvMainItemNroDocumento;;

        public RVMainAdapterViewHolder(View itemView) {
            super(itemView);
            tvMainItemNombre = (TextView) itemView.findViewById(R.id.tvMainItemNombre);
            tvMainItemApellido = (TextView) itemView.findViewById(R.id.tvMainItemApellido);
            tvMainItemDireccion = (TextView) itemView.findViewById(R.id.tvMainItemDireccion);
            tvMainItemEdad = (TextView) itemView.findViewById(R.id.tvMainItemEdad);
            tvMainItemDocumento = (TextView) itemView.findViewById(R.id.tvMainItemDocumento);
            tvMainItemNroDocumento = (TextView) itemView.findViewById(R.id.tvMainItemNroDocumento);
        }
    }
}
