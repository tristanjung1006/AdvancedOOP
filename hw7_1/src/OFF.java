class OFF implements LightState {
    public void on_button_pushed(Light light) {
        System.out.println("Light On!!");
        light.setState(new SLEEPING()); // SLEEPING 상태로 전환
    }

    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }
}
