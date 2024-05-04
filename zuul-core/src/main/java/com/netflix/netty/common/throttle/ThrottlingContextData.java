package com.netflix.netty.common.throttle;
public class ThrottlingContextData{
    private io.netty.channel.ChannelHandlerContext ctx;

    public io.netty.channel.ChannelHandlerContext getCtx(){
        return ctx;
    }

    public void setCtx(io.netty.channel.ChannelHandlerContext ctx){
        this.ctx=ctx;
    }

    private com.netflix.zuul.stats.status.StatusCategory nfStatus;

    public com.netflix.zuul.stats.status.StatusCategory getNfStatus(){
        return nfStatus;
    }

    public void setNfStatus(com.netflix.zuul.stats.status.StatusCategory nfStatus){
        this.nfStatus=nfStatus;
    }

    private java.lang.String reason;

    public java.lang.String getReason(){
        return reason;
    }

    public void setReason(java.lang.String reason){
        this.reason=reason;
    }

    private io.netty.handler.codec.http.HttpRequest request;

    public io.netty.handler.codec.http.HttpRequest getRequest(){
        return request;
    }

    public void setRequest(io.netty.handler.codec.http.HttpRequest request){
        this.request=request;
    }

    private java.lang.Integer injectedLatencyMillis;

    public java.lang.Integer getInjectedLatencyMillis(){
        return injectedLatencyMillis;
    }

    public void setInjectedLatencyMillis(java.lang.Integer injectedLatencyMillis){
        this.injectedLatencyMillis=injectedLatencyMillis;
    }

    public ThrottlingContextData(io.netty.channel.ChannelHandlerContext ctx,com.netflix.zuul.stats.status.StatusCategory nfStatus,java.lang.String reason,io.netty.handler.codec.http.HttpRequest request,java.lang.Integer injectedLatencyMillis){
        this.ctx=ctx;
        this.nfStatus=nfStatus;
        this.reason=reason;
        this.request=request;
        this.injectedLatencyMillis=injectedLatencyMillis;
    }
}

