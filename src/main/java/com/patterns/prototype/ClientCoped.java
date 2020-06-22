package com.patterns.prototype;

public class ClientCoped implements ICopy<ClientCoped>, Cloneable{

    private long idClientCoped;

    private String nameClientCoped;

    @Override
    public ClientCoped copy() {
        ClientCoped clientCoped = new ClientCoped();
        clientCoped.idClientCoped = this.idClientCoped;
        clientCoped.nameClientCoped = this.nameClientCoped;
        return clientCoped;
    }

    public ClientCoped clone() throws CloneNotSupportedException{
        return (ClientCoped)super.clone();
    }

    public long getIdClientCoped() {
        return idClientCoped;
    }

    public void setIdClientCoped(long idClientCoped) {
        this.idClientCoped = idClientCoped;
    }

    public String getNameClientCoped() {
        return nameClientCoped;
    }

    public void setNameClientCoped(String nameClientCoped) {
        this.nameClientCoped = nameClientCoped;
    }
}
