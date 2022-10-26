package org.night.HttpServer;

import java.util.Map;

public class Request {
    private String method;
    private String uri;
    private String version;
    private Map<String, String> header;
    private String message;
}
