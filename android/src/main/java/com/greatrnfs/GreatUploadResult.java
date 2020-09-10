package com.greatrnfs;

import com.facebook.react.bridge.WritableMap;

public class GreatUploadResult {
    public int statusCode;
    public WritableMap headers;
    public Exception exception;
    public String body;
}
