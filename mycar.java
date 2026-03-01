public class mycar {
    String model;
    int year;
    String color;
    mycar(String mModel , int yYear , String cColor){
        mModel = model;
        yYear = year;
        cColor = color;

    }
    String new_color = "blue";
    void start_engine(){
        System.out.println("Engine started");
    }
    void change_color(){
        color = new_color;
        System.out.println("New colour is "+ new_color );
    }
}
