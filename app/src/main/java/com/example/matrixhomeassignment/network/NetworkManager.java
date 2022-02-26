package com.example.matrixhomeassignment.network;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.example.matrixhomeassignment.pojo.Fruits;
import com.example.matrixhomeassignment.utils.LoggerUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
/*
 A network manager singleton to manage all network traffic.
 NetworkManager is the only class is JAVA. I admit I had some problems with the T generic type and the Any type with Kotlin
 so I've decided to write this class in JAVA so you will see my writing skills in JAVA too
 */
public class NetworkManager {
    private static final String TAG = NetworkManager.class.getSimpleName();
    private static volatile NetworkManager _instance;
    private final ApiService _apiService;

    public void getData(NetworkManagerCallback<Fruits> callback) {
        enqueueUserRequest(_apiService.getData(), callback, "getFruits");
    }


    private void enqueueUserRequest(Call requestCall, NetworkManagerCallback callback, String logTag) {
        LoggerUtils.INSTANCE.info(TAG, logTag);
        // enqueue the call
        //noinspection unchecked
        requestCall.enqueue(new Callback() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) {
                LoggerUtils.INSTANCE.info(TAG, logTag + ": Result: " + response.isSuccessful() + " (" + response.code() + ")");
                if (response.isSuccessful()) {
                    // if successful return result to callback
                    if (callback != null) {
                        callback.onSuccess(response.body());
                    }
                }
                // if unauthorized
                else {
                    String errorBody = response.message();
                    LoggerUtils.INSTANCE.error(TAG, "onApiFailure " + errorBody);
                    callback.onApiFailure(errorBody);
                }
            }

            @Override
            public void onFailure(@NonNull Call call, @NonNull Throwable t) {
                String errorBody = t.getMessage();
                LoggerUtils.INSTANCE.error(TAG, logTag + " - error: " + errorBody);
                if (callback != null) {
                    callback.onNetworkFailure(errorBody);
                }
            }
        });
    }

    public static class HeaderInterceptor implements Interceptor {
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            okhttp3.Response response;
            Request.Builder requestBuilder = chain.request().newBuilder();
            Request request = requestBuilder
                    .build();
            response = chain.proceed(request);
            LoggerUtils.INSTANCE.info(TAG, "HeaderInterceptor response: " + response);
            return response;
        }
    }


    // Thread safe instance initialization
    public static NetworkManager getInstance() {
        if (_instance == null) {
            synchronized (NetworkManager.class) {
                if (_instance == null) {
                    _instance = new NetworkManager();
                }
            }
        }
        return _instance;
    }

    private NetworkManager() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HeaderInterceptor()).build();
        Retrofit retrofit = (new Retrofit.Builder())
                .baseUrl(Constants.BASE_URL)
                .client(client)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        _apiService = retrofit.create(ApiService.class);
    }

    public interface NetworkManagerCallback<T> {
        void onSuccess(T response);

        void onApiFailure(String errorBody);

        void onNetworkFailure(String errorBody);
    }
}
