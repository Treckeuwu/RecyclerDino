package com.example.recycleview.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;
import com.example.recycleview.models.Dinosaurio;

import java.util.List;

public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioAdapter.DinosaurioViewHolder>{
    private List<Dinosaurio> dinosaurioslista;

    public DinosaurioAdapter(List<Dinosaurio> dinosaurioslista) {
        this.dinosaurioslista = dinosaurioslista;
    }

    @NonNull
    @Override
    public DinosaurioAdapter.DinosaurioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemdino, parent, false);

        return new DinosaurioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DinosaurioAdapter.DinosaurioViewHolder holder, int position) {
        // paso 4
        holder.setData(dinosaurioslista.get(position));



    }

    @Override
    public int getItemCount() {
        return dinosaurioslista.size();
    }

    public class DinosaurioViewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre,txttipo,txtdescripcion;
        ImageView imgdino;
        Dinosaurio dino;
        public DinosaurioViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.txtnombre);
            txttipo = itemView.findViewById(R.id.txttipo);
            txtdescripcion = itemView.findViewById(R.id.txtdescripcion);
            imgdino = itemView.findViewById(R.id.imgdino);
        }

        public void setData(Dinosaurio dinosaurio) {
            //chido para obtener datos y pasarselas a la variable global dino
            dino=dinosaurio;
            txtnombre.setText(dino.getNombre());
            txttipo.setText(dino.getTipo());
            txtdescripcion.setText(dino.getDescripcion());
            imgdino.setImageResource(dino.getImagen());
        }
    }
}
