package org.albianj.loader.logging;

public interface IAlbianLoggerAppender {
//    void open();

    void write(String src);

    void flush();

    void close();

    public String getMaxFilesize();

    public void setMaxFilesize(String sMaxFilesize) ;
}
