package com.example.mvvm_architecture_pattern.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvvm_architecture_pattern.R;
import com.example.mvvm_architecture_pattern.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    User[] users;

    public UserAdapter(User[] users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.user_list, parent, false);


        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        holder.name.setText(users[position].getLogin());
        holder.id.setText(String.valueOf(users[position].getId()));
        holder.repos.setText(users[position].getReposUrl());


        Glide.with(holder.avatarImg.getContext()).load(users[position].getAvatarUrl()).into(holder.avatarImg);


    }

    @Override
    public int getItemCount() {
        return users.length;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        ImageView avatarImg;
        TextView name, id, repos;


        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            avatarImg = itemView.findViewById(R.id.ivavatarID);
            name = itemView.findViewById(R.id.tvNameID);
            id = itemView.findViewById(R.id.tvID);
            repos = itemView.findViewById(R.id.tvrepoID);


        }
    }

}
