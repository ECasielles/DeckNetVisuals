package com.mercacortex.decknetvisuals.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mercacortex.decknetvisuals.model.GameCard;

import java.util.ArrayList;


public class CardAdapterRecycler {

    private ArrayList<GameCard> gameCardArrayList;
    private Context context;
    private static boolean ASC = true;

    public CardAdapterRecycler(Context context) {
        this.context = context;

        // TODO: Either list object class or migrate to adapter
        // No presenter object is needed since cards are extracted directly from the XML file
        //this.gameCardArrayList = new ArrayList<GameCard>((()))
    }



    public static class CardViewHolder extends RecyclerView.ViewHolder{

        // Card attributes showed in dropdown list
        private TextView txvCardName, txvCardText, txvCardQtty;

        // Inherited constructor matching super
        public CardViewHolder(View itemView) {
            super(itemView);
            // TODO: Card view layout
            //txvCardName = (TextView) itemView.findViewById()
        }


    }
}
