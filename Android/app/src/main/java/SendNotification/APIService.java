package com.food_on.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAJ5QiKMc:APA91bHsBMJYAuRJ4YyKK6NHz5CS-9tkDnbBob-hEsKIn47O_DZFRjdL45YCyP3SkIMzFxIuOaiav8Pr5q84wQT8qoY46PfAWZUE0ACMbXX2S-9YvVqMsM3ClpTko92qcaFSlsL6IRYg"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
