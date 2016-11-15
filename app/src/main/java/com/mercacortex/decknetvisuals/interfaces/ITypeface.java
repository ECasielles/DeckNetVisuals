package com.mercacortex.decknetvisuals.interfaces;


import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;


public interface ITypeface {

    String typefaceName = "ROBOTECH GP.ttf";

    /**
     * This method takes all TextViews (including CheckBoxes etc.) and TextInputLayouts
     * to set their text font to our custom font.
     * For Buttons this doesn't work directly, so first one must access
     * the LinearLayout it is contained in.
     * THIS IS A TEMPORARY SOLUTION.
     */

    class MyTypeface {

        public static void setActivityTypeface (ViewGroup layout, AssetManager assetManager){

            Typeface typefaceCustom = Typeface.createFromAsset(assetManager, typefaceName);

            for (int i = 0; i < layout.getChildCount(); i++) {
                setViewTypeface(layout.getChildAt(i), assetManager);
            }
        }

        public static void setViewTypeface (View view, AssetManager assetManager) {

            Typeface typefaceCustom = Typeface.createFromAsset(assetManager, typefaceName);

            if(view instanceof TextView)
                ((TextView) view).setTypeface(typefaceCustom);
            else if (view instanceof TextInputLayout)
                ((TextInputLayout) view).setTypeface(typefaceCustom);
            else if (view instanceof LinearLayout)
                for (int j = 0; j < ((LinearLayout)view).getChildCount(); j++) {
                    View llView = ((LinearLayout)view).getChildAt(j);
                    if (llView instanceof Button)
                        ((Button)llView).setTypeface(typefaceCustom);
                    else if (llView instanceof TextView)
                        ((TextView)llView).setTypeface(typefaceCustom);
                }
        }
    }

}
