package java_06_심화;

public class Button1Example {
    public static void main(String[] args) {
        Button1 btnOk = new Button1();

        btnOk.setClickListener(new Button1.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        btnOk.click();
    }
}
