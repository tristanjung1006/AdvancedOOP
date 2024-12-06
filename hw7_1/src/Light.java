public class Light {
    private LightState state;

    public Light() {
        state = new OFF(); // 초기 상태는 OFF
    }

    public void setState(LightState state) {
        this.state = state;
    }

    public void on_button_pushed() {
        state.on_button_pushed(this);
    }

    public void off_button_pushed() {
        state.off_button_pushed(this);
    }
}
