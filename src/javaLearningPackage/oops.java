package javaLearningPackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class oops {
	public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
		String url = "https://api.bitfinex.com/v1/trades/BTCUSD";

		URLConnection connection = new URL(url).openConnection();
		connection.setRequestProperty("Accept-Charset", "UTF-8");
		InputStream response = (InputStream) connection.getInputStream();
		System.out.println(response);

		double dollars_price = 0;
		try (Scanner scanner = new Scanner(response)){
			String responseBody =scanner.useDelimiter("\\A").next();
			System.out.println(responseBody);


			//JSONObject jsonobj = new JSONObject(responseBody);

			JSONArray jsonArray = new JSONArray(responseBody);
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject explrObject = jsonArray.getJSONObject(i);
				String type = (String) explrObject.get("type");
				//System.out.println(type);

				//System.out.println(explrObject);
				System.out.println(type.equals("sell"));
				if(type.equals("sell"))
				{
					String price = (String) explrObject.get("price");
					dollars_price = Double.parseDouble(price);
					//System.out.println(dollars_price); 
					break;
				}

			}

		}
		double inr_price = dollars_price * 64.05;
		System.out.println(inr_price);
	}
}


















