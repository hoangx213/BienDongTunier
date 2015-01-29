package de.biendong.hoang.biendongtunier.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import de.biendong.hoang.biendongtunier.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeamCommentFragment extends Fragment {

    WebView webView;

    public TeamCommentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_team_comment, container, false);
        webView = (WebView) v.findViewById(R.id.commentWebView);
        webView.setWebViewClient(new FaceBookClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);
//        webView.getSettings().setSupportZoom(true);
//        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("http://flyinguwe.hydaras.de/video/detail/12");
//        webView.loadDataWithBaseURL("http://www.example.com", html, "text/html", null, null);
//        webView.loadUrl("file:///android_asset/facebook.html");

        return v;
    }

//    final class MyChromeClient extends WebChromeClient {
//        @Override
//        public boolean onCreateWindow(WebView view, boolean dialog,
//                                      boolean userGesture, Message resultMsg) {
//            childView = new WebView(SmCommentTestActivity.this);
//            childView.getSettings().setJavaScriptEnabled(true);
//            childView.getSettings().setSupportZoom(true);
//            childView.getSettings().setBuiltInZoomControls(true);
//            childView.setWebViewClient(new FaceBookClient());
//            childView.setWebChromeClient(this);
//            childView.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
//
//
//            parentLayout.addView(childView);
//
//
//            childView.requestFocus();
//            webView.setVisibility(View.GONE);
//
//          /*I think this is the main part which handles all the log in session*/
//            WebView.WebViewTransport transport = (WebView.WebViewTransport) resultMsg.obj;
//            transport.setWebView(childView);
//            resultMsg.sendToTarget();
//            return true;
//        }
//    }

    private class FaceBookClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.i("REQUEST URL", url);
            return false;
        }
    }
}