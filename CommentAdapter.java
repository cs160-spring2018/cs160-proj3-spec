package com.example.paigeplander.maps_demo;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private ArrayList<Comment> mComments;

    // Provide a suitable constructor (depends on the kind of dataset)
    public CommentAdapter(Context context, ArrayList<Comment> comments) {
        mContext = context;
        mComments = comments;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view

        View view = LayoutInflater.from(mContext).inflate(R.layout.comment_bubble_layout, parent, false);
        return new CommentViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        Comment comment = mComments.get(position);
        ((CommentViewHolder) holder).bind(comment);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mComments.size();
    }
}

class CommentViewHolder extends RecyclerView.ViewHolder {

    // each data item is just a string in this case
    public RelativeLayout mCommentBubbleLayout;
    public TextView mUsernameTextView;
    public TextView mDateTextView;
    public TextView mCommentTextView;

    public CommentViewHolder(View itemView) {
        super(itemView);
        mCommentBubbleLayout = itemView.findViewById(R.id.comment_cell_layout);
        mUsernameTextView = mCommentBubbleLayout.findViewById(R.id.username_text_view);
        mDateTextView = mCommentBubbleLayout.findViewById(R.id.date_text_view);
        mCommentTextView = mCommentBubbleLayout.findViewById(R.id.comment_text_view);
    }

    void bind(Comment comment) {
        mUsernameTextView.setText(comment.username);
        mDateTextView.setText("posted " + comment.elapsedTimeString() + " ago");
        mCommentTextView.setText(comment.text);
    }
}
