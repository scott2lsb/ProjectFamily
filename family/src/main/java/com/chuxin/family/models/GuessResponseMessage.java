package com.chuxin.family.models;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

public class GuessResponseMessage  extends Message{
	private static final String TAG_TEXT = "text";
	
	public GuessResponseMessage(JSONObject data, Context context) {
		super(data, context);
		mData = data;
		mContext = context;
	}
	
	@Override
	public int getType() {
		return MESSAGE_TYPE_GUESS_RESPONSE;
	}

	public String getText() {
		try {
			return mData.getString(TAG_TEXT);
		} catch (JSONException e) {
			e.printStackTrace();
			assert(false);
		}
		return null;
	}
}
