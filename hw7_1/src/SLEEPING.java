class SLEEPING implements LightState {
    public void on_button_pushed(Light light) {
        System.out.println("취침등 상태");
        light.setState(new ON()); // ON 상태로 전환
        System.out.println("Light On Back!!");
    }

    public void off_button_pushed(Light light) {
        System.out.println("Light Off!");
        light.setState(new OFF()); // OFF 상태로 전환
    }
}
