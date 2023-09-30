package api;

import okhttp3.*;

import java.io.IOException;

public class ApiCall {

    private static final String API_TOKEN = System.getenv("API_TOKEN");

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url("https://haveibeenpwned.com/api/v3/breachedaccount/alexmacri04@gmail.com")
                .addHeader("hibp-api-key", API_TOKEN)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());

    }

}
