package com.example.abhi.volley.network;

import com.example.abhi.volley.utils.CommonUtilities;

/**
 * Created by Abhi on 24-06-2017.
 */

public interface OnWebServiceResult {
    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
