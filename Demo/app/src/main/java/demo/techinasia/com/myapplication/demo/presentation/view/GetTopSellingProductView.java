package demo.techinasia.com.myapplication.demo.presentation.view;

import demo.techinasia.com.myapplication.demo.data.model.ProductRecommendation;

/**
 * Created by fandygotama on 8/5/17.
 * With special thanks to (Alphabetical Order):
 * - Aldy Chrissandy (Indonesia),
 * - Antoni Tirta Riady (Indonesia),
 * - Arman Hendra Harnanda (Indonesia),
 * - Jessa Cahilig (Philippines),
 * - Remerico Cruz (Philippines),
 * - Steven Lewi (Indonesia),
 * For being great teams and excellent collaborators, and
 * also to Rendra Toro for being our Manager.
 * OLX SEA MOBILE APPS TEAM 2016, YOU GUYS ARE AWESOME!!
 */

public interface GetTopSellingProductView extends View {

    void showLoading();
    void hideLoading();

    void onProductAvailable(ProductRecommendation productRecommendation);
    void onProductNotAvailable();
}
