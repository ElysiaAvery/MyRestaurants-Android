package com.example.guest.myrestaurants.util;

/**
 * Created by Guest on 12/11/16.
 */
public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
