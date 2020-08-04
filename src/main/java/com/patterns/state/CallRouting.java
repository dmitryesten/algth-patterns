package com.patterns.state;

public class CallRouting {

    private IState state;
    private String phone;

    public CallRouting (String phone) {
        this(phone, new NoRouteState());
    }

    public CallRouting(String phone, IState state){
        this.phone = phone;
        this.state = new NoRouteState();
    }

    public void setCallRoutingState(IState state){
        this.state = state;
    }
    public IState getState() {
        return state;
    }

    public void processCheckCallRouting() {
        state.checkSentPhone(this);
    }

    public String getPhone() {
        return phone;
    }

}
