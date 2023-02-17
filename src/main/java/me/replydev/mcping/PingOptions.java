package me.replydev.mcping;

public class PingOptions {

    private String hostname;
    private int port;
    private int timeout;
    //private String charset = "UTF-8";

    String getHostname() {
        return this.hostname;
    }

    public PingOptions setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    int getPort() {
        return this.port;
    }

    public PingOptions setPort(int port) {
        this.port = port;
        return this;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public PingOptions setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

}
