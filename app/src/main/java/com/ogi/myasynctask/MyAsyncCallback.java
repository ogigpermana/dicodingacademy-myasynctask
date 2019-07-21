package com.ogi.myasynctask;

public interface MyAsyncCallback {
    void onPreExecute();
    void onPostExecute(String text);
}
