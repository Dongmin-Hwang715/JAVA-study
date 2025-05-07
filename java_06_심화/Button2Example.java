package java_06_심화;

public class Button2Example {
    public static void main(String[] args) {
        Button2 btnOk = new Button2();

        btnOk.setClickListener(new Button2.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        btnOk.click();

        Button2 btnCancel = new Button2();

        btnCancel.setClickListener(new Button2.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        btnCancel.click();
    }
}
